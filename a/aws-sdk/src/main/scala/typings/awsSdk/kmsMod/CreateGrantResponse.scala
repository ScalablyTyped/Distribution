package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGrantResponse extends StObject {
  
  /**
    * The unique identifier for the grant. You can use the GrantId in a subsequent RetireGrant or RevokeGrant operation.
    */
  var GrantId: js.UndefOr[GrantIdType] = js.undefined
  
  /**
    * The grant token. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
    */
  var GrantToken: js.UndefOr[GrantTokenType] = js.undefined
}
object CreateGrantResponse {
  
  @scala.inline
  def apply(): CreateGrantResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGrantResponse]
  }
  
  @scala.inline
  implicit class CreateGrantResponseMutableBuilder[Self <: CreateGrantResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrantId(value: GrantIdType): Self = StObject.set(x, "GrantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantIdUndefined: Self = StObject.set(x, "GrantId", js.undefined)
    
    @scala.inline
    def setGrantToken(value: GrantTokenType): Self = StObject.set(x, "GrantToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantTokenUndefined: Self = StObject.set(x, "GrantToken", js.undefined)
  }
}
