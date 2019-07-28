package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlendOption extends js.Object

@JSImport("cesium", "BlendOption")
@js.native
object BlendOption extends js.Object {
  @js.native
  sealed trait OPAQUE extends BlendOption
  
  @js.native
  sealed trait OPAQUE_AND_TRANSLUCENT extends BlendOption
  
  @js.native
  sealed trait TRANSLUCENT extends BlendOption
  
  /* 0 */ val OPAQUE: typings.cesium.cesiumMod.BlendOption.OPAQUE with Double = js.native
  /* 1 */ val OPAQUE_AND_TRANSLUCENT: typings.cesium.cesiumMod.BlendOption.OPAQUE_AND_TRANSLUCENT with Double = js.native
  /* 2 */ val TRANSLUCENT: typings.cesium.cesiumMod.BlendOption.TRANSLUCENT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendOption with Double] = js.native
}

