package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateActionTargetRequest extends StObject {
  
  /**
    * The ARN of the custom action target to update.
    */
  var ActionTargetArn: NonEmptyString = js.native
  
  /**
    * The updated description for the custom action target.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The updated name of the custom action target.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
}
object UpdateActionTargetRequest {
  
  @scala.inline
  def apply(ActionTargetArn: NonEmptyString): UpdateActionTargetRequest = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateActionTargetRequest]
  }
  
  @scala.inline
  implicit class UpdateActionTargetRequestMutableBuilder[Self <: UpdateActionTargetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionTargetArn(value: NonEmptyString): Self = StObject.set(x, "ActionTargetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
