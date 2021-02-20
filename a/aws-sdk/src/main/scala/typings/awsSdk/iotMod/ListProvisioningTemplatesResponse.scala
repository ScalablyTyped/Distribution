package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProvisioningTemplatesResponse extends StObject {
  
  /**
    * A token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list of fleet provisioning templates
    */
  var templates: js.UndefOr[ProvisioningTemplateListing] = js.native
}
object ListProvisioningTemplatesResponse {
  
  @scala.inline
  def apply(): ListProvisioningTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisioningTemplatesResponse]
  }
  
  @scala.inline
  implicit class ListProvisioningTemplatesResponseMutableBuilder[Self <: ListProvisioningTemplatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setTemplates(value: ProvisioningTemplateListing): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    @scala.inline
    def setTemplatesVarargs(value: ProvisioningTemplateSummary*): Self = StObject.set(x, "templates", js.Array(value :_*))
  }
}
