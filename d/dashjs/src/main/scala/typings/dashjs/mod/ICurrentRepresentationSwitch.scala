package typings.dashjs.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICurrentRepresentationSwitch extends StObject {
  
  var mt: Double
  
  var t: Date
}
object ICurrentRepresentationSwitch {
  
  @scala.inline
  def apply(mt: Double, t: Date): ICurrentRepresentationSwitch = {
    val __obj = js.Dynamic.literal(mt = mt.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICurrentRepresentationSwitch]
  }
  
  @scala.inline
  implicit class ICurrentRepresentationSwitchMutableBuilder[Self <: ICurrentRepresentationSwitch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMt(value: Double): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: Date): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
