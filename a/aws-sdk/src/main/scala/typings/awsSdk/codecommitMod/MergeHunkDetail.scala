package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeHunkDetail extends StObject {
  
  /**
    * The end position of the hunk in the merge result.
    */
  var endLine: js.UndefOr[LineNumber] = js.undefined
  
  /**
    * The base-64 encoded content of the hunk merged region that might contain a conflict.
    */
  var hunkContent: js.UndefOr[HunkContent] = js.undefined
  
  /**
    * The start position of the hunk in the merge result.
    */
  var startLine: js.UndefOr[LineNumber] = js.undefined
}
object MergeHunkDetail {
  
  @scala.inline
  def apply(): MergeHunkDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeHunkDetail]
  }
  
  @scala.inline
  implicit class MergeHunkDetailMutableBuilder[Self <: MergeHunkDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndLine(value: LineNumber): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    @scala.inline
    def setHunkContent(value: HunkContent): Self = StObject.set(x, "hunkContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHunkContentUndefined: Self = StObject.set(x, "hunkContent", js.undefined)
    
    @scala.inline
    def setStartLine(value: LineNumber): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
  }
}
