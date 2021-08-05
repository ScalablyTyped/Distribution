package typings.baseui.anon

import typings.baseui.baseuiStrings.KP
import typings.baseui.baseuiStrings.Plussign850
import typings.baseui.baseuiStrings.`North Korea Leftparenthesis조선 민주주의 인민 공화국Rightparenthesis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `152` extends StObject {
  
  var dialCode: Plussign850
  
  var id: KP
  
  var label: `North Korea Leftparenthesis조선 민주주의 인민 공화국Rightparenthesis`
}
object `152` {
  
  inline def apply(): `152` = {
    val __obj = js.Dynamic.literal(dialCode = "+850", id = "KP", label = "North Korea (\uC870\uC120 \uBBFC\uC8FC\uC8FC\uC758 \uC778\uBBFC \uACF5\uD654\uAD6D)")
    __obj.asInstanceOf[`152`]
  }
  
  extension [Self <: `152`](x: Self) {
    
    inline def setDialCode(value: Plussign850): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: KP): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `North Korea Leftparenthesis조선 민주주의 인민 공화국Rightparenthesis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
