package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseFontSizeColors extends StObject {
  
  var baseFontSize: Double
}
object BaseFontSizeColors {
  
  inline def apply(baseFontSize: Double): BaseFontSizeColors = {
    val __obj = js.Dynamic.literal(baseFontSize = baseFontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFontSizeColors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseFontSizeColors] (val x: Self) extends AnyVal {
    
    inline def setBaseFontSize(value: Double): Self = StObject.set(x, "baseFontSize", value.asInstanceOf[js.Any])
  }
}
