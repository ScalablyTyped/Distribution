package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.NearFarScalar")
@js.native
class NearFarScalar ()
  extends typings.cesium.mod.NearFarScalar {
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
}
object NearFarScalar {
  
  @JSGlobal("Cesium.NearFarScalar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def clone_(nearFarScalar: typings.cesium.mod.NearFarScalar): typings.cesium.mod.NearFarScalar = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(nearFarScalar.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.NearFarScalar]
  inline def clone_(nearFarScalar: typings.cesium.mod.NearFarScalar, result: typings.cesium.mod.NearFarScalar): typings.cesium.mod.NearFarScalar = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(nearFarScalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.NearFarScalar]
  
  /* static member */
  inline def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals_(left: Unit, right: typings.cesium.mod.NearFarScalar): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.NearFarScalar): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.NearFarScalar, right: typings.cesium.mod.NearFarScalar): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def pack(value: typings.cesium.mod.NearFarScalar, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: typings.cesium.mod.NearFarScalar, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.NearFarScalar = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.NearFarScalar]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.NearFarScalar = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.NearFarScalar]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.NearFarScalar): typings.cesium.mod.NearFarScalar = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.NearFarScalar]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.NearFarScalar): typings.cesium.mod.NearFarScalar = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.NearFarScalar]
}
