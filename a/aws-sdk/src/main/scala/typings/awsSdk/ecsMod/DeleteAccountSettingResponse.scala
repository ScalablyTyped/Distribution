package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAccountSettingResponse extends StObject {
  
  /**
    * The account setting for the specified principal ARN.
    */
  var setting: js.UndefOr[Setting] = js.undefined
}
object DeleteAccountSettingResponse {
  
  inline def apply(): DeleteAccountSettingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAccountSettingResponse]
  }
  
  extension [Self <: DeleteAccountSettingResponse](x: Self) {
    
    inline def setSetting(value: Setting): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
    
    inline def setSettingUndefined: Self = StObject.set(x, "setting", js.undefined)
  }
}
