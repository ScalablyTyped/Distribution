package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStreamResponse extends js.Object {
  
  /**
    * Information about the stream.
    */
  var streamInfo: js.UndefOr[StreamInfo] = js.native
}
object DescribeStreamResponse {
  
  @scala.inline
  def apply(): DescribeStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStreamResponse]
  }
  
  @scala.inline
  implicit class DescribeStreamResponseOps[Self <: DescribeStreamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStreamInfo(value: StreamInfo): Self = this.set("streamInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamInfo: Self = this.set("streamInfo", js.undefined)
  }
}
