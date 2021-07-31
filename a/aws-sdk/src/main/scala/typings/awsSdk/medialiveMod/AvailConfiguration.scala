package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailConfiguration extends StObject {
  
  /**
    * Ad avail settings.
    */
  var AvailSettings: js.UndefOr[typings.awsSdk.medialiveMod.AvailSettings] = js.undefined
}
object AvailConfiguration {
  
  @scala.inline
  def apply(): AvailConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailConfiguration]
  }
  
  @scala.inline
  implicit class AvailConfigurationMutableBuilder[Self <: AvailConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailSettings(value: AvailSettings): Self = StObject.set(x, "AvailSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailSettingsUndefined: Self = StObject.set(x, "AvailSettings", js.undefined)
  }
}
