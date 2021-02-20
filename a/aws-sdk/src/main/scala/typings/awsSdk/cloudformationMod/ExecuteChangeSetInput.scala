package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteChangeSetInput extends StObject {
  
  /**
    * The name or ARN of the change set that you want use to update the specified stack.
    */
  var ChangeSetName: ChangeSetNameOrId = js.native
  
  /**
    * A unique identifier for this ExecuteChangeSet request. Specify this token if you plan to retry requests so that AWS CloudFormation knows that you're not attempting to execute a change set to update a stack with the same name. You might retry ExecuteChangeSet requests to ensure that AWS CloudFormation successfully received them.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.cloudformationMod.ClientRequestToken] = js.native
  
  /**
    * If you specified the name of a change set, specify the stack name or ID (ARN) that is associated with the change set you want to execute.
    */
  var StackName: js.UndefOr[StackNameOrId] = js.native
}
object ExecuteChangeSetInput {
  
  @scala.inline
  def apply(ChangeSetName: ChangeSetNameOrId): ExecuteChangeSetInput = {
    val __obj = js.Dynamic.literal(ChangeSetName = ChangeSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteChangeSetInput]
  }
  
  @scala.inline
  implicit class ExecuteChangeSetInputMutableBuilder[Self <: ExecuteChangeSetInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeSetName(value: ChangeSetNameOrId): Self = StObject.set(x, "ChangeSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setStackName(value: StackNameOrId): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackNameUndefined: Self = StObject.set(x, "StackName", js.undefined)
  }
}
