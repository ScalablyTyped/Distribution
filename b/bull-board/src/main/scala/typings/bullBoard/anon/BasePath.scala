package typings.bullBoard.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasePath extends StObject {
  
  var basePath: String
}
object BasePath {
  
  inline def apply(basePath: String): BasePath = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasePath] (val x: Self) extends AnyVal {
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
  }
}
