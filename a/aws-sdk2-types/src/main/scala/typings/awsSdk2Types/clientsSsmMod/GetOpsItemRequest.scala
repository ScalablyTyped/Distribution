package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOpsItemRequest extends StObject {
  
  /**
    * The OpsItem Amazon Resource Name (ARN).
    */
  var OpsItemArn: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.OpsItemArn] = js.undefined
  
  /**
    * The ID of the OpsItem that you want to get.
    */
  var OpsItemId: typings.awsSdk2Types.clientsSsmMod.OpsItemId
}
object GetOpsItemRequest {
  
  inline def apply(OpsItemId: OpsItemId): GetOpsItemRequest = {
    val __obj = js.Dynamic.literal(OpsItemId = OpsItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpsItemRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOpsItemRequest] (val x: Self) extends AnyVal {
    
    inline def setOpsItemArn(value: OpsItemArn): Self = StObject.set(x, "OpsItemArn", value.asInstanceOf[js.Any])
    
    inline def setOpsItemArnUndefined: Self = StObject.set(x, "OpsItemArn", js.undefined)
    
    inline def setOpsItemId(value: OpsItemId): Self = StObject.set(x, "OpsItemId", value.asInstanceOf[js.Any])
  }
}
