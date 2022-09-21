package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGrantResponse extends StObject {
  
  /**
    * The unique identifier for the grant. You can use the GrantId in a ListGrants, RetireGrant, or RevokeGrant operation.
    */
  var GrantId: js.UndefOr[GrantIdType] = js.undefined
  
  /**
    * The grant token. Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved eventual consistency. For more information, see Grant token and Using a grant token in the Key Management Service Developer Guide.
    */
  var GrantToken: js.UndefOr[GrantTokenType] = js.undefined
}
object CreateGrantResponse {
  
  inline def apply(): CreateGrantResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGrantResponse]
  }
  
  extension [Self <: CreateGrantResponse](x: Self) {
    
    inline def setGrantId(value: GrantIdType): Self = StObject.set(x, "GrantId", value.asInstanceOf[js.Any])
    
    inline def setGrantIdUndefined: Self = StObject.set(x, "GrantId", js.undefined)
    
    inline def setGrantToken(value: GrantTokenType): Self = StObject.set(x, "GrantToken", value.asInstanceOf[js.Any])
    
    inline def setGrantTokenUndefined: Self = StObject.set(x, "GrantToken", js.undefined)
  }
}
