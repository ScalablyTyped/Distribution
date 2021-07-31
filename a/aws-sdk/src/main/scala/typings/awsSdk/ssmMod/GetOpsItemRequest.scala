package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOpsItemRequest extends StObject {
  
  /**
    * The ID of the OpsItem that you want to get.
    */
  var OpsItemId: typings.awsSdk.ssmMod.OpsItemId
}
object GetOpsItemRequest {
  
  @scala.inline
  def apply(OpsItemId: OpsItemId): GetOpsItemRequest = {
    val __obj = js.Dynamic.literal(OpsItemId = OpsItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpsItemRequest]
  }
  
  @scala.inline
  implicit class GetOpsItemRequestMutableBuilder[Self <: GetOpsItemRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpsItemId(value: OpsItemId): Self = StObject.set(x, "OpsItemId", value.asInstanceOf[js.Any])
  }
}
