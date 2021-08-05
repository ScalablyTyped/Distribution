package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorChangeLinkedList
  extends StObject
     with EditorChange {
  
  /** Points to another change object (which may point to another, etc). */
  var next: js.UndefOr[EditorChangeLinkedList] = js.undefined
}
object EditorChangeLinkedList {
  
  inline def apply(from: Position, text: js.Array[String], to: Position): EditorChangeLinkedList = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorChangeLinkedList]
  }
  
  extension [Self <: EditorChangeLinkedList](x: Self) {
    
    inline def setNext(value: EditorChangeLinkedList): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
