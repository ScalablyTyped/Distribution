package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPlaybackKeyPairRequest extends js.Object {
  
  /**
    * ARN of the key pair to be returned.
    */
  var arn: PlaybackKeyPairArn = js.native
}
object GetPlaybackKeyPairRequest {
  
  @scala.inline
  def apply(arn: PlaybackKeyPairArn): GetPlaybackKeyPairRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlaybackKeyPairRequest]
  }
  
  @scala.inline
  implicit class GetPlaybackKeyPairRequestOps[Self <: GetPlaybackKeyPairRequest] (val x: Self) extends AnyVal {
    
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
    def setArn(value: PlaybackKeyPairArn): Self = this.set("arn", value.asInstanceOf[js.Any])
  }
}
