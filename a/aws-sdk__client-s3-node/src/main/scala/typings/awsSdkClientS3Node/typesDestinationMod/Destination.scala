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

@js.native
trait Destination extends js.Object {
  /**
    * <p> Container for information regarding the access control for replicas. </p> <p> Use only in a cross-account scenario, where source and destination bucket owners are not the same, when you want to change replica ownership to the AWS account that owns the destination bucket. If you don't add this element to the replication configuration, the replicas are owned by same AWS account that owns the source object. </p>
    */
  var AccessControlTranslation: js.UndefOr[
    typings.awsSdkClientS3Node.typesAccessControlTranslationMod.AccessControlTranslation
  ] = js.native
  /**
    * <p> Account ID of the destination bucket. Currently Amazon S3 verifies this value only if Access Control Translation is enabled. </p> <p> In a cross-account scenario, if you tell Amazon S3 to change replica ownership to the AWS account that owns the destination bucket by adding the <code>AccessControlTranslation</code> element, this is the account ID of the destination bucket owner. </p>
    */
  var Account: js.UndefOr[String] = js.native
  /**
    * <p> Amazon resource name (ARN) of the bucket where you want Amazon S3 to store replicas of the object identified by the rule. </p> <p> If you have multiple rules in your replication configuration, all rules must specify the same bucket as the destination. A replication configuration can replicate objects only to one destination bucket. </p>
    */
  var Bucket: String = js.native
  /**
    * <p> Container that provides encryption-related information. You must specify this element if the <code>SourceSelectionCriteria</code> is specified. </p>
    */
  var EncryptionConfiguration: js.UndefOr[
    typings.awsSdkClientS3Node.typesEncryptionConfigurationMod.EncryptionConfiguration
  ] = js.native
  /**
    * <p>The class of storage used to store the object.</p>
    */
  var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.native
}

object Destination {
  @scala.inline
  def apply(Bucket: String): Destination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
  @scala.inline
  implicit class DestinationOps[Self <: Destination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucket(value: String): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessControlTranslation(value: AccessControlTranslation): Self = this.set("AccessControlTranslation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessControlTranslation: Self = this.set("AccessControlTranslation", js.undefined)
    @scala.inline
    def setAccount(value: String): Self = this.set("Account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount: Self = this.set("Account", js.undefined)
    @scala.inline
    def setEncryptionConfiguration(value: EncryptionConfiguration): Self = this.set("EncryptionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionConfiguration: Self = this.set("EncryptionConfiguration", js.undefined)
    @scala.inline
    def setStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
  }
  
}

