package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProvisioningTemplatesResponse extends StObject {
  
  /**
    * A token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of fleet provisioning templates
    */
  var templates: js.UndefOr[ProvisioningTemplateListing] = js.undefined
}
object ListProvisioningTemplatesResponse {
  
  inline def apply(): ListProvisioningTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisioningTemplatesResponse]
  }
  
  extension [Self <: ListProvisioningTemplatesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTemplates(value: ProvisioningTemplateListing): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    inline def setTemplatesVarargs(value: ProvisioningTemplateSummary*): Self = StObject.set(x, "templates", js.Array(value :_*))
  }
}
