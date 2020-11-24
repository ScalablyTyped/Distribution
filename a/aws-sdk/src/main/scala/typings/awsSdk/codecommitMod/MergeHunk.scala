package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeHunk extends js.Object {
  
  /**
    * Information about the merge hunk in the base of a merge or pull request.
    */
  var base: js.UndefOr[MergeHunkDetail] = js.native
  
  /**
    * Information about the merge hunk in the destination of a merge or pull request.
    */
  var destination: js.UndefOr[MergeHunkDetail] = js.native
  
  /**
    * A Boolean value indicating whether a combination of hunks contains a conflict. Conflicts occur when the same file or the same lines in a file were modified in both the source and destination of a merge or pull request. Valid values include true, false, and null. True when the hunk represents a conflict and one or more files contains a line conflict. File mode conflicts in a merge do not set this to true.
    */
  var isConflict: js.UndefOr[IsHunkConflict] = js.native
  
  /**
    * Information about the merge hunk in the source of a merge or pull request.
    */
  var source: js.UndefOr[MergeHunkDetail] = js.native
}
object MergeHunk {
  
  @scala.inline
  def apply(): MergeHunk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeHunk]
  }
  
  @scala.inline
  implicit class MergeHunkOps[Self <: MergeHunk] (val x: Self) extends AnyVal {
    
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
    def setBase(value: MergeHunkDetail): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setDestination(value: MergeHunkDetail): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setIsConflict(value: IsHunkConflict): Self = this.set("isConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsConflict: Self = this.set("isConflict", js.undefined)
    
    @scala.inline
    def setSource(value: MergeHunkDetail): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
