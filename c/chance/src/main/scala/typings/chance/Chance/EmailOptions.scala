package typings.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailOptions extends StObject {
  
  var domain: String
  
  var length: Double
}
object EmailOptions {
  
  inline def apply(domain: String, length: Double): EmailOptions = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailOptions]
  }
  
  extension [Self <: EmailOptions](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
