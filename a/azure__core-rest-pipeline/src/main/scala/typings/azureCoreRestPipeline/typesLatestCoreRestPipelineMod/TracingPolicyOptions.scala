package typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TracingPolicyOptions extends StObject {
  
  /**
    * String prefix to add to the user agent logged as metadata
    * on the generated Span.
    * Defaults to an empty string.
    */
  var userAgentPrefix: js.UndefOr[String] = js.undefined
}
object TracingPolicyOptions {
  
  inline def apply(): TracingPolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracingPolicyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TracingPolicyOptions] (val x: Self) extends AnyVal {
    
    inline def setUserAgentPrefix(value: String): Self = StObject.set(x, "userAgentPrefix", value.asInstanceOf[js.Any])
    
    inline def setUserAgentPrefixUndefined: Self = StObject.set(x, "userAgentPrefix", js.undefined)
  }
}
