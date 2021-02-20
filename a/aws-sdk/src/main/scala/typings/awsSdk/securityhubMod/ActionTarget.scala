package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionTarget extends StObject {
  
  /**
    * The ARN for the target action.
    */
  var ActionTargetArn: NonEmptyString = js.native
  
  /**
    * The description of the target action.
    */
  var Description: NonEmptyString = js.native
  
  /**
    * The name of the action target.
    */
  var Name: NonEmptyString = js.native
}
object ActionTarget {
  
  @scala.inline
  def apply(ActionTargetArn: NonEmptyString, Description: NonEmptyString, Name: NonEmptyString): ActionTarget = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTarget]
  }
  
  @scala.inline
  implicit class ActionTargetMutableBuilder[Self <: ActionTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionTargetArn(value: NonEmptyString): Self = StObject.set(x, "ActionTargetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
