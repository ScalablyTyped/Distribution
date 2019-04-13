package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlendOption extends js.Object

@JSImport("cesium", "BlendOption")
@js.native
object BlendOption extends js.Object {
  @js.native
  sealed trait OPAQUE
    extends cesiumLib.cesiumMod.BlendOption
  
  @js.native
  sealed trait OPAQUE_AND_TRANSLUCENT
    extends cesiumLib.cesiumMod.BlendOption
  
  @js.native
  sealed trait TRANSLUCENT
    extends cesiumLib.cesiumMod.BlendOption
  
  val OPAQUE: OPAQUE with java.lang.String = js.native
  val OPAQUE_AND_TRANSLUCENT: OPAQUE_AND_TRANSLUCENT with java.lang.String = js.native
  val TRANSLUCENT: TRANSLUCENT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.BlendOption with java.lang.String] = js.native
}

