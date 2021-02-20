package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteChangeSetInput extends StObject {
  
  /**
    * The name or Amazon Resource Name (ARN) of the change set that you want to delete.
    */
  var ChangeSetName: ChangeSetNameOrId = js.native
  
  /**
    * If you specified the name of a change set to delete, specify the stack name or ID (ARN) that is associated with it.
    */
  var StackName: js.UndefOr[StackNameOrId] = js.native
}
object DeleteChangeSetInput {
  
  @scala.inline
  def apply(ChangeSetName: ChangeSetNameOrId): DeleteChangeSetInput = {
    val __obj = js.Dynamic.literal(ChangeSetName = ChangeSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChangeSetInput]
  }
  
  @scala.inline
  implicit class DeleteChangeSetInputMutableBuilder[Self <: DeleteChangeSetInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeSetName(value: ChangeSetNameOrId): Self = StObject.set(x, "ChangeSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackName(value: StackNameOrId): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackNameUndefined: Self = StObject.set(x, "StackName", js.undefined)
  }
}
