package typings.atAwsDashSdkClientDashKinesisDashBrowser

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreRecordMod._UnmarshalledRecord
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/types/GetRecordsOutput", JSImport.Namespace)
@js.native
object typesGetRecordsOutputMod extends js.Object {
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
    var Records: js.Array[_UnmarshalledRecord] = js.native
  }
  
}

