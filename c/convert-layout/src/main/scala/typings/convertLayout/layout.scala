package typings.convertLayout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait layout extends StObject {
  
  def fromEn(s: String): String
  
  def toEn(s: String): String
}
object layout {
  
  inline def apply(fromEn: String => String, toEn: String => String): layout = {
    val __obj = js.Dynamic.literal(fromEn = js.Any.fromFunction1(fromEn), toEn = js.Any.fromFunction1(toEn))
    __obj.asInstanceOf[layout]
  }
  
  extension [Self <: layout](x: Self) {
    
    inline def setFromEn(value: String => String): Self = StObject.set(x, "fromEn", js.Any.fromFunction1(value))
    
    inline def setToEn(value: String => String): Self = StObject.set(x, "toEn", js.Any.fromFunction1(value))
  }
}
