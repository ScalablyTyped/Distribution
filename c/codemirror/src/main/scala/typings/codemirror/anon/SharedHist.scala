package typings.codemirror.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedHist extends StObject {
  
  var from: js.UndefOr[Double] = js.undefined
  
  /** By default, the new document inherits the mode of the parent. This option can be set to a mode spec to give it a different mode. */
  var mode: js.Any
  
  /** When turned on, the linked copy will share an undo history with the original.
    Thus, something done in one of the two can be undone in the other, and vice versa. */
  var sharedHist: js.UndefOr[Boolean] = js.undefined
  
  /** Can be given to make the new document a subview of the original. Subviews only show a given range of lines.
    Note that line coordinates inside the subview will be consistent with those of the parent,
    so that for example a subview starting at line 10 will refer to its first line as line 10, not 0. */
  var to: js.UndefOr[Double] = js.undefined
}
object SharedHist {
  
  @scala.inline
  def apply(mode: js.Any): SharedHist = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedHist]
  }
  
  @scala.inline
  implicit class SharedHistMutableBuilder[Self <: SharedHist] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setMode(value: js.Any): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedHist(value: Boolean): Self = StObject.set(x, "sharedHist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedHistUndefined: Self = StObject.set(x, "sharedHist", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
