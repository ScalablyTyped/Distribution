package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the container. 
    */
  var Resource: ContainerARN = js.native
  
  /**
    * An array of key:value pairs that you want to add to the container. You need to specify only the tags that you want to add or update. For example, suppose a container already has two tags (customer:CompanyA and priority:High). You want to change the priority tag and also add a third tag (type:Contract). For TagResource, you specify the following tags: priority:Medium, type:Contract. The result is that your container has three tags: customer:CompanyA, priority:Medium, and type:Contract.
    */
  var Tags: TagList = js.native
}
object TagResourceInput {
  
  @scala.inline
  def apply(Resource: ContainerARN, Tags: TagList): TagResourceInput = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceInput]
  }
  
  @scala.inline
  implicit class TagResourceInputMutableBuilder[Self <: TagResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: ContainerARN): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
