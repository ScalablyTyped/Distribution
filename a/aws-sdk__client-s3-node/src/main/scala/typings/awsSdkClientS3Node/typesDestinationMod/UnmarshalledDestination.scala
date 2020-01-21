package typings.awsSdkClientS3Node.typesDestinationMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.REDUCED_REDUNDANCY
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import typings.awsSdkClientS3Node.typesAccessControlTranslationMod.UnmarshalledAccessControlTranslation
import typings.awsSdkClientS3Node.typesEncryptionConfigurationMod.UnmarshalledEncryptionConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledDestination extends Destination {
  /**
    * <p> Container for information regarding the access control for replicas. </p> <p> Use only in a cross-account scenario, where source and destination bucket owners are not the same, when you want to change replica ownership to the AWS account that owns the destination bucket. If you don't add this element to the replication configuration, the replicas are owned by same AWS account that owns the source object. </p>
    */
  @JSName("AccessControlTranslation")
  var AccessControlTranslation_UnmarshalledDestination: js.UndefOr[UnmarshalledAccessControlTranslation] = js.undefined
  /**
    * <p> Container that provides encryption-related information. You must specify this element if the <code>SourceSelectionCriteria</code> is specified. </p>
    */
  @JSName("EncryptionConfiguration")
  var EncryptionConfiguration_UnmarshalledDestination: js.UndefOr[UnmarshalledEncryptionConfiguration] = js.undefined
}

object UnmarshalledDestination {
  @scala.inline
  def apply(
    Bucket: String,
    AccessControlTranslation: UnmarshalledAccessControlTranslation = null,
    Account: String = null,
    EncryptionConfiguration: UnmarshalledEncryptionConfiguration = null,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String = null
  ): UnmarshalledDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    if (AccessControlTranslation != null) __obj.updateDynamic("AccessControlTranslation")(AccessControlTranslation.asInstanceOf[js.Any])
    if (Account != null) __obj.updateDynamic("Account")(Account.asInstanceOf[js.Any])
    if (EncryptionConfiguration != null) __obj.updateDynamic("EncryptionConfiguration")(EncryptionConfiguration.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledDestination]
  }
}

