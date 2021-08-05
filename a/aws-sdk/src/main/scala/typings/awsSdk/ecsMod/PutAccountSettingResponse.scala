package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAccountSettingResponse extends StObject {
  
  /**
    * The current account setting for a resource.
    */
  var setting: js.UndefOr[Setting] = js.undefined
}
object PutAccountSettingResponse {
  
  inline def apply(): PutAccountSettingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAccountSettingResponse]
  }
  
  extension [Self <: PutAccountSettingResponse](x: Self) {
    
    inline def setSetting(value: Setting): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
    
    inline def setSettingUndefined: Self = StObject.set(x, "setting", js.undefined)
  }
}
