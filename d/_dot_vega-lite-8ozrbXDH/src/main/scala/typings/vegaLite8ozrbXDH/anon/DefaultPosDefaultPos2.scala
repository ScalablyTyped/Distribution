package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.mid
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.zeroOrMax
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.zeroOrMin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPosDefaultPos2 extends StObject {
  
  var defaultPos: zeroOrMin | zeroOrMax | mid
  
  var defaultPos2: zeroOrMin | zeroOrMax
}
object DefaultPosDefaultPos2 {
  
  inline def apply(defaultPos: zeroOrMin | zeroOrMax | mid, defaultPos2: zeroOrMin | zeroOrMax): DefaultPosDefaultPos2 = {
    val __obj = js.Dynamic.literal(defaultPos = defaultPos.asInstanceOf[js.Any], defaultPos2 = defaultPos2.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultPosDefaultPos2]
  }
  
  extension [Self <: DefaultPosDefaultPos2](x: Self) {
    
    inline def setDefaultPos(value: zeroOrMin | zeroOrMax | mid): Self = StObject.set(x, "defaultPos", value.asInstanceOf[js.Any])
    
    inline def setDefaultPos2(value: zeroOrMin | zeroOrMax): Self = StObject.set(x, "defaultPos2", value.asInstanceOf[js.Any])
  }
}
