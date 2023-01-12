package typings.baseui.anon

import typings.baseui.baseuiStrings.KP
import typings.baseui.baseuiStrings.Plussign850
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `169` extends StObject {
  
  val dialCode: Plussign850
  
  val id: KP
  
  val label: /* North Korea (조선 민주주의 인민 공화국) */ String
}
object `169` {
  
  inline def apply(): `169` = {
    val __obj = js.Dynamic.literal(dialCode = "+850", id = "KP", label = "North Korea (\uC870\uC120 \uBBFC\uC8FC\uC8FC\uC758 \uC778\uBBFC \uACF5\uD654\uAD6D)")
    __obj.asInstanceOf[`169`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `169`] (val x: Self) extends AnyVal {
    
    inline def setDialCode(value: Plussign850): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: KP): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* North Korea (조선 민주주의 인민 공화국) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
