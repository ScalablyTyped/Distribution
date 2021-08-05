package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetireGrantRequest extends StObject {
  
  /**
    * Unique identifier of the grant to retire. The grant ID is returned in the response to a CreateGrant operation.   Grant ID Example - 0123456789012345678901234567890123456789012345678901234567890123  
    */
  var GrantId: js.UndefOr[GrantIdType] = js.undefined
  
  /**
    * Token that identifies the grant to be retired.
    */
  var GrantToken: js.UndefOr[GrantTokenType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the CMK associated with the grant.  For example: arn:aws:kms:us-east-2:444455556666:key/1234abcd-12ab-34cd-56ef-1234567890ab 
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
