package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemovePermissionInput extends StObject {
  
  /**
    * The unique label of the statement you want to remove.
    */
  var Label: label
  
  /**
    * The ARN of the topic whose access control policy you wish to modify.
    */
  var TopicArn: topicARN
}
object RemovePermissionInput {
  
  @scala.inline
  def apply(Label: label, TopicArn: topicARN): RemovePermissionInput = {
    val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovePermissionInput]
  }
  
  @scala.inline
  implicit class RemovePermissionInputMutableBuilder[Self <: RemovePermissionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: label): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicArn(value: topicARN): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
  }
}
