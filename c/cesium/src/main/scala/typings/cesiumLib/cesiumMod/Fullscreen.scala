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
  
  val changeEventName: changeEventName with java.lang.String = js.native
  val element: element with java.lang.String = js.native
  val enabled: enabled with java.lang.String = js.native
  val errorEventName: errorEventName with java.lang.String = js.native
  val fullscreen: fullscreen with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.Fullscreen with java.lang.String] = js.native
}

