package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Absolute extends StObject {
  
  /**
    * resolved filename of the spec
    */
  var absolute: String
  
  /**
    * filename like "spec.js"
    */
  var name: String
  
  /**
    * name relative to the project root, like "cypress/integration/spec.js"
    */
  var relative: String
  
  var relativeToCommonRoot: String
}
object Absolute {
  
  inline def apply(absolute: String, name: String, relative: String, relativeToCommonRoot: String): Absolute = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], relativeToCommonRoot = relativeToCommonRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Absolute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Absolute] (val x: Self) extends AnyVal {
    
    inline def setAbsolute(value: String): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRelative(value: String): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setRelativeToCommonRoot(value: String): Self = StObject.set(x, "relativeToCommonRoot", value.asInstanceOf[js.Any])
  }
}
