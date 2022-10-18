package typings.cypress.Cypress

import typings.std.Document
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrevSubjectMap[O] extends StObject {
  
  var document: Document
  
  var element: JQueryWithSelector[HTMLElement]
  
  var optional: O
  
  var window: Window
}
object PrevSubjectMap {
  
  inline def apply[O](document: Document, element: JQueryWithSelector[HTMLElement], optional: O, window: Window): PrevSubjectMap[O] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevSubjectMap[O]]
  }
  
  extension [Self <: PrevSubjectMap[?], O](x: Self & PrevSubjectMap[O]) {
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setElement(value: JQueryWithSelector[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: O): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
