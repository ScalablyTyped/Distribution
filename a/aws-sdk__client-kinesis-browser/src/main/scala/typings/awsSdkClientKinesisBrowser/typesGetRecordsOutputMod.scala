package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesRecordMod.UnmarshalledRecord
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetRecordsOutputMod {
  
  trait GetRecordsOutput
    extends StObject
       with OutputTypesUnion {
    
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
    def apply($metadata: ResponseMetadata, Records: js.Array[UnmarshalledRecord]): GetRecordsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRecordsOutput]
    }
    
    @scala.inline
    implicit class GetRecordsOutputMutableBuilder[Self <: GetRecordsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMillisBehindLatest(value: Double): Self = StObject.set(x, "MillisBehindLatest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMillisBehindLatestUndefined: Self = StObject.set(x, "MillisBehindLatest", js.undefined)
      
      @scala.inline
      def setNextShardIterator(value: String): Self = StObject.set(x, "NextShardIterator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextShardIteratorUndefined: Self = StObject.set(x, "NextShardIterator", js.undefined)
      
      @scala.inline
      def setRecords(value: js.Array[UnmarshalledRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: UnmarshalledRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
}
