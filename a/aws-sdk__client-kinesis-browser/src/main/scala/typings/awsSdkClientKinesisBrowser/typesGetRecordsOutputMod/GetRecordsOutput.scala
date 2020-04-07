package typings.awsSdkClientKinesisBrowser.typesGetRecordsOutputMod

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesRecordMod.UnmarshalledRecord
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRecordsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The number of milliseconds the <a>GetRecords</a> response is from the tip of the stream, indicating how far behind current time the consumer is. A value of zero indicates that record processing is caught up, and there are no new records to process at this moment.</p>
    */
  var MillisBehindLatest: js.UndefOr[Double] = js.undefined
  /**
    * <p>The next position in the shard from which to start sequentially reading data records. If set to <code>null</code>, the shard has been closed and the requested iterator does not return any more data. </p>
    */
  var NextShardIterator: js.UndefOr[String] = js.undefined
  /**
    * <p>The data records retrieved from the shard.</p>
    */
  var Records: js.Array[UnmarshalledRecord]
}

object GetRecordsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Records: js.Array[UnmarshalledRecord],
    MillisBehindLatest: Int | Double = null,
    NextShardIterator: String = null
  ): GetRecordsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
    if (MillisBehindLatest != null) __obj.updateDynamic("MillisBehindLatest")(MillisBehindLatest.asInstanceOf[js.Any])
    if (NextShardIterator != null) __obj.updateDynamic("NextShardIterator")(NextShardIterator.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecordsOutput]
  }
}

