package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForProjectResult extends js.Object {
  
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
  implicit class ListTagsForProjectResultOps[Self <: ListTagsForProjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
