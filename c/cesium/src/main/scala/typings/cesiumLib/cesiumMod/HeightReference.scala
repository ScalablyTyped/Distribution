package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeightReference extends js.Object

@JSImport("cesium", "HeightReference")
@js.native
object HeightReference extends js.Object {
  @js.native
  sealed trait CLAMP_TO_GROUND
    extends cesiumLib.cesiumMod.HeightReference
  
  @js.native
  sealed trait NONE
    extends cesiumLib.cesiumMod.HeightReference
  
  @js.native
  sealed trait RELATIVE_TO_GROUND
    extends cesiumLib.cesiumMod.HeightReference
  
  val CLAMP_TO_GROUND: CLAMP_TO_GROUND with java.lang.String = js.native
  val NONE: NONE with java.lang.String = js.native
  val RELATIVE_TO_GROUND: RELATIVE_TO_GROUND with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.HeightReference with java.lang.String] = js.native
}

