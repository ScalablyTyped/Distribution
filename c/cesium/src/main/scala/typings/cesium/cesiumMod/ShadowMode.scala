package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShadowMode extends js.Object

@JSImport("cesium", "ShadowMode")
@js.native
object ShadowMode extends js.Object {
  @js.native
  sealed trait CAST_ONLY extends ShadowMode
  
  @js.native
  sealed trait DISABLED extends ShadowMode
  
  @js.native
  sealed trait ENABLED extends ShadowMode
  
  @js.native
  sealed trait RECEIVE_ONLY extends ShadowMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShadowMode with Double] = js.native
  /* 0 */ @js.native
  object CAST_ONLY extends TopLevel[CAST_ONLY with Double]
  
  /* 1 */ @js.native
  object DISABLED extends TopLevel[DISABLED with Double]
  
  /* 2 */ @js.native
  object ENABLED extends TopLevel[ENABLED with Double]
  
  /* 3 */ @js.native
  object RECEIVE_ONLY extends TopLevel[RECEIVE_ONLY with Double]
  
}

