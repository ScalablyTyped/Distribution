package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICurrentRepresentationSwitch extends StObject {
  
  var mt: Double
  
  var t: js.Date
}
object ICurrentRepresentationSwitch {
  
  inline def apply(mt: Double, t: js.Date): ICurrentRepresentationSwitch = {
    val __obj = js.Dynamic.literal(mt = mt.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICurrentRepresentationSwitch]
  }
  
  extension [Self <: ICurrentRepresentationSwitch](x: Self) {
    
    inline def setMt(value: Double): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
    
    inline def setT(value: js.Date): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
