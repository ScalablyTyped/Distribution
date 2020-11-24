package typings.codemirror.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedHist extends js.Object {
  
  var from: js.UndefOr[Double] = js.native
  
  /** By default, the new document inherits the mode of the parent. This option can be set to a mode spec to give it a different mode. */
  var mode: js.Any = js.native
  
  /** When turned on, the linked copy will share an undo history with the original.
    Thus, something done in one of the two can be undone in the other, and vice versa. */
  var sharedHist: js.UndefOr[Boolean] = js.native
  
  /** Can be given to make the new document a subview of the original. Subviews only show a given range of lines.
    Note that line coordinates inside the subview will be consistent with those of the parent,
    so that for example a subview starting at line 10 will refer to its first line as line 10, not 0. */
  var to: js.UndefOr[Double] = js.native
}
object SharedHist {
  
  @scala.inline
  def apply(mode: js.Any): SharedHist = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedHist]
  }
  
  @scala.inline
  implicit class SharedHistOps[Self <: SharedHist] (val x: Self) extends AnyVal {
    
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
    def setMode(value: js.Any): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setSharedHist(value: Boolean): Self = this.set("sharedHist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedHist: Self = this.set("sharedHist", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
