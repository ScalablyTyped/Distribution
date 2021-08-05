package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEmailIdentityResponse extends StObject {
  
  /**
    * An object that contains information about the DKIM attributes for the identity. This object includes the tokens that you use to create the CNAME records that are required to complete the DKIM verification process.
    */
  var DkimAttributes: js.UndefOr[typings.awsSdk.pinpointemailMod.DkimAttributes] = js.undefined
  
  /**
    * The email identity type.
    */
  var IdentityType: js.UndefOr[typings.awsSdk.pinpointemailMod.IdentityType] = js.undefined
  
  /**
    * Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from verified email addresses or domains. For more information about verifying identities, see the Amazon Pinpoint User Guide.
    */
  var VerifiedForSendingStatus: js.UndefOr[Enabled] = js.undefined
}
object CreateEmailIdentityResponse {
  
  inline def apply(): CreateEmailIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEmailIdentityResponse]
  }
  
  extension [Self <: CreateEmailIdentityResponse](x: Self) {
    
    inline def setDkimAttributes(value: DkimAttributes): Self = StObject.set(x, "DkimAttributes", value.asInstanceOf[js.Any])
    
    inline def setDkimAttributesUndefined: Self = StObject.set(x, "DkimAttributes", js.undefined)
    
    inline def setIdentityType(value: IdentityType): Self = StObject.set(x, "IdentityType", value.asInstanceOf[js.Any])
    
    inline def setIdentityTypeUndefined: Self = StObject.set(x, "IdentityType", js.undefined)
    
    inline def setVerifiedForSendingStatus(value: Enabled): Self = StObject.set(x, "VerifiedForSendingStatus", value.asInstanceOf[js.Any])
    
    inline def setVerifiedForSendingStatusUndefined: Self = StObject.set(x, "VerifiedForSendingStatus", js.undefined)
  }
}
