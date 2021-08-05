package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AFTER_SEQUENCE_NUMBER
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AT_SEQUENCE_NUMBER
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AT_TIMESTAMP
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.LATEST
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.TRIM_HORIZON
import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetShardIteratorInputMod {
  
  trait GetShardIteratorInput
    extends StObject
       with InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The shard ID of the Kinesis Data Streams shard to get the iterator for.</p>
      */
    var ShardId: String
    
    /**
      * <p>Determines how the shard iterator is used to start reading data records from the shard.</p> <p>The following are the valid Amazon Kinesis shard iterator types:</p> <ul> <li> <p>AT_SEQUENCE_NUMBER - Start reading from the position denoted by a specific sequence number, provided in the value <code>StartingSequenceNumber</code>.</p> </li> <li> <p>AFTER_SEQUENCE_NUMBER - Start reading right after the position denoted by a specific sequence number, provided in the value <code>StartingSequenceNumber</code>.</p> </li> <li> <p>AT_TIMESTAMP - Start reading from the position denoted by a specific time stamp, provided in the value <code>Timestamp</code>.</p> </li> <li> <p>TRIM_HORIZON - Start reading at the last untrimmed record in the shard in the system, which is the oldest data record in the shard.</p> </li> <li> <p>LATEST - Start reading just after the most recent record in the shard, so that you always read the most recent data in the shard.</p> </li> </ul>
      */
    var ShardIteratorType: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String
    
    /**
      * <p>The sequence number of the data record in the shard from which to start reading. Used with shard iterator type AT_SEQUENCE_NUMBER and AFTER_SEQUENCE_NUMBER.</p>
      */
    var StartingSequenceNumber: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name of the Amazon Kinesis data stream.</p>
      */
    var StreamName: String
    
    /**
      * <p>The time stamp of the data record from which to start reading. Used with shard iterator type AT_TIMESTAMP. A time stamp is the Unix epoch date with precision in milliseconds. For example, <code>2016-04-04T19:58:46.480-00:00</code> or <code>1459799926.480</code>. If a record with this exact time stamp does not exist, the iterator returned is for the next (later) record. If the time stamp is older than the current trim horizon, the iterator returned is for the oldest untrimmed data record (TRIM_HORIZON).</p>
      */
    var Timestamp: js.UndefOr[Date | String | Double] = js.undefined
  }
  object GetShardIteratorInput {
    
    inline def apply(
      ShardId: String,
      ShardIteratorType: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String,
      StreamName: String
    ): GetShardIteratorInput = {
      val __obj = js.Dynamic.literal(ShardId = ShardId.asInstanceOf[js.Any], ShardIteratorType = ShardIteratorType.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetShardIteratorInput]
    }
    
    extension [Self <: GetShardIteratorInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setShardId(value: String): Self = StObject.set(x, "ShardId", value.asInstanceOf[js.Any])
      
      inline def setShardIteratorType(value: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String): Self = StObject.set(x, "ShardIteratorType", value.asInstanceOf[js.Any])
      
      inline def setStartingSequenceNumber(value: String): Self = StObject.set(x, "StartingSequenceNumber", value.asInstanceOf[js.Any])
      
      inline def setStartingSequenceNumberUndefined: Self = StObject.set(x, "StartingSequenceNumber", js.undefined)
      
      inline def setStreamName(value: String): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Date | String | Double): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    }
  }
}
