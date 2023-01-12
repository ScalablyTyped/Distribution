package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseFontSizeSpacing extends StObject {
  
  var baseFontSize: js.UndefOr[Double] = js.undefined
  
  var spacing: js.UndefOr[js.Object] = js.undefined
}
object BaseFontSizeSpacing {
  
  inline def apply(): BaseFontSizeSpacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseFontSizeSpacing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseFontSizeSpacing] (val x: Self) extends AnyVal {
    
    inline def setBaseFontSize(value: Double): Self = StObject.set(x, "baseFontSize", value.asInstanceOf[js.Any])
    
    inline def setBaseFontSizeUndefined: Self = StObject.set(x, "baseFontSize", js.undefined)
    
    inline def setSpacing(value: js.Object): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
