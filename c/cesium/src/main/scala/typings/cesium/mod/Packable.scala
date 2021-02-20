package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("cesium", "Packable.pack")
  @js.native
  def pack(value: js.Any, array: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("cesium", "Packable.pack")
  @js.native
  def pack(value: js.Any, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  
  /* static member */
  @JSImport("cesium", "Packable.packedLength")
  @js.native
  def packedLength: Double = js.native
  @scala.inline
  def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Packable.unpack")
  @js.native
  def unpack(array: js.Array[Double]): Packable = js.native
  @JSImport("cesium", "Packable.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: js.Any): Packable = js.native
  @JSImport("cesium", "Packable.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): Packable = js.native
  @JSImport("cesium", "Packable.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: js.Any): Packable = js.native
}
