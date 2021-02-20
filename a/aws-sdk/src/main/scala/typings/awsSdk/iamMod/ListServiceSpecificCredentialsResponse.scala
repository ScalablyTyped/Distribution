package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListServiceSpecificCredentialsResponse extends StObject {
  
  /**
    * A list of structures that each contain details about a service-specific credential.
    */
  var ServiceSpecificCredentials: js.UndefOr[ServiceSpecificCredentialsListType] = js.native
}
object ListServiceSpecificCredentialsResponse {
  
  @scala.inline
  def apply(): ListServiceSpecificCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceSpecificCredentialsResponse]
  }
  
  @scala.inline
  implicit class ListServiceSpecificCredentialsResponseMutableBuilder[Self <: ListServiceSpecificCredentialsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceSpecificCredentials(value: ServiceSpecificCredentialsListType): Self = StObject.set(x, "ServiceSpecificCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceSpecificCredentialsUndefined: Self = StObject.set(x, "ServiceSpecificCredentials", js.undefined)
    
    @scala.inline
    def setServiceSpecificCredentialsVarargs(value: ServiceSpecificCredentialMetadata*): Self = StObject.set(x, "ServiceSpecificCredentials", js.Array(value :_*))
  }
}
