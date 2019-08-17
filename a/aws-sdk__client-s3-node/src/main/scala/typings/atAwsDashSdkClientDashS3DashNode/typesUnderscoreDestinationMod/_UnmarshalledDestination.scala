package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreDestinationMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.ONEZONE_IA
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.REDUCED_REDUNDANCY
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.STANDARD
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.STANDARD_IA
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreAccessControlTranslationMod._UnmarshalledAccessControlTranslation
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreEncryptionConfigurationMod._UnmarshalledEncryptionConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledDestination extends _Destination {
  /**
    * <p> Container for information regarding the access control for replicas. </p> <p> Use only in a cross-account scenario, where source and destination bucket owners are not the same, when you want to change replica ownership to the AWS account that owns the destination bucket. If you don't add this element to the replication configuration, the replicas are owned by same AWS account that owns the source object. </p>
    */
  @JSName("AccessControlTranslation")
  var AccessControlTranslation__UnmarshalledDestination: js.UndefOr[_UnmarshalledAccessControlTranslation] = js.undefined
  /**
    * <p> Container that provides encryption-related information. You must specify this element if the <code>SourceSelectionCriteria</code> is specified. </p>
    */
  @JSName("EncryptionConfiguration")
  var EncryptionConfiguration__UnmarshalledDestination: js.UndefOr[_UnmarshalledEncryptionConfiguration] = js.undefined
}

object _UnmarshalledDestination {
  @scala.inline
  def apply(
    Bucket: String,
    AccessControlTranslation: _UnmarshalledAccessControlTranslation = null,
    Account: String = null,
    EncryptionConfiguration: _UnmarshalledEncryptionConfiguration = null,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String = null
  ): _UnmarshalledDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
    if (AccessControlTranslation != null) __obj.updateDynamic("AccessControlTranslation")(AccessControlTranslation)
    if (Account != null) __obj.updateDynamic("Account")(Account)
    if (EncryptionConfiguration != null) __obj.updateDynamic("EncryptionConfiguration")(EncryptionConfiguration)
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledDestination]
  }
}

