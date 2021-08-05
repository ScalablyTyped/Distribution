package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#core/animation
  *
  */
trait AnimationFitOptions extends StObject {
  
  var eles: CollectionArgument | Selector
  
  // to which the viewport will be fitted.
  var padding: Double
}
object AnimationFitOptions {
  
  inline def apply(eles: CollectionArgument | Selector, padding: Double): AnimationFitOptions = {
    val __obj = js.Dynamic.literal(eles = eles.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationFitOptions]
  }
  
  extension [Self <: AnimationFitOptions](x: Self) {
    
    inline def setEles(value: CollectionArgument | Selector): Self = StObject.set(x, "eles", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
  }
}
