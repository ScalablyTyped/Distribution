package typings.dashjs.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IManifestInfo extends js.Object {
  
  var DVRWindowSize: Double = js.native
  
  var availableFrom: Date = js.native
  
  var duration: Double = js.native
  
  var isDynamic: Boolean = js.native
  
  var loadedTime: Date = js.native
  
  var maxFragmentDuration: Double = js.native
  
  var minBufferTime: Double = js.native
}
object IManifestInfo {
  
  @scala.inline
  def apply(
    DVRWindowSize: Double,
    availableFrom: Date,
    duration: Double,
    isDynamic: Boolean,
    loadedTime: Date,
    maxFragmentDuration: Double,
    minBufferTime: Double
  ): IManifestInfo = {
    val __obj = js.Dynamic.literal(DVRWindowSize = DVRWindowSize.asInstanceOf[js.Any], availableFrom = availableFrom.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], isDynamic = isDynamic.asInstanceOf[js.Any], loadedTime = loadedTime.asInstanceOf[js.Any], maxFragmentDuration = maxFragmentDuration.asInstanceOf[js.Any], minBufferTime = minBufferTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IManifestInfo]
  }
  
  @scala.inline
  implicit class IManifestInfoOps[Self <: IManifestInfo] (val x: Self) extends AnyVal {
    
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
    def setDVRWindowSize(value: Double): Self = this.set("DVRWindowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableFrom(value: Date): Self = this.set("availableFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDynamic(value: Boolean): Self = this.set("isDynamic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadedTime(value: Date): Self = this.set("loadedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFragmentDuration(value: Double): Self = this.set("maxFragmentDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinBufferTime(value: Double): Self = this.set("minBufferTime", value.asInstanceOf[js.Any])
  }
}
