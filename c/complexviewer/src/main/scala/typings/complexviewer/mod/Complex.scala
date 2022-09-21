package typings.complexviewer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Complex extends StObject {
  
  var id: String
  
  def initLink(naryLink: NAryLink): Unit
}
object Complex {
  
  inline def apply(id: String, initLink: NAryLink => Unit): Complex = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], initLink = js.Any.fromFunction1(initLink))
    __obj.asInstanceOf[Complex]
  }
  
  extension [Self <: Complex](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInitLink(value: NAryLink => Unit): Self = StObject.set(x, "initLink", js.Any.fromFunction1(value))
  }
}
