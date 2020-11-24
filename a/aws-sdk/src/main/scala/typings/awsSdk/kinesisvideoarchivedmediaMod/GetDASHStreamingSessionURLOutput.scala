package typings.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDASHStreamingSessionURLOutput extends js.Object {
  
  /**
    * The URL (containing the session token) that a media player can use to retrieve the MPEG-DASH manifest.
    */
  var DASHStreamingSessionURL: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.DASHStreamingSessionURL] = js.native
}
object GetDASHStreamingSessionURLOutput {
  
  @scala.inline
  def apply(): GetDASHStreamingSessionURLOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDASHStreamingSessionURLOutput]
  }
  
  @scala.inline
  implicit class GetDASHStreamingSessionURLOutputOps[Self <: GetDASHStreamingSessionURLOutput] (val x: Self) extends AnyVal {
    
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
    def setDASHStreamingSessionURL(value: DASHStreamingSessionURL): Self = this.set("DASHStreamingSessionURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDASHStreamingSessionURL: Self = this.set("DASHStreamingSessionURL", js.undefined)
  }
}
