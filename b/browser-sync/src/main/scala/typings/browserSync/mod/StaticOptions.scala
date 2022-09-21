package typings.browserSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticOptions extends StObject {
  
  var dir: String | js.Array[String]
  
  var route: String | js.Array[String]
}
object StaticOptions {
  
  inline def apply(dir: String | js.Array[String], route: String | js.Array[String]): StaticOptions = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticOptions]
  }
  
  extension [Self <: StaticOptions](x: Self) {
    
    inline def setDir(value: String | js.Array[String]): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirVarargs(value: String*): Self = StObject.set(x, "dir", js.Array(value*))
    
    inline def setRoute(value: String | js.Array[String]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteVarargs(value: String*): Self = StObject.set(x, "route", js.Array(value*))
  }
}
