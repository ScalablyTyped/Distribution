package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xlg extends StObject {
  
  var max: `14`
  
  var xlg: FontWeightLineHeight
}
object Xlg {
  
  inline def apply(max: `14`, xlg: FontWeightLineHeight): Xlg = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], xlg = xlg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xlg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Xlg] (val x: Self) extends AnyVal {
    
    inline def setMax(value: `14`): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setXlg(value: FontWeightLineHeight): Self = StObject.set(x, "xlg", value.asInstanceOf[js.Any])
  }
}
