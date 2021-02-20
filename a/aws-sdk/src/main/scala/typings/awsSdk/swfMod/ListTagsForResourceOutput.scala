package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourceOutput extends StObject {
  
  /**
    * An array of tags associated with the domain.
    */
  var tags: js.UndefOr[ResourceTagList] = js.native
}
object ListTagsForResourceOutput {
  
  @scala.inline
  def apply(): ListTagsForResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceOutput]
  }
  
  @scala.inline
  implicit class ListTagsForResourceOutputMutableBuilder[Self <: ListTagsForResourceOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: ResourceTagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: ResourceTag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
