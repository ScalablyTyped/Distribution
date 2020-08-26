package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Destination extends js.Object {
  /**
    * Specify this only in a cross-account scenario (where source and destination bucket owners are not the same), and you want to change replica ownership to the AWS account that owns the destination bucket. If this is not specified in the replication configuration, the replicas are owned by same AWS account that owns the source object.
    */
  var AccessControlTranslation: js.UndefOr[typings.awsSdk.s3Mod.AccessControlTranslation] = js.native
  /**
    * Destination bucket owner account ID. In a cross-account scenario, if you direct Amazon S3 to change replica ownership to the AWS account that owns the destination bucket by specifying the AccessControlTranslation property, this is the account ID of the destination bucket owner. For more information, see Replication Additional Configuration: Changing the Replica Owner in the Amazon Simple Storage Service Developer Guide.
    */
  var Account: js.UndefOr[AccountId] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the bucket where you want Amazon S3 to store the results.
    */
  var Bucket: BucketName = js.native
  /**
    * A container that provides information about encryption. If SourceSelectionCriteria is specified, you must specify this element.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.s3Mod.EncryptionConfiguration] = js.native
  /**
    *  A container specifying replication metrics-related settings enabling metrics and Amazon S3 events for S3 Replication Time Control (S3 RTC). Must be specified together with a ReplicationTime block. 
    */
  var Metrics: js.UndefOr[typings.awsSdk.s3Mod.Metrics] = js.native
  /**
    *  A container specifying S3 Replication Time Control (S3 RTC), including whether S3 RTC is enabled and the time when all objects and operations on objects must be replicated. Must be specified together with a Metrics block. 
    */
  var ReplicationTime: js.UndefOr[typings.awsSdk.s3Mod.ReplicationTime] = js.native
  /**
    *  The storage class to use when replicating objects, such as S3 Standard or reduced redundancy. By default, Amazon S3 uses the storage class of the source object to create the object replica.  For valid values, see the StorageClass element of the PUT Bucket replication action in the Amazon Simple Storage Service API Reference.
    */
  var StorageClass: js.UndefOr[typings.awsSdk.s3Mod.StorageClass] = js.native
}

object Destination {
  @scala.inline
  def apply(Bucket: BucketName): Destination = {
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
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessControlTranslation(value: AccessControlTranslation): Self = this.set("AccessControlTranslation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessControlTranslation: Self = this.set("AccessControlTranslation", js.undefined)
    @scala.inline
    def setAccount(value: AccountId): Self = this.set("Account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount: Self = this.set("Account", js.undefined)
    @scala.inline
    def setEncryptionConfiguration(value: EncryptionConfiguration): Self = this.set("EncryptionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionConfiguration: Self = this.set("EncryptionConfiguration", js.undefined)
    @scala.inline
    def setMetrics(value: Metrics): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
    @scala.inline
    def setReplicationTime(value: ReplicationTime): Self = this.set("ReplicationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationTime: Self = this.set("ReplicationTime", js.undefined)
    @scala.inline
    def setStorageClass(value: StorageClass): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
  }
  
}

