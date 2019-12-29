package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendOption with Double] = js.native
  /* 0 */ @js.native
  object OPAQUE extends TopLevel[OPAQUE with Double]
  
  /* 1 */ @js.native
  object OPAQUE_AND_TRANSLUCENT extends TopLevel[OPAQUE_AND_TRANSLUCENT with Double]
  
  /* 2 */ @js.native
  object TRANSLUCENT extends TopLevel[TRANSLUCENT with Double]
  
}

