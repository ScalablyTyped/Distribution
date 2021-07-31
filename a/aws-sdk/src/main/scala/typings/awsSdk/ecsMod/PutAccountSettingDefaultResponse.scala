package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAccountSettingDefaultResponse extends StObject {
  
  var setting: js.UndefOr[Setting] = js.undefined
}
object PutAccountSettingDefaultResponse {
  
  @scala.inline
  def apply(): PutAccountSettingDefaultResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAccountSettingDefaultResponse]
  }
  
  @scala.inline
  implicit class PutAccountSettingDefaultResponseMutableBuilder[Self <: PutAccountSettingDefaultResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetting(value: Setting): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingUndefined: Self = StObject.set(x, "setting", js.undefined)
  }
}
