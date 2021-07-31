package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceResponse extends StObject {
  
  /**
    * The list of tags that are associated with the DAX resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object TagResourceResponse {
  
  @scala.inline
  def apply(): TagResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagResourceResponse]
  }
  
  @scala.inline
  implicit class TagResourceResponseMutableBuilder[Self <: TagResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
