package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShadowMode extends StObject
@JSImport("cesium", "ShadowMode")
@js.native
object ShadowMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShadowMode & Double] = js.native
  
  /**
    * The object casts shadows only.
    */
  @js.native
  sealed trait CAST_ONLY
    extends StObject
       with ShadowMode
  /* 2 */ val CAST_ONLY: typings.cesium.mod.ShadowMode.CAST_ONLY & Double = js.native
  
  /**
    * The object does not cast or receive shadows.
    */
  @js.native
  sealed trait DISABLED
    extends StObject
       with ShadowMode
  /* 0 */ val DISABLED: typings.cesium.mod.ShadowMode.DISABLED & Double = js.native
  
  /**
    * The object casts and receives shadows.
    */
  @js.native
  sealed trait ENABLED
    extends StObject
       with ShadowMode
  /* 1 */ val ENABLED: typings.cesium.mod.ShadowMode.ENABLED & Double = js.native
  
  /**
    * The object receives shadows only.
    */
  @js.native
  sealed trait RECEIVE_ONLY
    extends StObject
       with ShadowMode
  /* 3 */ val RECEIVE_ONLY: typings.cesium.mod.ShadowMode.RECEIVE_ONLY & Double = js.native
}
