package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    *  An array of key-value pairs used to tag an associated repository. A tag is a custom attribute label with two parts:    A tag key (for example, CostCenter, Environment, Project, or Secret). Tag keys are case sensitive.   An optional field known as a tag value (for example, 111122223333, Production, or a team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag values are case sensitive.  
    */
  var Tags: TagMap
  
  /**
    *  The Amazon Resource Name (ARN) of the  RepositoryAssociation  object. You can retrieve this ARN by calling  ListRepositoryAssociations . 
    */
  var resourceArn: AssociationArn
}
object TagResourceRequest {
  
  @scala.inline
  def apply(Tags: TagMap, resourceArn: AssociationArn): TagResourceRequest = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  @scala.inline
  implicit class TagResourceRequestMutableBuilder[Self <: TagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: AssociationArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
