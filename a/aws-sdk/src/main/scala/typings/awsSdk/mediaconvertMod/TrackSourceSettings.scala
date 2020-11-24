package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackSourceSettings extends js.Object {
  
  /**
    * Use this setting to select a single captions track from a source. Track numbers correspond to the order in the captions source file. For IMF sources, track numbering is based on the order that the captions appear in the CPL. For example, use 1 to select the captions asset that is listed first in the CPL. To include more than one captions track in your job outputs, create multiple input captions selectors. Specify one track per selector.
    */
  var TrackNumber: js.UndefOr[integerMin1Max2147483647] = js.native
}
object TrackSourceSettings {
  
  @scala.inline
  def apply(): TrackSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackSourceSettings]
  }
  
  @scala.inline
  implicit class TrackSourceSettingsOps[Self <: TrackSourceSettings] (val x: Self) extends AnyVal {
    
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
    def setTrackNumber(value: integerMin1Max2147483647): Self = this.set("TrackNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackNumber: Self = this.set("TrackNumber", js.undefined)
  }
}
