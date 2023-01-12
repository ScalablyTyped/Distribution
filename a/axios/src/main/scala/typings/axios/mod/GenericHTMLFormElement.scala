package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericHTMLFormElement extends StObject {
  
  var method: String
  
  var name: String
  
  def submit(): Unit
}
object GenericHTMLFormElement {
  
  inline def apply(method: String, name: String, submit: () => Unit): GenericHTMLFormElement = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], submit = js.Any.fromFunction0(submit))
    __obj.asInstanceOf[GenericHTMLFormElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenericHTMLFormElement] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: () => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction0(value))
  }
}
