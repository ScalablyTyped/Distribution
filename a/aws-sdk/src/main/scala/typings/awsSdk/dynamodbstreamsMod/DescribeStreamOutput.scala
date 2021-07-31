package typings.awsSdk.dynamodbstreamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStreamOutput extends StObject {
  
  /**
    * A complete description of the stream, including its creation date and time, the DynamoDB table associated with the stream, the shard IDs within the stream, and the beginning and ending sequence numbers of stream records within the shards.
    */
  var StreamDescription: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.StreamDescription] = js.undefined
}
object DescribeStreamOutput {
  
  @scala.inline
  def apply(): DescribeStreamOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStreamOutput]
  }
  
  @scala.inline
  implicit class DescribeStreamOutputMutableBuilder[Self <: DescribeStreamOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamDescription(value: StreamDescription): Self = StObject.set(x, "StreamDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamDescriptionUndefined: Self = StObject.set(x, "StreamDescription", js.undefined)
  }
}
