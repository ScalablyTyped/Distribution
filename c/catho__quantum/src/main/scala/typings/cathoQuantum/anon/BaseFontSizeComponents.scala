package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseFontSizeComponents extends StObject {
  
  var baseFontSize: Double
  
  var components: js.UndefOr[ChargeBar] = js.undefined
}
object BaseFontSizeComponents {
  
  inline def apply(baseFontSize: Double): BaseFontSizeComponents = {
    val __obj = js.Dynamic.literal(baseFontSize = baseFontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFontSizeComponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseFontSizeComponents] (val x: Self) extends AnyVal {
    
    inline def setBaseFontSize(value: Double): Self = StObject.set(x, "baseFontSize", value.asInstanceOf[js.Any])
    
    inline def setComponents(value: ChargeBar): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
  }
}
