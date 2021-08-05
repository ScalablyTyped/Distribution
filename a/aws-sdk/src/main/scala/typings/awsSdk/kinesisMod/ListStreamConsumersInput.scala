package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamConsumersInput extends StObject {
  
  /**
    * The maximum number of consumers that you want a single call of ListStreamConsumers to return.
    */
  var MaxResults: js.UndefOr[ListStreamConsumersInputLimit] = js.undefined
  
  /**
    * When the number of consumers that are registered with the data stream is greater than the default value for the MaxResults parameter, or if you explicitly specify a value for MaxResults that is less than the number of consumers that are registered with the data stream, the response includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call to ListStreamConsumers to list the next set of registered consumers. Don't specify StreamName or StreamCreationTimestamp if you specify NextToken because the latter unambiguously identifies the stream. You can optionally specify a value for the MaxResults parameter when you specify NextToken. If you specify a MaxResults value that is less than the number of consumers that the operation returns if you don't specify MaxResults, the response will contain a new NextToken value. You can use the new NextToken value in a subsequent call to the ListStreamConsumers operation to list the next set of consumers.  Tokens expire after 300 seconds. When you obtain a value for NextToken in the response to a call to ListStreamConsumers, you have 300 seconds to use that value. If you specify an expired token in a call to ListStreamConsumers, you get ExpiredNextTokenException. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisMod.NextToken] = js.undefined
  
  /**
    * The ARN of the Kinesis data stream for which you want to list the registered consumers. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var StreamARN: typings.awsSdk.kinesisMod.StreamARN
  
  /**
    * Specify this input parameter to distinguish data streams that have the same name. For example, if you create a data stream and then delete it, and you later create another data stream with the same name, you can use this input parameter to specify which of the two streams you want to list the consumers for.  You can't specify this parameter if you specify the NextToken parameter. 
    */
  var StreamCreationTimestamp: js.UndefOr[Timestamp] = js.undefined
}
object ListStreamConsumersInput {
  
  inline def apply(StreamARN: StreamARN): ListStreamConsumersInput = {
    val __obj = js.Dynamic.literal(StreamARN = StreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamConsumersInput]
  }
  
  extension [Self <: ListStreamConsumersInput](x: Self) {
    
    inline def setMaxResults(value: ListStreamConsumersInputLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStreamARN(value: StreamARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamCreationTimestamp(value: Timestamp): Self = StObject.set(x, "StreamCreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStreamCreationTimestampUndefined: Self = StObject.set(x, "StreamCreationTimestamp", js.undefined)
  }
}
