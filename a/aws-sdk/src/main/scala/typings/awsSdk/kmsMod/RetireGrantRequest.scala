package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetireGrantRequest extends StObject {
  
  /**
    * Identifies the grant to retire. To get the grant ID, use CreateGrant, ListGrants, or ListRetirableGrants.   Grant ID Example - 0123456789012345678901234567890123456789012345678901234567890123  
    */
  var GrantId: js.UndefOr[GrantIdType] = js.undefined
  
  /**
    * Identifies the grant to be retired. You can use a grant token to identify a new grant even before it has achieved eventual consistency. Only the CreateGrant operation returns a grant token. For details, see Grant token and Eventual consistency in the Key Management Service Developer Guide.
    */
  var GrantToken: js.UndefOr[GrantTokenType] = js.undefined
  
  /**
    * The key ARN KMS key associated with the grant. To find the key ARN, use the ListKeys operation. For example: arn:aws:kms:us-east-2:444455556666:key/1234abcd-12ab-34cd-56ef-1234567890ab 
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
}
object RetireGrantRequest {
  
  inline def apply(): RetireGrantRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetireGrantRequest]
  }
  
  extension [Self <: RetireGrantRequest](x: Self) {
    
    inline def setGrantId(value: GrantIdType): Self = StObject.set(x, "GrantId", value.asInstanceOf[js.Any])
    
    inline def setGrantIdUndefined: Self = StObject.set(x, "GrantId", js.undefined)
    
    inline def setGrantToken(value: GrantTokenType): Self = StObject.set(x, "GrantToken", value.asInstanceOf[js.Any])
    
    inline def setGrantTokenUndefined: Self = StObject.set(x, "GrantToken", js.undefined)
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
  }
}
