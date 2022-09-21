package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHsmConfigurationMessage extends StObject {
  
  /**
    * A text description of the HSM configuration to be created.
    */
  var Description: String
  
  /**
    * The identifier to be assigned to the new Amazon Redshift HSM configuration.
    */
  var HsmConfigurationIdentifier: String
  
  /**
    * The IP address that the Amazon Redshift cluster must use to access the HSM.
    */
  var HsmIpAddress: String
  
  /**
    * The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
    */
  var HsmPartitionName: String
  
  /**
    * The password required to access the HSM partition.
    */
  var HsmPartitionPassword: String
  
  /**
    * The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
    */
  var HsmServerPublicCertificate: String
  
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateHsmConfigurationMessage {
  
  inline def apply(
    Description: String,
    HsmConfigurationIdentifier: String,
    HsmIpAddress: String,
    HsmPartitionName: String,
    HsmPartitionPassword: String,
    HsmServerPublicCertificate: String
  ): CreateHsmConfigurationMessage = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], HsmConfigurationIdentifier = HsmConfigurationIdentifier.asInstanceOf[js.Any], HsmIpAddress = HsmIpAddress.asInstanceOf[js.Any], HsmPartitionName = HsmPartitionName.asInstanceOf[js.Any], HsmPartitionPassword = HsmPartitionPassword.asInstanceOf[js.Any], HsmServerPublicCertificate = HsmServerPublicCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHsmConfigurationMessage]
  }
  
  extension [Self <: CreateHsmConfigurationMessage](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setHsmConfigurationIdentifier(value: String): Self = StObject.set(x, "HsmConfigurationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setHsmIpAddress(value: String): Self = StObject.set(x, "HsmIpAddress", value.asInstanceOf[js.Any])
    
    inline def setHsmPartitionName(value: String): Self = StObject.set(x, "HsmPartitionName", value.asInstanceOf[js.Any])
    
    inline def setHsmPartitionPassword(value: String): Self = StObject.set(x, "HsmPartitionPassword", value.asInstanceOf[js.Any])
    
    inline def setHsmServerPublicCertificate(value: String): Self = StObject.set(x, "HsmServerPublicCertificate", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
