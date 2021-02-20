package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShadowMode extends StObject
@JSImport("cesium", "ShadowMode")
@js.native
object ShadowMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShadowMode with Double] = js.native
  
  @js.native
  sealed trait CAST_ONLY extends ShadowMode
  /* 0 */ val CAST_ONLY: typings.cesium.mod.ShadowMode.CAST_ONLY with Double = js.native
  
  @js.native
  sealed trait DISABLED extends ShadowMode
  /* 1 */ val DISABLED: typings.cesium.mod.ShadowMode.DISABLED with Double = js.native
  
  @js.native
  sealed trait ENABLED extends ShadowMode
  /* 2 */ val ENABLED: typings.cesium.mod.ShadowMode.ENABLED with Double = js.native
  
  @js.native
  sealed trait RECEIVE_ONLY extends ShadowMode
  /* 3 */ val RECEIVE_ONLY: typings.cesium.mod.ShadowMode.RECEIVE_ONLY with Double = js.native
}
