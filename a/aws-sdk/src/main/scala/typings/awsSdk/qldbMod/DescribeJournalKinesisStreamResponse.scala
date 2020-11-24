package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJournalKinesisStreamResponse extends js.Object {
  
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
  implicit class DescribeJournalKinesisStreamResponseOps[Self <: DescribeJournalKinesisStreamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStream(value: JournalKinesisStreamDescription): Self = this.set("Stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("Stream", js.undefined)
  }
}
