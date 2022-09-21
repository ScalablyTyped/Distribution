package typings.typescriptNn5FuAjk.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeFormatPart extends StObject {
  
  var `type`: DateTimeFormatPartTypes
  
  var value: String
}
object DateTimeFormatPart {
  
  inline def apply(`type`: DateTimeFormatPartTypes, value: String): DateTimeFormatPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeFormatPart]
  }
  
  extension [Self <: DateTimeFormatPart](x: Self) {
    
    inline def setType(value: DateTimeFormatPartTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
