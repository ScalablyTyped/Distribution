package typings.chromeRemoteInterface.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseOptions
  extends StObject
     with BaseOptions {
  
  var id: String
}
object CloseOptions {
  
  inline def apply(id: String): CloseOptions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseOptions] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
