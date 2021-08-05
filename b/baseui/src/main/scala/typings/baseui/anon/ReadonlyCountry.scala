package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<baseui.baseui/phone-input.Country> */
trait ReadonlyCountry extends StObject {
  
  val dialCode: String
  
  val id: /* keyof baseui.baseui/phone-input.COUNTRIES */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any
  
  val label: String
}
object ReadonlyCountry {
  
  inline def apply(
    dialCode: String,
    id: /* keyof baseui.baseui/phone-input.COUNTRIES */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any,
    label: String
  ): ReadonlyCountry = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyCountry]
  }
  
  extension [Self <: ReadonlyCountry](x: Self) {
    
    inline def setDialCode(value: String): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(
      value: /* keyof baseui.baseui/phone-input.COUNTRIES */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any
    ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
