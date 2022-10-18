package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxXlg extends StObject {
  
  var max: `7`
  
  var xlg: `6`
}
object MaxXlg {
  
  inline def apply(max: `7`, xlg: `6`): MaxXlg = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], xlg = xlg.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxXlg]
  }
  
  extension [Self <: MaxXlg](x: Self) {
    
    inline def setMax(value: `7`): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setXlg(value: `6`): Self = StObject.set(x, "xlg", value.asInstanceOf[js.Any])
  }
}
