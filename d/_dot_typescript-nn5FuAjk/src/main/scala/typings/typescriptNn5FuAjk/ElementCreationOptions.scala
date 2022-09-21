package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementCreationOptions extends StObject {
  
  var is: js.UndefOr[java.lang.String] = js.undefined
}
object ElementCreationOptions {
  
  inline def apply(): ElementCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementCreationOptions]
  }
  
  extension [Self <: ElementCreationOptions](x: Self) {
    
    inline def setIs(value: java.lang.String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
  }
}
