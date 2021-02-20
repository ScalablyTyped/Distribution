package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorSelectionChange extends StObject {
  
  var origin: js.UndefOr[String] = js.native
  
  var ranges: js.Array[Range] = js.native
  
  def update(ranges: js.Array[Range]): Unit = js.native
}
object EditorSelectionChange {
  
  @scala.inline
  def apply(ranges: js.Array[Range], update: js.Array[Range] => Unit): EditorSelectionChange = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[EditorSelectionChange]
  }
  
  @scala.inline
  implicit class EditorSelectionChangeMutableBuilder[Self <: EditorSelectionChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setRanges(value: js.Array[Range]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesVarargs(value: Range*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    @scala.inline
    def setUpdate(value: js.Array[Range] => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
