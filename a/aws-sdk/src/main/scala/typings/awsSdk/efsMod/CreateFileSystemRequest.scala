package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFileSystemRequest extends js.Object {
  /**
    * A string of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
    */
  var CreationToken: typings.awsSdk.efsMod.CreationToken = js.native
  /**
    * A Boolean value that, if true, creates an encrypted file system. When creating an encrypted file system, you have the option of specifying CreateFileSystemRequest$KmsKeyId for an existing AWS Key Management Service (AWS KMS) customer master key (CMK). If you don't specify a CMK, then the default CMK for Amazon EFS, /aws/elasticfilesystem, is used to protect the encrypted file system. 
    */
  var Encrypted: js.UndefOr[typings.awsSdk.efsMod.Encrypted] = js.native
  /**
    * The ID of the AWS KMS CMK to be used to protect the encrypted file system. This parameter is only required if you want to use a nondefault CMK. If this parameter is not specified, the default CMK for Amazon EFS is used. This ID can be in one of the following formats:   Key ID - A unique identifier of the key, for example 1234abcd-12ab-34cd-56ef-1234567890ab.   ARN - An Amazon Resource Name (ARN) for the key, for example arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.   Key alias - A previously created display name for a key, for example alias/projectKey1.   Key alias ARN - An ARN for a key alias, for example arn:aws:kms:us-west-2:444455556666:alias/projectKey1.   If KmsKeyId is specified, the CreateFileSystemRequest$Encrypted parameter must be set to true.  EFS accepts only symmetric CMKs. You cannot use asymmetric CMKs with EFS file systems. 
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.efsMod.KmsKeyId] = js.native
  /**
    * The performance mode of the file system. We recommend generalPurpose performance mode for most file systems. File systems using the maxIO performance mode can scale to higher levels of aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most file operations. The performance mode can't be changed after the file system has been created.
    */
  var PerformanceMode: js.UndefOr[typings.awsSdk.efsMod.PerformanceMode] = js.native
  /**
    * The throughput, measured in MiB/s, that you want to provision for a file system that you're creating. Valid values are 1-1024. Required if ThroughputMode is set to provisioned. The upper limit for throughput is 1024 MiB/s. You can get this limit increased by contacting AWS Support. For more information, see Amazon EFS Limits That You Can Increase in the Amazon EFS User Guide. 
    */
  var ProvisionedThroughputInMibps: js.UndefOr[typings.awsSdk.efsMod.ProvisionedThroughputInMibps] = js.native
  /**
    * A value that specifies to create one or more tags associated with the file system. Each tag is a user-defined key-value pair. Name your file system on creation by including a "Key":"Name","Value":"{value}" key-value pair.
    */
  var Tags: js.UndefOr[typings.awsSdk.efsMod.Tags] = js.native
  /**
    * The throughput mode for the file system to be created. There are two throughput modes to choose from for your file system: bursting and provisioned. If you set ThroughputMode to provisioned, you must also set a value for ProvisionedThroughPutInMibps. You can decrease your file system's throughput in Provisioned Throughput mode or change between the throughput modes as long as it’s been more than 24 hours since the last decrease or throughput mode change. For more, see Specifying Throughput with Provisioned Mode in the Amazon EFS User Guide. 
    */
  var ThroughputMode: js.UndefOr[typings.awsSdk.efsMod.ThroughputMode] = js.native
}

object CreateFileSystemRequest {
  @scala.inline
  def apply(
    CreationToken: CreationToken,
    Encrypted: js.UndefOr[Boolean] = js.undefined,
    KmsKeyId: KmsKeyId = null,
    PerformanceMode: PerformanceMode = null,
    ProvisionedThroughputInMibps: Int | Double = null,
    Tags: Tags = null,
    ThroughputMode: ThroughputMode = null
  ): CreateFileSystemRequest = {
    val __obj = js.Dynamic.literal(CreationToken = CreationToken.asInstanceOf[js.Any])
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (PerformanceMode != null) __obj.updateDynamic("PerformanceMode")(PerformanceMode.asInstanceOf[js.Any])
    if (ProvisionedThroughputInMibps != null) __obj.updateDynamic("ProvisionedThroughputInMibps")(ProvisionedThroughputInMibps.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (ThroughputMode != null) __obj.updateDynamic("ThroughputMode")(ThroughputMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileSystemRequest]
  }
}

