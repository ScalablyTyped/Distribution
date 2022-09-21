package typings.awsSdkMiddlewareRetry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/config", "DEFAULT_MAX_ATTEMPTS")
  @js.native
  val DEFAULT_MAX_ATTEMPTS: /* 3 */ Double = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/config", "DEFAULT_RETRY_MODE")
  @js.native
  val DEFAULT_RETRY_MODE: String | Double = js.native
  
  @js.native
  sealed trait RETRY_MODES extends StObject
  @JSImport("@aws-sdk/middleware-retry/dist-types/config", "RETRY_MODES")
  @js.native
  object RETRY_MODES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RETRY_MODES & String] = js.native
    
    @js.native
    sealed trait ADAPTIVE
      extends StObject
         with RETRY_MODES
    /* "adaptive" */ val ADAPTIVE: typings.awsSdkMiddlewareRetry.configMod.RETRY_MODES.ADAPTIVE & String = js.native
    
    @js.native
    sealed trait STANDARD
      extends StObject
         with RETRY_MODES
    /* "standard" */ val STANDARD: typings.awsSdkMiddlewareRetry.configMod.RETRY_MODES.STANDARD & String = js.native
  }
}
