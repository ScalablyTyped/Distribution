package typings.backbone.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validable extends StObject {
  
  var validate: js.UndefOr[Boolean] = js.undefined
}
object Validable {
  
  inline def apply(): Validable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Validable]
  }
  
  extension [Self <: Validable](x: Self) {
    
    inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
