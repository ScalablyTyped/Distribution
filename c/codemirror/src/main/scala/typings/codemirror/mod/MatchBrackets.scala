package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchBrackets extends js.Object {
  
  /**
    * Only use the character after the start position, never the one before it.
    */
  var afterCursor: js.UndefOr[Boolean] = js.native
  
  /**
    * Don't highlight a bracket in a line longer than this. Defaults to 1000.
    */
  var maxHighlightLineLength: js.UndefOr[Double] = js.native
  
  /**
    * Ignore lines longer than this. Defaults to 10000.
    */
  var maxScanLineLength: js.UndefOr[Double] = js.native
  
  /**
    * Stop after scanning this amount of lines without a successful match. Defaults to 1000.
    */
  var maxScanLines: js.UndefOr[Double] = js.native
  
  /**
    * Causes only matches where both brackets are at the same side of the start position to be considered.
    */
  var strict: js.UndefOr[Boolean] = js.native
}
object MatchBrackets {
  
  @scala.inline
  def apply(): MatchBrackets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchBrackets]
  }
  
  @scala.inline
  implicit class MatchBracketsOps[Self <: MatchBrackets] (val x: Self) extends AnyVal {
    
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
    def setAfterCursor(value: Boolean): Self = this.set("afterCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterCursor: Self = this.set("afterCursor", js.undefined)
    
    @scala.inline
    def setMaxHighlightLineLength(value: Double): Self = this.set("maxHighlightLineLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHighlightLineLength: Self = this.set("maxHighlightLineLength", js.undefined)
    
    @scala.inline
    def setMaxScanLineLength(value: Double): Self = this.set("maxScanLineLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxScanLineLength: Self = this.set("maxScanLineLength", js.undefined)
    
    @scala.inline
    def setMaxScanLines(value: Double): Self = this.set("maxScanLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxScanLines: Self = this.set("maxScanLines", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
