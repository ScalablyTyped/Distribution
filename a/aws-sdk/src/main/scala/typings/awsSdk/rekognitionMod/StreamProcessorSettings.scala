package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamProcessorSettings extends js.Object {
  
  /**
    * Face search settings to use on a streaming video. 
    */
  var FaceSearch: js.UndefOr[FaceSearchSettings] = js.native
}
object StreamProcessorSettings {
  
  @scala.inline
  def apply(): StreamProcessorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamProcessorSettings]
  }
  
  @scala.inline
  implicit class StreamProcessorSettingsOps[Self <: StreamProcessorSettings] (val x: Self) extends AnyVal {
    
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
    def setFaceSearch(value: FaceSearchSettings): Self = this.set("FaceSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaceSearch: Self = this.set("FaceSearch", js.undefined)
  }
}
