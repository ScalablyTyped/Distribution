package typings.azureCoreRestPipeline.coreRestPipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgentPolicyOptions extends StObject {
  
  /**
    * String prefix to add to the user agent for outgoing requests.
    * Defaults to an empty string.
    */
  var userAgentPrefix: js.UndefOr[String] = js.undefined
}
object UserAgentPolicyOptions {
  
  inline def apply(): UserAgentPolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAgentPolicyOptions]
  }
  
  extension [Self <: UserAgentPolicyOptions](x: Self) {
    
    inline def setUserAgentPrefix(value: String): Self = StObject.set(x, "userAgentPrefix", value.asInstanceOf[js.Any])
    
    inline def setUserAgentPrefixUndefined: Self = StObject.set(x, "userAgentPrefix", js.undefined)
  }
}
