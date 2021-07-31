package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomActionTypeOutput extends StObject {
  
  /**
    * Returns information about the details of an action type.
    */
  var actionType: ActionType
  
  /**
    * Specifies the tags applied to the custom action.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateCustomActionTypeOutput {
  
  @scala.inline
  def apply(actionType: ActionType): CreateCustomActionTypeOutput = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomActionTypeOutput]
  }
  
  @scala.inline
  implicit class CreateCustomActionTypeOutputMutableBuilder[Self <: CreateCustomActionTypeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: ActionType): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
