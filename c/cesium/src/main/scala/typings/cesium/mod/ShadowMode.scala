package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShadowMode extends js.Object
@JSImport("cesium", "ShadowMode")
@js.native
object ShadowMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShadowMode with Double] = js.native
  
  @js.native
  sealed trait CAST_ONLY extends ShadowMode
  /* 0 */ @js.native
  object CAST_ONLY extends TopLevel[CAST_ONLY with Double]
  
  @js.native
  sealed trait DISABLED extends ShadowMode
  /* 1 */ @js.native
  object DISABLED extends TopLevel[DISABLED with Double]
  
  @js.native
  sealed trait ENABLED extends ShadowMode
  /* 2 */ @js.native
  object ENABLED extends TopLevel[ENABLED with Double]
  
  @js.native
  sealed trait RECEIVE_ONLY extends ShadowMode
  /* 3 */ @js.native
  object RECEIVE_ONLY extends TopLevel[RECEIVE_ONLY with Double]
}
