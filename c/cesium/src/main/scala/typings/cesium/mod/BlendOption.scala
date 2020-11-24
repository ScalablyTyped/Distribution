package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlendOption extends js.Object
@JSImport("cesium", "BlendOption")
@js.native
object BlendOption extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendOption with Double] = js.native
  
  @js.native
  sealed trait OPAQUE extends BlendOption
  /* 0 */ @js.native
  object OPAQUE extends TopLevel[OPAQUE with Double]
  
  @js.native
  sealed trait OPAQUE_AND_TRANSLUCENT extends BlendOption
  /* 1 */ @js.native
  object OPAQUE_AND_TRANSLUCENT extends TopLevel[OPAQUE_AND_TRANSLUCENT with Double]
  
  @js.native
  sealed trait TRANSLUCENT extends BlendOption
  /* 2 */ @js.native
  object TRANSLUCENT extends TopLevel[TRANSLUCENT with Double]
}
