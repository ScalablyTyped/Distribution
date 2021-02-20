package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAWSServiceAccessForOrganizationResponse extends StObject {
  
  /**
    * A list of the service principals for the services that are enabled to integrate with your organization. Each principal is a structure that includes the name and the date that it was enabled for integration with AWS Organizations.
    */
  var EnabledServicePrincipals: js.UndefOr[typings.awsSdk.organizationsMod.EnabledServicePrincipals] = js.native
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.native
}
object ListAWSServiceAccessForOrganizationResponse {
  
  @scala.inline
  def apply(): ListAWSServiceAccessForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAWSServiceAccessForOrganizationResponse]
  }
  
  @scala.inline
  implicit class ListAWSServiceAccessForOrganizationResponseMutableBuilder[Self <: ListAWSServiceAccessForOrganizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabledServicePrincipals(value: EnabledServicePrincipals): Self = StObject.set(x, "EnabledServicePrincipals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledServicePrincipalsUndefined: Self = StObject.set(x, "EnabledServicePrincipals", js.undefined)
    
    @scala.inline
    def setEnabledServicePrincipalsVarargs(value: EnabledServicePrincipal*): Self = StObject.set(x, "EnabledServicePrincipals", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
