package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultFirst extends StObject {
  
  var defaultFirst: Boolean
}
object DefaultFirst {
  
  inline def apply(defaultFirst: Boolean): DefaultFirst = {
    val __obj = js.Dynamic.literal(defaultFirst = defaultFirst.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultFirst]
  }
  
  extension [Self <: DefaultFirst](x: Self) {
    
    inline def setDefaultFirst(value: Boolean): Self = StObject.set(x, "defaultFirst", value.asInstanceOf[js.Any])
  }
}
