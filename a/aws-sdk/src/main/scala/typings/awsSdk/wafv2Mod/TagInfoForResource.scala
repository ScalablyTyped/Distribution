package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagInfoForResource extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceARN: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The array of Tag objects defined for the resource. 
    */
  var TagList: js.UndefOr[typings.awsSdk.wafv2Mod.TagList] = js.undefined
}
object TagInfoForResource {
  
  @scala.inline
  def apply(): TagInfoForResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagInfoForResource]
  }
  
  @scala.inline
  implicit class TagInfoForResourceMutableBuilder[Self <: TagInfoForResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARN(value: ResourceArn): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    @scala.inline
    def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value :_*))
  }
}
