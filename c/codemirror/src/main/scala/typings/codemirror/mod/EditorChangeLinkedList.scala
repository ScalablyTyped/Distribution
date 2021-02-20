package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorChangeLinkedList extends EditorChange {
  
  /** Points to another change object (which may point to another, etc). */
  var next: js.UndefOr[EditorChangeLinkedList] = js.native
}
object EditorChangeLinkedList {
  
  @scala.inline
  def apply(from: Position, text: js.Array[String], to: Position): EditorChangeLinkedList = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorChangeLinkedList]
  }
  
  @scala.inline
  implicit class EditorChangeLinkedListMutableBuilder[Self <: EditorChangeLinkedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNext(value: EditorChangeLinkedList): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
