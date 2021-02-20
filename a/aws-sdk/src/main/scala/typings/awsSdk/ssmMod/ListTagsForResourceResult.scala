package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourceResult extends StObject {
  
  /**
    * A list of tags.
    */
  var TagList: js.UndefOr[typings.awsSdk.ssmMod.TagList] = js.native
}
object ListTagsForResourceResult {
  
  @scala.inline
  def apply(): ListTagsForResourceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceResult]
  }
  
  @scala.inline
  implicit class ListTagsForResourceResultMutableBuilder[Self <: ListTagsForResourceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value :_*))
  }
}
