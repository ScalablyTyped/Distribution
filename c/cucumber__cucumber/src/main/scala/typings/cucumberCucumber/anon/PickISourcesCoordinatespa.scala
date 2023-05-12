package typings.cucumberCucumber.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@cucumber/cucumber.@cucumber/cucumber/lib/api/types.ISourcesCoordinates, 'paths'> */
trait PickISourcesCoordinatespa extends StObject {
  
  var paths: js.Array[String]
}
object PickISourcesCoordinatespa {
  
  inline def apply(paths: js.Array[String]): PickISourcesCoordinatespa = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickISourcesCoordinatespa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickISourcesCoordinatespa] (val x: Self) extends AnyVal {
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
