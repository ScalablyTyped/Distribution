package typings.devextremeB5DqTZzf.mod.DevExpress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointSelector extends StObject {
  
  /**
    * Gets an endpoint with a specific key.
    */
  def urlFor(key: String): String
}
object EndpointSelector {
  
  inline def apply(urlFor: String => String): EndpointSelector = {
    val __obj = js.Dynamic.literal(urlFor = js.Any.fromFunction1(urlFor))
    __obj.asInstanceOf[EndpointSelector]
  }
  
  extension [Self <: EndpointSelector](x: Self) {
    
    inline def setUrlFor(value: String => String): Self = StObject.set(x, "urlFor", js.Any.fromFunction1(value))
  }
}
