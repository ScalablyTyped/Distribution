package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStreamsResponse extends StObject {
  
  /**
    * A token used to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list of streams.
    */
  var streams: js.UndefOr[StreamsSummary] = js.native
}
object ListStreamsResponse {
  
  @scala.inline
  def apply(): ListStreamsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamsResponse]
  }
  
  @scala.inline
  implicit class ListStreamsResponseMutableBuilder[Self <: ListStreamsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setStreams(value: StreamsSummary): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
    
    @scala.inline
    def setStreamsVarargs(value: StreamSummary*): Self = StObject.set(x, "streams", js.Array(value :_*))
  }
}
