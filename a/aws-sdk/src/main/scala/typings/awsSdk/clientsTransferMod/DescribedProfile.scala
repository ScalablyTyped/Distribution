package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribedProfile extends StObject {
  
  /**
    * The unique Amazon Resource Name (ARN) for the profile.
    */
  var Arn: typings.awsSdk.clientsTransferMod.Arn
  
  /**
    * The As2Id is the AS2-name, as defined in the RFC 4130. For inbound transfers, this is the AS2-From header for the AS2 messages sent from the partner. For outbound connectors, this is the AS2-To header for the AS2 messages sent to the partner using the StartFileTransfer API operation. This ID cannot include spaces.
    */
  var As2Id: js.UndefOr[typings.awsSdk.clientsTransferMod.As2Id] = js.undefined
  
  /**
    * An array of identifiers for the imported certificates. You use this identifier for working with profiles and partner profiles.
    */
  var CertificateIds: js.UndefOr[typings.awsSdk.clientsTransferMod.CertificateIds] = js.undefined
  
  /**
    * A unique identifier for the local or partner AS2 profile.
    */
  var ProfileId: js.UndefOr[typings.awsSdk.clientsTransferMod.ProfileId] = js.undefined
  
  /**
    * Indicates whether to list only LOCAL type profiles or only PARTNER type profiles. If not supplied in the request, the command lists all types of profiles.
    */
  var ProfileType: js.UndefOr[typings.awsSdk.clientsTransferMod.ProfileType] = js.undefined
  
  /**
    * Key-value pairs that can be used to group and search for profiles.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsTransferMod.Tags] = js.undefined
}
object DescribedProfile {
  
  inline def apply(Arn: Arn): DescribedProfile = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribedProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribedProfile] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setAs2Id(value: As2Id): Self = StObject.set(x, "As2Id", value.asInstanceOf[js.Any])
    
    inline def setAs2IdUndefined: Self = StObject.set(x, "As2Id", js.undefined)
    
    inline def setCertificateIds(value: CertificateIds): Self = StObject.set(x, "CertificateIds", value.asInstanceOf[js.Any])
    
    inline def setCertificateIdsUndefined: Self = StObject.set(x, "CertificateIds", js.undefined)
    
    inline def setCertificateIdsVarargs(value: CertificateId*): Self = StObject.set(x, "CertificateIds", js.Array(value*))
    
    inline def setProfileId(value: ProfileId): Self = StObject.set(x, "ProfileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "ProfileId", js.undefined)
    
    inline def setProfileType(value: ProfileType): Self = StObject.set(x, "ProfileType", value.asInstanceOf[js.Any])
    
    inline def setProfileTypeUndefined: Self = StObject.set(x, "ProfileType", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
