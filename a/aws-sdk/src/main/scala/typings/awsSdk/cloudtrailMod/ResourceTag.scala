package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceTag extends StObject {
  
  /**
    * Specifies the ARN of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.native
  
  /**
    * A list of tags.
    */
  var TagsList: js.UndefOr[typings.awsSdk.cloudtrailMod.TagsList] = js.native
}
object ResourceTag {
  
  @scala.inline
  def apply(): ResourceTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceTag]
  }
  
  @scala.inline
  implicit class ResourceTagMutableBuilder[Self <: ResourceTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setTagsList(value: TagsList): Self = StObject.set(x, "TagsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsListUndefined: Self = StObject.set(x, "TagsList", js.undefined)
    
    @scala.inline
    def setTagsListVarargs(value: Tag*): Self = StObject.set(x, "TagsList", js.Array(value :_*))
  }
}
