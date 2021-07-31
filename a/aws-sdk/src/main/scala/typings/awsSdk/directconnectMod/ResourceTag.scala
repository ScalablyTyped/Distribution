package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceTag extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var resourceArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The tags.
    */
  var tags: js.UndefOr[TagList] = js.undefined
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
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
