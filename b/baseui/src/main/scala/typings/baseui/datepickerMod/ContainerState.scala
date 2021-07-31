package typings.baseui.datepickerMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerState extends StObject {
  
  var value: js.UndefOr[Date | js.Array[Date]] = js.undefined
}
object ContainerState {
  
  @scala.inline
  def apply(): ContainerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerState]
  }
  
  @scala.inline
  implicit class ContainerStateMutableBuilder[Self <: ContainerState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Date | js.Array[Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: Date*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
