package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAccountSettingResponse extends StObject {
  
  /**
    * The account setting for the specified principal ARN.
    */
  var setting: js.UndefOr[Setting] = js.native
}
object DeleteAccountSettingResponse {
  
  @scala.inline
  def apply(): DeleteAccountSettingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAccountSettingResponse]
  }
  
  @scala.inline
  implicit class DeleteAccountSettingResponseMutableBuilder[Self <: DeleteAccountSettingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetting(value: Setting): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingUndefined: Self = StObject.set(x, "setting", js.undefined)
  }
}
