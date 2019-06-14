package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Fullscreen extends js.Object

@JSImport("cesium", "Fullscreen")
@js.native
object Fullscreen extends js.Object {
  @js.native
  sealed trait changeEventName
    extends cesiumLib.cesiumMod.Fullscreen
  
  @js.native
  sealed trait element
    extends cesiumLib.cesiumMod.Fullscreen
  
  @js.native
  sealed trait enabled
    extends cesiumLib.cesiumMod.Fullscreen
  
  @js.native
  sealed trait errorEventName
    extends cesiumLib.cesiumMod.Fullscreen
  
  @js.native
  sealed trait fullscreen
    extends cesiumLib.cesiumMod.Fullscreen
  
  /* 1 */ val changeEventName: changeEventName with scala.Double = js.native
  /* 0 */ val element: element with scala.Double = js.native
  /* 3 */ val enabled: enabled with scala.Double = js.native
  /* 2 */ val errorEventName: errorEventName with scala.Double = js.native
  /* 4 */ val fullscreen: fullscreen with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.Fullscreen with scala.Double] = js.native
}

