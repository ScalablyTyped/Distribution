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
  
  /* 0 */ val OPAQUE: OPAQUE with scala.Double = js.native
  /* 1 */ val OPAQUE_AND_TRANSLUCENT: OPAQUE_AND_TRANSLUCENT with scala.Double = js.native
  /* 2 */ val TRANSLUCENT: TRANSLUCENT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.BlendOption with scala.Double] = js.native
}

