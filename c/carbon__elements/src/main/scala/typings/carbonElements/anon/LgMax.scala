package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LgMax extends StObject {
  
  var lg: `23`
  
  var max: `24`
}
object LgMax {
  
  inline def apply(lg: `23`, max: `24`): LgMax = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[LgMax]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LgMax] (val x: Self) extends AnyVal {
    
    inline def setLg(value: `23`): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setMax(value: `24`): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
  }
}
