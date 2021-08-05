package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOpsItemResponse extends StObject {
  
  /**
    * The OpsItem.
    */
  var OpsItem: js.UndefOr[typings.awsSdk.ssmMod.OpsItem] = js.undefined
}
object GetOpsItemResponse {
  
  inline def apply(): GetOpsItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpsItemResponse]
  }
  
  extension [Self <: GetOpsItemResponse](x: Self) {
    
    inline def setOpsItem(value: OpsItem): Self = StObject.set(x, "OpsItem", value.asInstanceOf[js.Any])
    
    inline def setOpsItemUndefined: Self = StObject.set(x, "OpsItem", js.undefined)
  }
}
