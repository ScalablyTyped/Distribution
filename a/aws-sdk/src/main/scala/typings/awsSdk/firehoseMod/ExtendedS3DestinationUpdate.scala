package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedS3DestinationUpdate extends js.Object {
  /**
    * The ARN of the S3 bucket. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var BucketARN: js.UndefOr[typings.awsSdk.firehoseMod.BucketARN] = js.native
  /**
    * The buffering option.
    */
  var BufferingHints: js.UndefOr[typings.awsSdk.firehoseMod.BufferingHints] = js.native
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.native
  /**
    * The compression format. If no value is specified, the default is UNCOMPRESSED. 
    */
  var CompressionFormat: js.UndefOr[typings.awsSdk.firehoseMod.CompressionFormat] = js.native
  /**
    * The serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC format before writing it to Amazon S3.
    */
  var DataFormatConversionConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.DataFormatConversionConfiguration] = js.native
  /**
    * The encryption configuration. If no value is specified, the default is no encryption.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.EncryptionConfiguration] = js.native
  /**
    * A prefix that Kinesis Data Firehose evaluates and adds to failed records before writing them to S3. This prefix appears immediately following the bucket name. For information about how to specify this prefix, see Custom Prefixes for Amazon S3 Objects.
    */
  var ErrorOutputPrefix: js.UndefOr[typings.awsSdk.firehoseMod.ErrorOutputPrefix] = js.native
  /**
    * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can also specify a custom prefix, as described in Custom Prefixes for Amazon S3 Objects.
    */
  var Prefix: js.UndefOr[typings.awsSdk.firehoseMod.Prefix] = js.native
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typings.awsSdk.firehoseMod.ProcessingConfiguration] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.firehoseMod.RoleARN] = js.native
  /**
    * Enables or disables Amazon S3 backup mode.
    */
  var S3BackupMode: js.UndefOr[typings.awsSdk.firehoseMod.S3BackupMode] = js.native
  /**
    * The Amazon S3 destination for backup.
    */
  var S3BackupUpdate: js.UndefOr[S3DestinationUpdate] = js.native
}

object ExtendedS3DestinationUpdate {
  @scala.inline
  def apply(
    BucketARN: BucketARN = null,
    BufferingHints: BufferingHints = null,
    CloudWatchLoggingOptions: CloudWatchLoggingOptions = null,
    CompressionFormat: CompressionFormat = null,
    DataFormatConversionConfiguration: DataFormatConversionConfiguration = null,
    EncryptionConfiguration: EncryptionConfiguration = null,
    ErrorOutputPrefix: ErrorOutputPrefix = null,
    Prefix: Prefix = null,
    ProcessingConfiguration: ProcessingConfiguration = null,
    RoleARN: RoleARN = null,
    S3BackupMode: S3BackupMode = null,
    S3BackupUpdate: S3DestinationUpdate = null
  ): ExtendedS3DestinationUpdate = {
    val __obj = js.Dynamic.literal()
    if (BucketARN != null) __obj.updateDynamic("BucketARN")(BucketARN.asInstanceOf[js.Any])
    if (BufferingHints != null) __obj.updateDynamic("BufferingHints")(BufferingHints.asInstanceOf[js.Any])
    if (CloudWatchLoggingOptions != null) __obj.updateDynamic("CloudWatchLoggingOptions")(CloudWatchLoggingOptions.asInstanceOf[js.Any])
    if (CompressionFormat != null) __obj.updateDynamic("CompressionFormat")(CompressionFormat.asInstanceOf[js.Any])
    if (DataFormatConversionConfiguration != null) __obj.updateDynamic("DataFormatConversionConfiguration")(DataFormatConversionConfiguration.asInstanceOf[js.Any])
    if (EncryptionConfiguration != null) __obj.updateDynamic("EncryptionConfiguration")(EncryptionConfiguration.asInstanceOf[js.Any])
    if (ErrorOutputPrefix != null) __obj.updateDynamic("ErrorOutputPrefix")(ErrorOutputPrefix.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (ProcessingConfiguration != null) __obj.updateDynamic("ProcessingConfiguration")(ProcessingConfiguration.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    if (S3BackupMode != null) __obj.updateDynamic("S3BackupMode")(S3BackupMode.asInstanceOf[js.Any])
    if (S3BackupUpdate != null) __obj.updateDynamic("S3BackupUpdate")(S3BackupUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedS3DestinationUpdate]
  }
}

