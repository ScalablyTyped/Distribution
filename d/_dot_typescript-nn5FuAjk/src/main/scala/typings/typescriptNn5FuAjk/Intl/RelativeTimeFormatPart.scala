package typings.typescriptNn5FuAjk.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing the relative time format in parts
  * that can be used for custom locale-aware formatting.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/formatToParts#Using_formatToParts).
  */
trait RelativeTimeFormatPart extends StObject {
  
  var `type`: String
  
  var unit: js.UndefOr[RelativeTimeFormatUnit] = js.undefined
  
  var value: String
}
object RelativeTimeFormatPart {
  
  inline def apply(`type`: String, value: String): RelativeTimeFormatPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimeFormatPart]
  }
  
  extension [Self <: RelativeTimeFormatPart](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: RelativeTimeFormatUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
