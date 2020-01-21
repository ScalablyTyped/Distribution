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
    *  The storage class to use when replicating objects, such as standard or reduced redundancy. By default, Amazon S3 uses the storage class of the source object to create the object replica.  For valid values, see the StorageClass element of the PUT Bucket replication action in the Amazon Simple Storage Service API Reference.
    */
  var StorageClass: js.UndefOr[typings.awsSdk.s3Mod.StorageClass] = js.native
}

object Destination {
  @scala.inline
  def apply(
    Bucket: BucketName,
    AccessControlTranslation: AccessControlTranslation = null,
    Account: AccountId = null,
    EncryptionConfiguration: EncryptionConfiguration = null,
    Metrics: Metrics = null,
    ReplicationTime: ReplicationTime = null,
    StorageClass: StorageClass = null
  ): Destination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    if (AccessControlTranslation != null) __obj.updateDynamic("AccessControlTranslation")(AccessControlTranslation.asInstanceOf[js.Any])
    if (Account != null) __obj.updateDynamic("Account")(Account.asInstanceOf[js.Any])
    if (EncryptionConfiguration != null) __obj.updateDynamic("EncryptionConfiguration")(EncryptionConfiguration.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (ReplicationTime != null) __obj.updateDynamic("ReplicationTime")(ReplicationTime.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
}

