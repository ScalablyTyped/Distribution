package typings.awsSdk.dynamodbstreamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStreamsOutput extends StObject {
  
  /**
    * The stream ARN of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedStreamArn is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If LastEvaluatedStreamArn is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedStreamArn is empty.
    */
  var LastEvaluatedStreamArn: js.UndefOr[StreamArn] = js.native
  
  /**
    * A list of stream descriptors associated with the current account and endpoint.
    */
  var Streams: js.UndefOr[StreamList] = js.native
}
object ListStreamsOutput {
  
  @scala.inline
  def apply(): ListStreamsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamsOutput]
  }
  
  @scala.inline
  implicit class ListStreamsOutputMutableBuilder[Self <: ListStreamsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastEvaluatedStreamArn(value: StreamArn): Self = StObject.set(x, "LastEvaluatedStreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEvaluatedStreamArnUndefined: Self = StObject.set(x, "LastEvaluatedStreamArn", js.undefined)
    
    @scala.inline
    def setStreams(value: StreamList): Self = StObject.set(x, "Streams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamsUndefined: Self = StObject.set(x, "Streams", js.undefined)
    
    @scala.inline
    def setStreamsVarargs(value: Stream*): Self = StObject.set(x, "Streams", js.Array(value :_*))
  }
}
