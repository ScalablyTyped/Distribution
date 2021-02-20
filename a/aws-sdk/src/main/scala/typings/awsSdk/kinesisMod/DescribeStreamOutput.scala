package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStreamOutput extends StObject {
  
  /**
    * The current status of the stream, the stream Amazon Resource Name (ARN), an array of shard objects that comprise the stream, and whether there are more shards available.
    */
  var StreamDescription: typings.awsSdk.kinesisMod.StreamDescription = js.native
}
object DescribeStreamOutput {
  
  @scala.inline
  def apply(StreamDescription: StreamDescription): DescribeStreamOutput = {
    val __obj = js.Dynamic.literal(StreamDescription = StreamDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamOutput]
  }
  
  @scala.inline
  implicit class DescribeStreamOutputMutableBuilder[Self <: DescribeStreamOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamDescription(value: StreamDescription): Self = StObject.set(x, "StreamDescription", value.asInstanceOf[js.Any])
  }
}
