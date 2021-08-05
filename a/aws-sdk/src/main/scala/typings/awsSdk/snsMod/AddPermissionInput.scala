package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddPermissionInput extends StObject {
  
  /**
    * The AWS account IDs of the users (principals) who will be given access to the specified actions. The users must have AWS accounts, but do not need to be signed up for this service.
    */
  var AWSAccountId: DelegatesList
  
  /**
    * The action you want to allow for the specified principal(s). Valid values: Any Amazon SNS action name, for example Publish.
    */
  var ActionName: ActionsList
  
  /**
    * A unique identifier for the new policy statement.
    */
  var Label: label
  
  /**
    * The ARN of the topic whose access control policy you wish to modify.
    */
  var TopicArn: topicARN
}
object AddPermissionInput {
  
  inline def apply(AWSAccountId: DelegatesList, ActionName: ActionsList, Label: label, TopicArn: topicARN): AddPermissionInput = {
    val __obj = js.Dynamic.literal(AWSAccountId = AWSAccountId.asInstanceOf[js.Any], ActionName = ActionName.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPermissionInput]
  }
  
  extension [Self <: AddPermissionInput](x: Self) {
    
    inline def setAWSAccountId(value: DelegatesList): Self = StObject.set(x, "AWSAccountId", value.asInstanceOf[js.Any])
    
    inline def setAWSAccountIdVarargs(value: delegate*): Self = StObject.set(x, "AWSAccountId", js.Array(value :_*))
    
    inline def setActionName(value: ActionsList): Self = StObject.set(x, "ActionName", value.asInstanceOf[js.Any])
    
    inline def setActionNameVarargs(value: action*): Self = StObject.set(x, "ActionName", js.Array(value :_*))
    
    inline def setLabel(value: label): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setTopicArn(value: topicARN): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
  }
}
