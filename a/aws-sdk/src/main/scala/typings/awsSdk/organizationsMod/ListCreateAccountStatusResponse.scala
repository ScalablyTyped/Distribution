package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCreateAccountStatusResponse extends StObject {
  
  /**
    * A list of objects with details about the requests. Certain elements, such as the accountId number, are present in the output only after the account has been successfully created.
    */
  var CreateAccountStatuses: js.UndefOr[typings.awsSdk.organizationsMod.CreateAccountStatuses] = js.native
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.native
}
object ListCreateAccountStatusResponse {
  
  @scala.inline
  def apply(): ListCreateAccountStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCreateAccountStatusResponse]
  }
  
  @scala.inline
  implicit class ListCreateAccountStatusResponseMutableBuilder[Self <: ListCreateAccountStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateAccountStatuses(value: CreateAccountStatuses): Self = StObject.set(x, "CreateAccountStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateAccountStatusesUndefined: Self = StObject.set(x, "CreateAccountStatuses", js.undefined)
    
    @scala.inline
    def setCreateAccountStatusesVarargs(value: CreateAccountStatus*): Self = StObject.set(x, "CreateAccountStatuses", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
