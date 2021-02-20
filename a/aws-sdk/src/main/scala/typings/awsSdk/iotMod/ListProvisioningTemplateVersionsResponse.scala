package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProvisioningTemplateVersionsResponse extends StObject {
  
  /**
    * A token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The list of fleet provisioning template versions.
    */
  var versions: js.UndefOr[ProvisioningTemplateVersionListing] = js.native
}
object ListProvisioningTemplateVersionsResponse {
  
  @scala.inline
  def apply(): ListProvisioningTemplateVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisioningTemplateVersionsResponse]
  }
  
  @scala.inline
  implicit class ListProvisioningTemplateVersionsResponseMutableBuilder[Self <: ListProvisioningTemplateVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setVersions(value: ProvisioningTemplateVersionListing): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: ProvisioningTemplateVersionSummary*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
