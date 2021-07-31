package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UdpContainerSettings extends StObject {
  
  var M2tsSettings: js.UndefOr[typings.awsSdk.medialiveMod.M2tsSettings] = js.undefined
}
object UdpContainerSettings {
  
  @scala.inline
  def apply(): UdpContainerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UdpContainerSettings]
  }
  
  @scala.inline
  implicit class UdpContainerSettingsMutableBuilder[Self <: UdpContainerSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setM2tsSettings(value: M2tsSettings): Self = StObject.set(x, "M2tsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM2tsSettingsUndefined: Self = StObject.set(x, "M2tsSettings", js.undefined)
  }
}
