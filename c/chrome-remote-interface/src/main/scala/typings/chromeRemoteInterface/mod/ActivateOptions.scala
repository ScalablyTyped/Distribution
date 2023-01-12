package typings.chromeRemoteInterface.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateOptions
  extends StObject
     with BaseOptions {
  
  var id: String
}
object ActivateOptions {
  
  inline def apply(id: String): ActivateOptions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActivateOptions] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
