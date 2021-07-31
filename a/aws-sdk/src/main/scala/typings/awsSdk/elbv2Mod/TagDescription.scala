package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagDescription extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.elbv2Mod.ResourceArn] = js.undefined
  
  /**
    * Information about the tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object TagDescription {
  
  @scala.inline
  def apply(): TagDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagDescription]
  }
  
  @scala.inline
  implicit class TagDescriptionMutableBuilder[Self <: TagDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
