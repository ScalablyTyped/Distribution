package typings.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHLSStreamingSessionURLOutput extends js.Object {
  
  /**
    * The URL (containing the session token) that a media player can use to retrieve the HLS master playlist.
    */
  var HLSStreamingSessionURL: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.HLSStreamingSessionURL] = js.native
}
object GetHLSStreamingSessionURLOutput {
  
  @scala.inline
  def apply(): GetHLSStreamingSessionURLOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHLSStreamingSessionURLOutput]
  }
  
  @scala.inline
  implicit class GetHLSStreamingSessionURLOutputOps[Self <: GetHLSStreamingSessionURLOutput] (val x: Self) extends AnyVal {
    
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
    def setHLSStreamingSessionURL(value: HLSStreamingSessionURL): Self = this.set("HLSStreamingSessionURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHLSStreamingSessionURL: Self = this.set("HLSStreamingSessionURL", js.undefined)
  }
}
