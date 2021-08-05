package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionTarget extends StObject {
  
  /**
    * The ARN for the target action.
    */
  var ActionTargetArn: NonEmptyString
  
  /**
    * The description of the target action.
    */
  var Description: NonEmptyString
  
  /**
    * The name of the action target.
    */
  var Name: NonEmptyString
}
object ActionTarget {
  
  inline def apply(ActionTargetArn: NonEmptyString, Description: NonEmptyString, Name: NonEmptyString): ActionTarget = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTarget]
  }
  
  extension [Self <: ActionTarget](x: Self) {
    
    inline def setActionTargetArn(value: NonEmptyString): Self = StObject.set(x, "ActionTargetArn", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
