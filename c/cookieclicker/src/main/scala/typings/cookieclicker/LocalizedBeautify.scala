package typings.cookieclicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalizedBeautify extends StObject {
  
  /**
    * The beautified value
    */
  var b: String
  
  /**
    * Floored original value
    */
  var n: Double
}
object LocalizedBeautify {
  
  inline def apply(b: String, n: Double): LocalizedBeautify = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedBeautify]
  }
  
  extension [Self <: LocalizedBeautify](x: Self) {
    
    inline def setB(value: String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
  }
}
