package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UdpContainerSettings extends js.Object {
  
  var M2tsSettings: js.UndefOr[typings.awsSdk.medialiveMod.M2tsSettings] = js.native
}
object UdpContainerSettings {
  
  @scala.inline
  def apply(): UdpContainerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UdpContainerSettings]
  }
  
  @scala.inline
  implicit class UdpContainerSettingsOps[Self <: UdpContainerSettings] (val x: Self) extends AnyVal {
    
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
    def setM2tsSettings(value: M2tsSettings): Self = this.set("M2tsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteM2tsSettings: Self = this.set("M2tsSettings", js.undefined)
  }
}
