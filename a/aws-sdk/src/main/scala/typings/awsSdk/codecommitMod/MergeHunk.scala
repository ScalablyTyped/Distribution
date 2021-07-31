package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeHunk extends StObject {
  
  /**
    * Information about the merge hunk in the base of a merge or pull request.
    */
  var base: js.UndefOr[MergeHunkDetail] = js.undefined
  
  /**
    * Information about the merge hunk in the destination of a merge or pull request.
    */
  var destination: js.UndefOr[MergeHunkDetail] = js.undefined
  
  /**
    * A Boolean value indicating whether a combination of hunks contains a conflict. Conflicts occur when the same file or the same lines in a file were modified in both the source and destination of a merge or pull request. Valid values include true, false, and null. True when the hunk represents a conflict and one or more files contains a line conflict. File mode conflicts in a merge do not set this to true.
    */
  var isConflict: js.UndefOr[IsHunkConflict] = js.undefined
  
  /**
    * Information about the merge hunk in the source of a merge or pull request.
    */
  var source: js.UndefOr[MergeHunkDetail] = js.undefined
}
object MergeHunk {
  
  @scala.inline
  def apply(): MergeHunk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeHunk]
  }
  
  @scala.inline
  implicit class MergeHunkMutableBuilder[Self <: MergeHunk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: MergeHunkDetail): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    @scala.inline
    def setDestination(value: MergeHunkDetail): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setIsConflict(value: IsHunkConflict): Self = StObject.set(x, "isConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsConflictUndefined: Self = StObject.set(x, "isConflict", js.undefined)
    
    @scala.inline
    def setSource(value: MergeHunkDetail): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
