package typings.azureCoreRestPipeline.coreRestPipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectPolicyOptions extends StObject {
  
  /**
    * The maximum number of times the redirect URL will be tried before
    * failing.  Defaults to 20.
    */
  var maxRetries: js.UndefOr[Double] = js.undefined
}
object RedirectPolicyOptions {
  
  inline def apply(): RedirectPolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedirectPolicyOptions]
  }
  
  extension [Self <: RedirectPolicyOptions](x: Self) {
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
  }
}
