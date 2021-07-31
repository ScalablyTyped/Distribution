package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCustomAttributesRequest extends StObject {
  
  /**
    * An array of custom attributes, such as Mutable and Name.
    */
  var CustomAttributes: CustomAttributesListType
  
  /**
    * The user pool ID for the user pool where you want to add custom attributes.
    */
  var UserPoolId: UserPoolIdType
}
object AddCustomAttributesRequest {
  
  @scala.inline
  def apply(CustomAttributes: CustomAttributesListType, UserPoolId: UserPoolIdType): AddCustomAttributesRequest = {
    val __obj = js.Dynamic.literal(CustomAttributes = CustomAttributes.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCustomAttributesRequest]
  }
  
  @scala.inline
  implicit class AddCustomAttributesRequestMutableBuilder[Self <: AddCustomAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomAttributes(value: CustomAttributesListType): Self = StObject.set(x, "CustomAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAttributesVarargs(value: SchemaAttributeType*): Self = StObject.set(x, "CustomAttributes", js.Array(value :_*))
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
