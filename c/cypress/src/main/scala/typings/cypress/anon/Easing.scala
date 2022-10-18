package typings.cypress.anon

import typings.cypress.JQuery._SpeedSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Easing
  extends StObject
     with _SpeedSettings[Any] {
  
  /**
    * A string indicating which easing function to use for the transition.
    */
  var easing: String
}
object Easing {
  
  inline def apply(easing: String): Easing = {
    val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Easing]
  }
  
  extension [Self <: Easing](x: Self) {
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
  }
}
