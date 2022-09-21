package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProfileKeyRequest extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * A searchable identifier of a customer profile.
    */
  var KeyName: name
  
  /**
    * The unique identifier of a customer profile.
    */
  var ProfileId: uuid
  
  /**
    * A list of key values.
    */
  var Values: requestValueList
}
object DeleteProfileKeyRequest {
  
  inline def apply(DomainName: name, KeyName: name, ProfileId: uuid, Values: requestValueList): DeleteProfileKeyRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], KeyName = KeyName.asInstanceOf[js.Any], ProfileId = ProfileId.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProfileKeyRequest]
  }
  
  extension [Self <: DeleteProfileKeyRequest](x: Self) {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setKeyName(value: name): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setProfileId(value: uuid): Self = StObject.set(x, "ProfileId", value.asInstanceOf[js.Any])
    
    inline def setValues(value: requestValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: string1To255*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
