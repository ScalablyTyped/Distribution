package typings.browserSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticOptions extends StObject {
  
  var dir: String | js.Array[String]
  
  var route: String | js.Array[String]
}
object StaticOptions {
  
  @scala.inline
  def apply(dir: String | js.Array[String], route: String | js.Array[String]): StaticOptions = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticOptions]
  }
  
  @scala.inline
  implicit class StaticOptionsMutableBuilder[Self <: StaticOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDir(value: String | js.Array[String]): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirVarargs(value: String*): Self = StObject.set(x, "dir", js.Array(value :_*))
    
    @scala.inline
    def setRoute(value: String | js.Array[String]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteVarargs(value: String*): Self = StObject.set(x, "route", js.Array(value :_*))
  }
}
