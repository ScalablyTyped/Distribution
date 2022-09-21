package typings.vegaLite8ozrbXDH.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compatible extends StObject {
  
  var compatible: Boolean
  
  var warning: js.UndefOr[String] = js.undefined
}
object Compatible {
  
  inline def apply(compatible: Boolean): Compatible = {
    val __obj = js.Dynamic.literal(compatible = compatible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compatible]
  }
  
  extension [Self <: Compatible](x: Self) {
    
    inline def setCompatible(value: Boolean): Self = StObject.set(x, "compatible", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
