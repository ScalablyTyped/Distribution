package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ModelAnimationLoop extends js.Object

@JSImport("cesium", "ModelAnimationLoop")
@js.native
object ModelAnimationLoop extends js.Object {
  @js.native
  sealed trait MIRRORED_REPEAT
    extends cesiumLib.cesiumMod.ModelAnimationLoop
  
  @js.native
  sealed trait NONE
    extends cesiumLib.cesiumMod.ModelAnimationLoop
  
  @js.native
  sealed trait REPEAT
    extends cesiumLib.cesiumMod.ModelAnimationLoop
  
  val MIRRORED_REPEAT: MIRRORED_REPEAT with java.lang.String = js.native
  val NONE: NONE with java.lang.String = js.native
  val REPEAT: REPEAT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.ModelAnimationLoop with java.lang.String] = js.native
}

