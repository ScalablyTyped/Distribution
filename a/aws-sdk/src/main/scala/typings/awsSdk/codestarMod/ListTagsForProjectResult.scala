package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForProjectResult extends StObject {
  
  /**
    * Reserved for future use.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The tags for the project.
    */
  var tags: js.UndefOr[Tags] = js.native
}
object ListTagsForProjectResult {
  
  @scala.inline
  def apply(): ListTagsForProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForProjectResult]
  }
  
  @scala.inline
  implicit class ListTagsForProjectResultMutableBuilder[Self <: ListTagsForProjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
