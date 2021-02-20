package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetServiceSettingResult extends StObject {
  
  /**
    * The current, effective service setting after calling the ResetServiceSetting API action.
    */
  var ServiceSetting: js.UndefOr[typings.awsSdk.ssmMod.ServiceSetting] = js.native
}
object ResetServiceSettingResult {
  
  @scala.inline
  def apply(): ResetServiceSettingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetServiceSettingResult]
  }
  
  @scala.inline
  implicit class ResetServiceSettingResultMutableBuilder[Self <: ResetServiceSettingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceSetting(value: ServiceSetting): Self = StObject.set(x, "ServiceSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceSettingUndefined: Self = StObject.set(x, "ServiceSetting", js.undefined)
  }
}
