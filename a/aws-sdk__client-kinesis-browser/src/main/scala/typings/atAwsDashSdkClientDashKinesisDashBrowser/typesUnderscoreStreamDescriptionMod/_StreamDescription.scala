package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreStreamDescriptionMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.ACTIVE
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.CREATING
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.DELETING
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.KMS
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.NONE
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.UPDATING
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreEnhancedMetricsMod._EnhancedMetrics
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreShardMod._Shard
import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _StreamDescription extends js.Object {
  /**
    * <p>The server-side encryption type used on the stream. This parameter can be one of the following values:</p> <ul> <li> <p> <code>NONE</code>: Do not encrypt the records in the stream.</p> </li> <li> <p> <code>KMS</code>: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.</p> </li> </ul>
    */
  var EncryptionType: js.UndefOr[NONE | KMS | String] = js.undefined
  /**
    * <p>Represents the current enhanced monitoring settings of the stream.</p>
    */
  var EnhancedMonitoring: js.Array[_EnhancedMetrics] | Iterable[_EnhancedMetrics]
  /**
    * <p>If set to <code>true</code>, more shards in the stream are available to describe.</p>
    */
  var HasMoreShards: Boolean
  /**
    * <p>The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias <code>aws/kinesis</code>.</p> <ul> <li> <p>Key ARN example: <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code> </p> </li> <li> <p>Alias ARN example: <code>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code> </p> </li> <li> <p>Globally unique key ID example: <code>12345678-1234-1234-1234-123456789012</code> </p> </li> <li> <p>Alias name example: <code>alias/MyAliasName</code> </p> </li> <li> <p>Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code> </p> </li> </ul>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  /**
    * <p>The current retention period, in hours.</p>
    */
  var RetentionPeriodHours: Double
  /**
    * <p>The shards that comprise the stream.</p>
    */
  var Shards: js.Array[_Shard] | Iterable[_Shard]
  /**
    * <p>The Amazon Resource Name (ARN) for the stream being described.</p>
    */
  var StreamARN: String
  /**
    * <p>The approximate time that the stream was created.</p>
    */
  var StreamCreationTimestamp: Date | String | Double
  /**
    * <p>The name of the stream being described.</p>
    */
  var StreamName: String
  /**
    * <p>The current status of the stream being described. The stream status is one of the following states:</p> <ul> <li> <p> <code>CREATING</code> - The stream is being created. Kinesis Data Streams immediately returns and sets <code>StreamStatus</code> to <code>CREATING</code>.</p> </li> <li> <p> <code>DELETING</code> - The stream is being deleted. The specified stream is in the <code>DELETING</code> state until Kinesis Data Streams completes the deletion.</p> </li> <li> <p> <code>ACTIVE</code> - The stream exists and is ready for read and write operations or deletion. You should perform read and write operations only on an <code>ACTIVE</code> stream.</p> </li> <li> <p> <code>UPDATING</code> - Shards in the stream are being merged or split. Read and write operations continue to work while the stream is in the <code>UPDATING</code> state.</p> </li> </ul>
    */
  var StreamStatus: CREATING | DELETING | ACTIVE | UPDATING | String
}

object _StreamDescription {
  @scala.inline
  def apply(
    EnhancedMonitoring: js.Array[_EnhancedMetrics] | Iterable[_EnhancedMetrics],
    HasMoreShards: Boolean,
    RetentionPeriodHours: Double,
    Shards: js.Array[_Shard] | Iterable[_Shard],
    StreamARN: String,
    StreamCreationTimestamp: Date | String | Double,
    StreamName: String,
    StreamStatus: CREATING | DELETING | ACTIVE | UPDATING | String,
    EncryptionType: NONE | KMS | String = null,
    KeyId: String = null
  ): _StreamDescription = {
    val __obj = js.Dynamic.literal(EnhancedMonitoring = EnhancedMonitoring.asInstanceOf[js.Any], HasMoreShards = HasMoreShards.asInstanceOf[js.Any], RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], Shards = Shards.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any], StreamCreationTimestamp = StreamCreationTimestamp.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], StreamStatus = StreamStatus.asInstanceOf[js.Any])
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[_StreamDescription]
  }
}

