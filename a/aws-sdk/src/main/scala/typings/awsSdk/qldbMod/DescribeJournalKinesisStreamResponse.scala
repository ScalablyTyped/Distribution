package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJournalKinesisStreamResponse extends StObject {
  
  /**
    * Information about the QLDB journal stream returned by a DescribeJournalS3Export request.
    */
  var Stream: js.UndefOr[JournalKinesisStreamDescription] = js.native
}
object DescribeJournalKinesisStreamResponse {
  
  @scala.inline
  def apply(): DescribeJournalKinesisStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJournalKinesisStreamResponse]
  }
  
  @scala.inline
  implicit class DescribeJournalKinesisStreamResponseMutableBuilder[Self <: DescribeJournalKinesisStreamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStream(value: JournalKinesisStreamDescription): Self = StObject.set(x, "Stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "Stream", js.undefined)
  }
}
