package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLogStreamsResponse extends StObject {
  
  /**
    * The log streams.
    */
  var logStreams: js.UndefOr[LogStreams] = js.undefined
  
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeLogStreamsResponse {
  
  @scala.inline
  def apply(): DescribeLogStreamsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLogStreamsResponse]
  }
  
  @scala.inline
  implicit class DescribeLogStreamsResponseMutableBuilder[Self <: DescribeLogStreamsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogStreams(value: LogStreams): Self = StObject.set(x, "logStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStreamsUndefined: Self = StObject.set(x, "logStreams", js.undefined)
    
    @scala.inline
    def setLogStreamsVarargs(value: LogStream*): Self = StObject.set(x, "logStreams", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
