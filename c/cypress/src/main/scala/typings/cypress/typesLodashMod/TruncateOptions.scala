package typings.cypress.typesLodashMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TruncateOptions extends StObject {
  
  /**
    * @see _.length
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * @see _.omission
    */
  var omission: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * @see _.separator
    */
  var separator: js.UndefOr[java.lang.String | js.RegExp] = js.undefined
}
object TruncateOptions {
  
  inline def apply(): TruncateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TruncateOptions] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setOmission(value: java.lang.String): Self = StObject.set(x, "omission", value.asInstanceOf[js.Any])
    
    inline def setOmissionUndefined: Self = StObject.set(x, "omission", js.undefined)
    
    inline def setSeparator(value: java.lang.String | js.RegExp): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
