package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorChange extends StObject {
  
  /** Position (in the pre-change coordinate system) where the change started. */
  var from: Position
  
  /**  String representing the origin of the change event and wether it can be merged with history */
  var origin: js.UndefOr[String] = js.undefined
  
  /**  Text that used to be between from and to, which is overwritten by this change. */
  var removed: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Array of strings representing the text that replaced the changed range (split by line). */
  var text: js.Array[String]
  
  /** Position (in the pre-change coordinate system) where the change ended. */
  var to: Position
}
object EditorChange {
  
  @scala.inline
  def apply(from: Position, text: js.Array[String], to: Position): EditorChange = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorChange]
  }
  
  @scala.inline
  implicit class EditorChangeMutableBuilder[Self <: EditorChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Position): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setRemoved(value: js.Array[String]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    @scala.inline
    def setRemovedVarargs(value: String*): Self = StObject.set(x, "removed", js.Array(value :_*))
    
    @scala.inline
    def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
    
    @scala.inline
    def setTo(value: Position): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
