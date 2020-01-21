package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHsmConfigurationMessage extends js.Object {
  /**
    * A text description of the HSM configuration to be created.
    */
  var Description: String = js.native
  /**
    * The identifier to be assigned to the new Amazon Redshift HSM configuration.
    */
  var HsmConfigurationIdentifier: String = js.native
  /**
    * The IP address that the Amazon Redshift cluster must use to access the HSM.
    */
  var HsmIpAddress: String = js.native
  /**
    * The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
    */
  var HsmPartitionName: String = js.native
  /**
    * The password required to access the HSM partition.
    */
  var HsmPartitionPassword: String = js.native
  /**
    * The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
    */
  var HsmServerPublicCertificate: String = js.native
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateHsmConfigurationMessage {
  @scala.inline
  def apply(
    Description: String,
    HsmConfigurationIdentifier: String,
    HsmIpAddress: String,
    HsmPartitionName: String,
    HsmPartitionPassword: String,
    HsmServerPublicCertificate: String,
    Tags: TagList = null
  ): CreateHsmConfigurationMessage = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], HsmConfigurationIdentifier = HsmConfigurationIdentifier.asInstanceOf[js.Any], HsmIpAddress = HsmIpAddress.asInstanceOf[js.Any], HsmPartitionName = HsmPartitionName.asInstanceOf[js.Any], HsmPartitionPassword = HsmPartitionPassword.asInstanceOf[js.Any], HsmServerPublicCertificate = HsmServerPublicCertificate.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHsmConfigurationMessage]
  }
}

