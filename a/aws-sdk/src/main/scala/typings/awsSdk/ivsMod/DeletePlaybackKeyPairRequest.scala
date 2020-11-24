package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePlaybackKeyPairRequest extends js.Object {
  
  /**
    * ARN of the key pair to be deleted.
    */
  var arn: PlaybackKeyPairArn = js.native
}
object DeletePlaybackKeyPairRequest {
  
  @scala.inline
  def apply(arn: PlaybackKeyPairArn): DeletePlaybackKeyPairRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePlaybackKeyPairRequest]
  }
  
  @scala.inline
  implicit class DeletePlaybackKeyPairRequestOps[Self <: DeletePlaybackKeyPairRequest] (val x: Self) extends AnyVal {
    
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
