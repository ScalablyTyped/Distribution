package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamProcessor extends js.Object {
  /**
    * Name of the Amazon Rekognition stream processor. 
    */
  var Name: js.UndefOr[StreamProcessorName] = js.native
  /**
    * Current status of the Amazon Rekognition stream processor.
    */
  var Status: js.UndefOr[StreamProcessorStatus] = js.native
}

object StreamProcessor {
  @scala.inline
  def apply(): StreamProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamProcessor]
  }
  @scala.inline
  implicit class StreamProcessorOps[Self <: StreamProcessor] (val x: Self) extends AnyVal {
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
    def setName(value: StreamProcessorName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setStatus(value: StreamProcessorStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

