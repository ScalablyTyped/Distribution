package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStreamSummaryOutput extends StObject {
  
  /**
    * A StreamDescriptionSummary containing information about the stream.
    */
  var StreamDescriptionSummary: typings.awsSdk.kinesisMod.StreamDescriptionSummary
}
object DescribeStreamSummaryOutput {
  
  @scala.inline
  def apply(StreamDescriptionSummary: StreamDescriptionSummary): DescribeStreamSummaryOutput = {
    val __obj = js.Dynamic.literal(StreamDescriptionSummary = StreamDescriptionSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamSummaryOutput]
  }
  
  @scala.inline
  implicit class DescribeStreamSummaryOutputMutableBuilder[Self <: DescribeStreamSummaryOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamDescriptionSummary(value: StreamDescriptionSummary): Self = StObject.set(x, "StreamDescriptionSummary", value.asInstanceOf[js.Any])
  }
}
