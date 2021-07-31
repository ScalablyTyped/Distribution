package typings.chui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepeaterName extends StObject {
  
  var repeaterName: js.UndefOr[js.Any] = js.undefined
}
object RepeaterName {
  
  @scala.inline
  def apply(): RepeaterName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepeaterName]
  }
  
  @scala.inline
  implicit class RepeaterNameMutableBuilder[Self <: RepeaterName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepeaterName(value: js.Any): Self = StObject.set(x, "repeaterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeaterNameUndefined: Self = StObject.set(x, "repeaterName", js.undefined)
  }
}
