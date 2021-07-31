package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "NearFarScalar")
@js.native
class NearFarScalar () extends Packable {
  def this(near: Double) = this()
  def this(near: Double, nearValue: Double) = this()
  def this(near: Unit, nearValue: Double) = this()
  def this(near: Double, nearValue: Double, far: Double) = this()
  def this(near: Double, nearValue: Unit, far: Double) = this()
  def this(near: Unit, nearValue: Double, far: Double) = this()
  def this(near: Unit, nearValue: Unit, far: Double) = this()
  def this(near: Double, nearValue: Double, far: Double, farValue: Double) = this()
  def this(near: Double, nearValue: Double, far: Unit, farValue: Double) = this()
  def this(near: Double, nearValue: Unit, far: Double, farValue: Double) = this()
  def this(near: Double, nearValue: Unit, far: Unit, farValue: Double) = this()
  def this(near: Unit, nearValue: Double, far: Double, farValue: Double) = this()
  def this(near: Unit, nearValue: Double, far: Unit, farValue: Double) = this()
  def this(near: Unit, nearValue: Unit, far: Double, farValue: Double) = this()
  def this(near: Unit, nearValue: Unit, far: Unit, farValue: Double) = this()
  
  def clone(result: NearFarScalar): NearFarScalar = js.native
  
  def equals(): Boolean = js.native
  def equals(right: NearFarScalar): Boolean = js.native
  
  var far: Double = js.native
  
  var farValue: Double = js.native
  
  var near: Double = js.native
  
  var nearValue: Double = js.native
}
object NearFarScalar {
  
  @JSImport("cesium", "NearFarScalar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def clone_(nearFarScalar: NearFarScalar): NearFarScalar = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(nearFarScalar.asInstanceOf[js.Any]).asInstanceOf[NearFarScalar]
  @scala.inline
  def clone_(nearFarScalar: NearFarScalar, result: NearFarScalar): NearFarScalar = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(nearFarScalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[NearFarScalar]
  
  /* static member */
  @scala.inline
  def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: Unit, right: NearFarScalar): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: NearFarScalar): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def equals_(left: NearFarScalar, right: NearFarScalar): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def pack(value: NearFarScalar, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def pack(value: NearFarScalar, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): NearFarScalar = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[NearFarScalar]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): NearFarScalar = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[NearFarScalar]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: NearFarScalar): NearFarScalar = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[NearFarScalar]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: NearFarScalar): NearFarScalar = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[NearFarScalar]
}
