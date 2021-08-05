package typings.baseui.datepickerMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerState extends StObject {
  
  var value: js.UndefOr[Date | js.Array[Date]] = js.undefined
}
object ContainerState {
  
  inline def apply(): ContainerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerState]
  }
  
  extension [Self <: ContainerState](x: Self) {
    
    inline def setValue(value: Date | js.Array[Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: Date*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
