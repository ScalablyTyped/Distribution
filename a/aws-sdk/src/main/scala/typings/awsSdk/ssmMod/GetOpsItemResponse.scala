package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOpsItemResponse extends StObject {
  
  /**
    * The OpsItem.
    */
  var OpsItem: js.UndefOr[typings.awsSdk.ssmMod.OpsItem] = js.native
}
object GetOpsItemResponse {
  
  @scala.inline
  def apply(): GetOpsItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpsItemResponse]
  }
  
  @scala.inline
  implicit class GetOpsItemResponseMutableBuilder[Self <: GetOpsItemResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpsItem(value: OpsItem): Self = StObject.set(x, "OpsItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsItemUndefined: Self = StObject.set(x, "OpsItem", js.undefined)
  }
}
