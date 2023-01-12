package typings.complexviewer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NAryLink extends StObject {
  
  var complex: Complex
}
object NAryLink {
  
  inline def apply(complex: Complex): NAryLink = {
    val __obj = js.Dynamic.literal(complex = complex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NAryLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NAryLink] (val x: Self) extends AnyVal {
    
    inline def setComplex(value: Complex): Self = StObject.set(x, "complex", value.asInstanceOf[js.Any])
  }
}
