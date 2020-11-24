package typings.dashjs.mod

import typings.dashjs.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDVRInfo extends js.Object {
  
  var manifestInfo: IManifestInfo = js.native
  
  var range: End = js.native
  
  var time: Double = js.native
}
object IDVRInfo {
  
  @scala.inline
  def apply(manifestInfo: IManifestInfo, range: End, time: Double): IDVRInfo = {
    val __obj = js.Dynamic.literal(manifestInfo = manifestInfo.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDVRInfo]
  }
  
  @scala.inline
  implicit class IDVRInfoOps[Self <: IDVRInfo] (val x: Self) extends AnyVal {
    
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
    def setManifestInfo(value: IManifestInfo): Self = this.set("manifestInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: End): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
  }
}
