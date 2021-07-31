package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deployment extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: js.UndefOr[String] = js.undefined
  
  /**
    * Used to specify a stack or deployment command.
    */
  var Command: js.UndefOr[DeploymentCommand] = js.undefined
  
  /**
    * A user-defined comment.
    */
  var Comment: js.UndefOr[String] = js.undefined
  
  /**
    * Date when the deployment completed.
    */
  var CompletedAt: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Date when the deployment was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.undefined
  
  /**
    * A string that contains user-defined custom JSON. It can be used to override the corresponding default stack configuration attribute values for stack or to pass data to recipes. The string should be in the following format:  "{\"key1\": \"value1\", \"key2\": \"value2\",...}"  For more information on custom JSON, see Use Custom JSON to Modify the Stack Configuration Attributes.
    */
  var CustomJson: js.UndefOr[String] = js.undefined
  
  /**
    * The deployment ID.
    */
  var DeploymentId: js.UndefOr[String] = js.undefined
  
  /**
    * The deployment duration.
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  
  /**
    * The user's IAM ARN.
    */
  var IamUserArn: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs of the target instances.
    */
  var InstanceIds: js.UndefOr[Strings] = js.undefined
  
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
  
  /**
    * The deployment status:   running   successful   failed  
    */
  var Status: js.UndefOr[String] = js.undefined
}
object Deployment {
  
  @scala.inline
  def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  
  @scala.inline
  implicit class DeploymentMutableBuilder[Self <: Deployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "AppId", js.undefined)
    
    @scala.inline
    def setCommand(value: DeploymentCommand): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "Command", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setCompletedAt(value: DateTime): Self = StObject.set(x, "CompletedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedAtUndefined: Self = StObject.set(x, "CompletedAt", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: DateTime): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setCustomJson(value: String): Self = StObject.set(x, "CustomJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomJsonUndefined: Self = StObject.set(x, "CustomJson", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: String): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
    
    @scala.inline
    def setDuration(value: Integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    @scala.inline
    def setIamUserArn(value: String): Self = StObject.set(x, "IamUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamUserArnUndefined: Self = StObject.set(x, "IamUserArn", js.undefined)
    
    @scala.inline
    def setInstanceIds(value: Strings): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdsUndefined: Self = StObject.set(x, "InstanceIds", js.undefined)
    
    @scala.inline
    def setInstanceIdsVarargs(value: String*): Self = StObject.set(x, "InstanceIds", js.Array(value :_*))
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
