package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.mid
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.x
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.xc
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.y
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.yc
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.zeroOrMax
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.zeroOrMin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPos extends StObject {
  
  var defaultPos: mid | zeroOrMin | zeroOrMax | Null
  
  var vgChannel: js.UndefOr[x | y | xc | yc] = js.undefined
}
object DefaultPos {
  
  inline def apply(): DefaultPos = {
    val __obj = js.Dynamic.literal(defaultPos = null)
    __obj.asInstanceOf[DefaultPos]
  }
  
  extension [Self <: DefaultPos](x: Self) {
    
    inline def setDefaultPos(value: mid | zeroOrMin | zeroOrMax): Self = StObject.set(x, "defaultPos", value.asInstanceOf[js.Any])
    
    inline def setDefaultPosNull: Self = StObject.set(x, "defaultPos", null)
    
    inline def setVgChannel(value: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.x | y | xc | yc): Self = StObject.set(x, "vgChannel", value.asInstanceOf[js.Any])
    
    inline def setVgChannelUndefined: Self = StObject.set(x, "vgChannel", js.undefined)
  }
}
