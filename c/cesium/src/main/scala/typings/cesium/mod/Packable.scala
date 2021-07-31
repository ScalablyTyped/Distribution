package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-unnecessary-class
@JSImport("cesium", "Packable")
@js.native
abstract class Packable () extends StObject
object Packable {
  
  @JSImport("cesium", "Packable")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def pack(value: js.Any, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def pack(value: js.Any, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  @JSImport("cesium", "Packable.packedLength")
  @js.native
  def packedLength: Double = js.native
  @scala.inline
  def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): Packable = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Packable]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): Packable = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Packable]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: js.Any): Packable = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Packable]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: js.Any): Packable = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Packable]
}
