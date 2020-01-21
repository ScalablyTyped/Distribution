package typings.awsSdkClientS3Node.typesDestinationMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.REDUCED_REDUNDANCY
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import typings.awsSdkClientS3Node.typesAccessControlTranslationMod.AccessControlTranslation
import typings.awsSdkClientS3Node.typesEncryptionConfigurationMod.EncryptionConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destination extends js.Object {
  /**
    * <p> Container for information regarding the access control for replicas. </p> <p> Use only in a cross-account scenario, where source and destination bucket owners are not the same, when you want to change replica ownership to the AWS account that owns the destination bucket. If you don't add this element to the replication configuration, the replicas are owned by same AWS account that owns the source object. </p>
    */
  var AccessControlTranslation: js.UndefOr[
    typings.awsSdkClientS3Node.typesAccessControlTranslationMod.AccessControlTranslation
  ] = js.undefined
  /**
    * <p> Account ID of the destination bucket. Currently Amazon S3 verifies this value only if Access Control Translation is enabled. </p> <p> In a cross-account scenario, if you tell Amazon S3 to change replica ownership to the AWS account that owns the destination bucket by adding the <code>AccessControlTranslation</code> element, this is the account ID of the destination bucket owner. </p>
    */
  var Account: js.UndefOr[String] = js.undefined
  /**
    * <p> Amazon resource name (ARN) of the bucket where you want Amazon S3 to store replicas of the object identified by the rule. </p> <p> If you have multiple rules in your replication configuration, all rules must specify the same bucket as the destination. A replication configuration can replicate objects only to one destination bucket. </p>
    */
  var Bucket: String
  /**
    * <p> Container that provides encryption-related information. You must specify this element if the <code>SourceSelectionCriteria</code> is specified. </p>
    */
  var EncryptionConfiguration: js.UndefOr[
    typings.awsSdkClientS3Node.typesEncryptionConfigurationMod.EncryptionConfiguration
  ] = js.undefined
  /**
    * <p>The class of storage used to store the object.</p>
    */
  var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.undefined
}

object Destination {
  @scala.inline
  def apply(
    Bucket: String,
    AccessControlTranslation: AccessControlTranslation = null,
    Account: String = null,
    EncryptionConfiguration: EncryptionConfiguration = null,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String = null
  ): Destination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    if (AccessControlTranslation != null) __obj.updateDynamic("AccessControlTranslation")(AccessControlTranslation.asInstanceOf[js.Any])
    if (Account != null) __obj.updateDynamic("Account")(Account.asInstanceOf[js.Any])
    if (EncryptionConfiguration != null) __obj.updateDynamic("EncryptionConfiguration")(EncryptionConfiguration.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
}

