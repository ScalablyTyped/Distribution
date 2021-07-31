package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGovCloudAccountResponse extends StObject {
  
  var CreateAccountStatus: js.UndefOr[typings.awsSdk.organizationsMod.CreateAccountStatus] = js.undefined
}
object CreateGovCloudAccountResponse {
  
  @scala.inline
  def apply(): CreateGovCloudAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGovCloudAccountResponse]
  }
  
  @scala.inline
  implicit class CreateGovCloudAccountResponseMutableBuilder[Self <: CreateGovCloudAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateAccountStatus(value: CreateAccountStatus): Self = StObject.set(x, "CreateAccountStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateAccountStatusUndefined: Self = StObject.set(x, "CreateAccountStatus", js.undefined)
  }
}
