package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3DestinationDescription extends js.Object {
  /**
    * The ARN of the S3 bucket. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var BucketARN: typings.awsSdk.firehoseMod.BucketARN = js.native
  /**
    * The buffering option. If no value is specified, BufferingHints object default values are used.
    */
  var BufferingHints: typings.awsSdk.firehoseMod.BufferingHints = js.native
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.firehoseMod.CloudWatchLoggingOptions] = js.native
  /**
    * The compression format. If no value is specified, the default is UNCOMPRESSED.
    */
  var CompressionFormat: typings.awsSdk.firehoseMod.CompressionFormat = js.native
  /**
    * The encryption configuration. If no value is specified, the default is no encryption.
    */
  var EncryptionConfiguration: typings.awsSdk.firehoseMod.EncryptionConfiguration = js.native
  /**
    * A prefix that Kinesis Data Firehose evaluates and adds to failed records before writing them to S3. This prefix appears immediately following the bucket name. For information about how to specify this prefix, see Custom Prefixes for Amazon S3 Objects.
    */
  var ErrorOutputPrefix: js.UndefOr[typings.awsSdk.firehoseMod.ErrorOutputPrefix] = js.native
  /**
    * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can also specify a custom prefix, as described in Custom Prefixes for Amazon S3 Objects.
    */
  var Prefix: js.UndefOr[typings.awsSdk.firehoseMod.Prefix] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: typings.awsSdk.firehoseMod.RoleARN = js.native
}

object S3DestinationDescription {
  @scala.inline
  def apply(
    BucketARN: BucketARN,
    BufferingHints: BufferingHints,
    CompressionFormat: CompressionFormat,
    EncryptionConfiguration: EncryptionConfiguration,
    RoleARN: RoleARN,
    CloudWatchLoggingOptions: CloudWatchLoggingOptions = null,
    ErrorOutputPrefix: ErrorOutputPrefix = null,
    Prefix: Prefix = null
  ): S3DestinationDescription = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any], BufferingHints = BufferingHints.asInstanceOf[js.Any], CompressionFormat = CompressionFormat.asInstanceOf[js.Any], EncryptionConfiguration = EncryptionConfiguration.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    if (CloudWatchLoggingOptions != null) __obj.updateDynamic("CloudWatchLoggingOptions")(CloudWatchLoggingOptions.asInstanceOf[js.Any])
    if (ErrorOutputPrefix != null) __obj.updateDynamic("ErrorOutputPrefix")(ErrorOutputPrefix.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DestinationDescription]
  }
}

