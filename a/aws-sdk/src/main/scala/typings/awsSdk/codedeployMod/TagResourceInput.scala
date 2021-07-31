package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceInput extends StObject {
  
  /**
    *  The ARN of a resource, such as a CodeDeploy application or deployment group. 
    */
  var ResourceArn: Arn
  
  /**
    *  A list of tags that TagResource associates with a resource. The resource is identified by the ResourceArn input parameter. 
    */
  var Tags: TagList
}
object TagResourceInput {
  
  @scala.inline
  def apply(ResourceArn: Arn, Tags: TagList): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceInput]
  }
  
  @scala.inline
  implicit class TagResourceInputMutableBuilder[Self <: TagResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
