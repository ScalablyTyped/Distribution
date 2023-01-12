package typings.ckeditor4.CKEDITOR.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait list extends StObject {
  
  def arrayToList(listArray: Any, database: Any, paragraphMode: Any, dir: Any): Unit
  
  def listToArray(listNode: Any, database: Any, baseArray: Any, baseIndentLevel: Any, grandparentNode: Any): Unit
}
object list {
  
  inline def apply(arrayToList: (Any, Any, Any, Any) => Unit, listToArray: (Any, Any, Any, Any, Any) => Unit): list = {
    val __obj = js.Dynamic.literal(arrayToList = js.Any.fromFunction4(arrayToList), listToArray = js.Any.fromFunction5(listToArray))
    __obj.asInstanceOf[list]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: list] (val x: Self) extends AnyVal {
    
    inline def setArrayToList(value: (Any, Any, Any, Any) => Unit): Self = StObject.set(x, "arrayToList", js.Any.fromFunction4(value))
    
    inline def setListToArray(value: (Any, Any, Any, Any, Any) => Unit): Self = StObject.set(x, "listToArray", js.Any.fromFunction5(value))
  }
}
