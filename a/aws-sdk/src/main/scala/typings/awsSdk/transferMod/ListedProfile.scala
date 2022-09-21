package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListedProfile extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the specified profile.
    */
  var Arn: js.UndefOr[typings.awsSdk.transferMod.Arn] = js.undefined
  
  /**
    * The As2Id is the AS2-name, as defined in the RFC 4130. For inbound transfers, this is the AS2-From header for the AS2 messages sent from the partner. For outbound connectors, this is the AS2-To header for the AS2 messages sent to the partner using the StartFileTransfer API operation. This ID cannot include spaces.
    */
  var As2Id: js.UndefOr[typings.awsSdk.transferMod.As2Id] = js.undefined
  
  /**
    * A unique identifier for the local or partner AS2 profile.
    */
  var ProfileId: js.UndefOr[typings.awsSdk.transferMod.ProfileId] = js.undefined
  
  /**
    * Indicates whether to list only LOCAL type profiles or only PARTNER type profiles. If not supplied in the request, the command lists all types of profiles.
    */
  var ProfileType: js.UndefOr[typings.awsSdk.transferMod.ProfileType] = js.undefined
}
object ListedProfile {
  
  inline def apply(): ListedProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListedProfile]
  }
  
  extension [Self <: ListedProfile](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAs2Id(value: As2Id): Self = StObject.set(x, "As2Id", value.asInstanceOf[js.Any])
    
    inline def setAs2IdUndefined: Self = StObject.set(x, "As2Id", js.undefined)
    
    inline def setProfileId(value: ProfileId): Self = StObject.set(x, "ProfileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "ProfileId", js.undefined)
    
    inline def setProfileType(value: ProfileType): Self = StObject.set(x, "ProfileType", value.asInstanceOf[js.Any])
    
    inline def setProfileTypeUndefined: Self = StObject.set(x, "ProfileType", js.undefined)
  }
}
