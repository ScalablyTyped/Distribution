package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStreamProcessorResponse extends js.Object {
  
  /**
    * ARN for the newly create stream processor.
    */
  var StreamProcessorArn: js.UndefOr[typings.awsSdk.rekognitionMod.StreamProcessorArn] = js.native
}
object CreateStreamProcessorResponse {
  
  @scala.inline
  def apply(): CreateStreamProcessorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamProcessorResponse]
  }
  
  @scala.inline
  implicit class CreateStreamProcessorResponseOps[Self <: CreateStreamProcessorResponse] (val x: Self) extends AnyVal {
    
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
    def setStreamProcessorArn(value: StreamProcessorArn): Self = this.set("StreamProcessorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamProcessorArn: Self = this.set("StreamProcessorArn", js.undefined)
  }
}
