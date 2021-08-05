package typings.backbone.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterOptions extends StObject {
  
  var routes: js.Any
}
object RouterOptions {
  
  inline def apply(routes: js.Any): RouterOptions = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterOptions]
  }
  
  extension [Self <: RouterOptions](x: Self) {
    
    inline def setRoutes(value: js.Any): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
  }
}
