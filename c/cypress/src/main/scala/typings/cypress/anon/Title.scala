package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Title extends StObject {
  
  var title: String
  
  var titlePath: js.Array[String]
}
object Title {
  
  inline def apply(title: String, titlePath: js.Array[String]): Title = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], titlePath = titlePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
  
  extension [Self <: Title](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitlePath(value: js.Array[String]): Self = StObject.set(x, "titlePath", value.asInstanceOf[js.Any])
    
    inline def setTitlePathVarargs(value: String*): Self = StObject.set(x, "titlePath", js.Array(value*))
  }
}
