package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTargetGroupRequest extends StObject {
  
  /**
    * The ID or Amazon Resource Name (ARN) of the target group.
    */
  var targetGroupIdentifier: TargetGroupIdentifier
}
object GetTargetGroupRequest {
  
  inline def apply(targetGroupIdentifier: TargetGroupIdentifier): GetTargetGroupRequest = {
    val __obj = js.Dynamic.literal(targetGroupIdentifier = targetGroupIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTargetGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTargetGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setTargetGroupIdentifier(value: TargetGroupIdentifier): Self = StObject.set(x, "targetGroupIdentifier", value.asInstanceOf[js.Any])
  }
}
