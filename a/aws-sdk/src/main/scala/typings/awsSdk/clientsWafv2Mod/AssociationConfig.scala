package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationConfig extends StObject {
  
  /**
    * Customizes the maximum size of the request body that your protected CloudFront distributions forward to WAF for inspection. The default size is 16 KB (16,384 kilobytes).   You are charged additional fees when your protected resources forward body sizes that are larger than the default. For more information, see WAF Pricing. 
    */
  var RequestBody: js.UndefOr[typings.awsSdk.clientsWafv2Mod.RequestBody] = js.undefined
}
object AssociationConfig {
  
  inline def apply(): AssociationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociationConfig] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: RequestBody): Self = StObject.set(x, "RequestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "RequestBody", js.undefined)
  }
}
