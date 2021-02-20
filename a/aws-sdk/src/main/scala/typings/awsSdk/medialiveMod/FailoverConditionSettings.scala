package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailoverConditionSettings extends StObject {
  
  /**
    * MediaLive will perform a failover if content is not detected in this input for the specified period.
    */
  var InputLossSettings: js.UndefOr[InputLossFailoverSettings] = js.native
}
object FailoverConditionSettings {
  
  @scala.inline
  def apply(): FailoverConditionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverConditionSettings]
  }
  
  @scala.inline
  implicit class FailoverConditionSettingsMutableBuilder[Self <: FailoverConditionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputLossSettings(value: InputLossFailoverSettings): Self = StObject.set(x, "InputLossSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputLossSettingsUndefined: Self = StObject.set(x, "InputLossSettings", js.undefined)
  }
}
