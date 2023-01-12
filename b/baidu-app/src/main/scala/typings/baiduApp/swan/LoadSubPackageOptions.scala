package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadSubPackageOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var root: String
}
object LoadSubPackageOptions {
  
  inline def apply(root: String): LoadSubPackageOptions = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadSubPackageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadSubPackageOptions] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
