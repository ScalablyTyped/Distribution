package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conflict extends StObject {
  
  /**
    * Metadata about a conflict in a merge operation.
    */
  var conflictMetadata: js.UndefOr[ConflictMetadata] = js.undefined
  
  /**
    * A list of hunks that contain the differences between files or lines causing the conflict.
    */
  var mergeHunks: js.UndefOr[MergeHunks] = js.undefined
}
object Conflict {
  
  @scala.inline
  def apply(): Conflict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conflict]
  }
  
  @scala.inline
  implicit class ConflictMutableBuilder[Self <: Conflict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConflictMetadata(value: ConflictMetadata): Self = StObject.set(x, "conflictMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictMetadataUndefined: Self = StObject.set(x, "conflictMetadata", js.undefined)
    
    @scala.inline
    def setMergeHunks(value: MergeHunks): Self = StObject.set(x, "mergeHunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeHunksUndefined: Self = StObject.set(x, "mergeHunks", js.undefined)
    
    @scala.inline
    def setMergeHunksVarargs(value: MergeHunk*): Self = StObject.set(x, "mergeHunks", js.Array(value :_*))
  }
}
