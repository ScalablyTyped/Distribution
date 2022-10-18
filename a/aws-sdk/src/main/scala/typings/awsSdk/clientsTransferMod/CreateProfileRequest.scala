package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProfileRequest extends StObject {
  
  /**
    * The As2Id is the AS2-name, as defined in the RFC 4130. For inbound transfers, this is the AS2-From header for the AS2 messages sent from the partner. For outbound connectors, this is the AS2-To header for the AS2 messages sent to the partner using the StartFileTransfer API operation. This ID cannot include spaces.
    */
  var As2Id: typings.awsSdk.clientsTransferMod.As2Id
  
  /**
    * An array of identifiers for the imported certificates. You use this identifier for working with profiles and partner profiles.
    */
  var CertificateIds: js.UndefOr[typings.awsSdk.clientsTransferMod.CertificateIds] = js.undefined
  
  /**
    * Determines the type of profile to create:   Specify LOCAL to create a local profile. A local profile represents the AS2-enabled Transfer Family server organization or party.   Specify PARTNER to create a partner profile. A partner profile represents a remote organization, external to Transfer Family.  
    */
  var ProfileType: typings.awsSdk.clientsTransferMod.ProfileType
  
  /**
    * Key-value pairs that can be used to group and search for AS2 profiles.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsTransferMod.Tags] = js.undefined
}
object CreateProfileRequest {
  
  inline def apply(As2Id: As2Id, ProfileType: ProfileType): CreateProfileRequest = {
    val __obj = js.Dynamic.literal(As2Id = As2Id.asInstanceOf[js.Any], ProfileType = ProfileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfileRequest]
  }
  
  extension [Self <: CreateProfileRequest](x: Self) {
    
    inline def setAs2Id(value: As2Id): Self = StObject.set(x, "As2Id", value.asInstanceOf[js.Any])
    
    inline def setCertificateIds(value: CertificateIds): Self = StObject.set(x, "CertificateIds", value.asInstanceOf[js.Any])
    
    inline def setCertificateIdsUndefined: Self = StObject.set(x, "CertificateIds", js.undefined)
    
    inline def setCertificateIdsVarargs(value: CertificateId*): Self = StObject.set(x, "CertificateIds", js.Array(value*))
    
    inline def setProfileType(value: ProfileType): Self = StObject.set(x, "ProfileType", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
