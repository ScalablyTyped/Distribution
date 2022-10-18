package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LgMax extends StObject {
  
  var lg: `9`
  
  var max: `12`
  
  var md: `8`
  
  var xlg: `11`
}
object LgMax {
  
  inline def apply(lg: `9`, max: `12`, md: `8`, xlg: `11`): LgMax = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], xlg = xlg.asInstanceOf[js.Any])
    __obj.asInstanceOf[LgMax]
  }
  
  extension [Self <: LgMax](x: Self) {
    
    inline def setLg(value: `9`): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setMax(value: `12`): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMd(value: `8`): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setXlg(value: `11`): Self = StObject.set(x, "xlg", value.asInstanceOf[js.Any])
  }
}
