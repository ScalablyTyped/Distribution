package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Conflict extends js.Object {
  
  /**
    * Metadata about a conflict in a merge operation.
    */
  var conflictMetadata: js.UndefOr[ConflictMetadata] = js.native
  
  /**
    * A list of hunks that contain the differences between files or lines causing the conflict.
    */
  var mergeHunks: js.UndefOr[MergeHunks] = js.native
}
object Conflict {
  
  @scala.inline
  def apply(): Conflict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conflict]
  }
  
  @scala.inline
  implicit class ConflictOps[Self <: Conflict] (val x: Self) extends AnyVal {
    
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
    def setConflictMetadata(value: ConflictMetadata): Self = this.set("conflictMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConflictMetadata: Self = this.set("conflictMetadata", js.undefined)
    
    @scala.inline
    def setMergeHunksVarargs(value: MergeHunk*): Self = this.set("mergeHunks", js.Array(value :_*))
    
    @scala.inline
    def setMergeHunks(value: MergeHunks): Self = this.set("mergeHunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeHunks: Self = this.set("mergeHunks", js.undefined)
  }
}
