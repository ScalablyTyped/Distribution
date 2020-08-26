package typings.awsSdkClientKinesisBrowser.typesGetRecordsOutputMod

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesRecordMod.UnmarshalledRecord
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecordsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The number of milliseconds the <a>GetRecords</a> response is from the tip of the stream, indicating how far behind current time the consumer is. A value of zero indicates that record processing is caught up, and there are no new records to process at this moment.</p>
    */
  var MillisBehindLatest: js.UndefOr[Double] = js.native
  /**
    * <p>The next position in the shard from which to start sequentially reading data records. If set to <code>null</code>, the shard has been closed and the requested iterator does not return any more data. </p>
    */
  var NextShardIterator: js.UndefOr[String] = js.native
  /**
    * <p>The data records retrieved from the shard.</p>
    */
  var Records: js.Array[UnmarshalledRecord] = js.native
}

object GetRecordsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Records: js.Array[UnmarshalledRecord]): GetRecordsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecordsOutput]
  }
  @scala.inline
  implicit class GetRecordsOutputOps[Self <: GetRecordsOutput] (val x: Self) extends AnyVal {
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordsVarargs(value: UnmarshalledRecord*): Self = this.set("Records", js.Array(value :_*))
    @scala.inline
    def setRecords(value: js.Array[UnmarshalledRecord]): Self = this.set("Records", value.asInstanceOf[js.Any])
    @scala.inline
    def setMillisBehindLatest(value: Double): Self = this.set("MillisBehindLatest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMillisBehindLatest: Self = this.set("MillisBehindLatest", js.undefined)
    @scala.inline
    def setNextShardIterator(value: String): Self = this.set("NextShardIterator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextShardIterator: Self = this.set("NextShardIterator", js.undefined)
  }
  
}

