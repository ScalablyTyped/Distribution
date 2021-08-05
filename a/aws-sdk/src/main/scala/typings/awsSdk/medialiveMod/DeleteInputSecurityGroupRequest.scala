package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInputSecurityGroupRequest extends StObject {
  
  /**
    * The Input Security Group to delete
    */
  var InputSecurityGroupId: string
}
object DeleteInputSecurityGroupRequest {
  
  inline def apply(InputSecurityGroupId: string): DeleteInputSecurityGroupRequest = {
    val __obj = js.Dynamic.literal(InputSecurityGroupId = InputSecurityGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInputSecurityGroupRequest]
  }
  
  extension [Self <: DeleteInputSecurityGroupRequest](x: Self) {
    
    inline def setInputSecurityGroupId(value: string): Self = StObject.set(x, "InputSecurityGroupId", value.asInstanceOf[js.Any])
  }
}
