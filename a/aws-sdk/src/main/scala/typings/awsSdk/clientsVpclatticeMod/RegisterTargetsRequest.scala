package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterTargetsRequest extends StObject {
  
  /**
    * The ID or Amazon Resource Name (ARN) of the target group.
    */
  var targetGroupIdentifier: TargetGroupIdentifier
  
  /**
    * The targets.
    */
  var targets: RegisterTargetsRequestTargetsList
}
object RegisterTargetsRequest {
  
  inline def apply(targetGroupIdentifier: TargetGroupIdentifier, targets: RegisterTargetsRequestTargetsList): RegisterTargetsRequest = {
    val __obj = js.Dynamic.literal(targetGroupIdentifier = targetGroupIdentifier.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTargetsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterTargetsRequest] (val x: Self) extends AnyVal {
    
    inline def setTargetGroupIdentifier(value: TargetGroupIdentifier): Self = StObject.set(x, "targetGroupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTargets(value: RegisterTargetsRequestTargetsList): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}
