package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunOnly extends StObject {
  
  var `type`: RunOnlyType = js.native
  
  var values: js.Array[String | TagValue] = js.native
}
object RunOnly {
  
  @scala.inline
  def apply(`type`: RunOnlyType, values: js.Array[String | TagValue]): RunOnly = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunOnly]
  }
  
  @scala.inline
  implicit class RunOnlyMutableBuilder[Self <: RunOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: RunOnlyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String | TagValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: (String | TagValue)*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
