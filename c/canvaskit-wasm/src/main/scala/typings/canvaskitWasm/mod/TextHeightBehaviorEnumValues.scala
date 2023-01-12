package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextHeightBehaviorEnumValues
  extends StObject
     with EmbindEnum {
  
  var All: TextHeightBehavior
  
  var DisableAll: TextHeightBehavior
  
  var DisableFirstAscent: TextHeightBehavior
  
  var DisableLastDescent: TextHeightBehavior
}
object TextHeightBehaviorEnumValues {
  
  inline def apply(
    All: TextHeightBehavior,
    DisableAll: TextHeightBehavior,
    DisableFirstAscent: TextHeightBehavior,
    DisableLastDescent: TextHeightBehavior,
    values: js.Array[Double]
  ): TextHeightBehaviorEnumValues = {
    val __obj = js.Dynamic.literal(All = All.asInstanceOf[js.Any], DisableAll = DisableAll.asInstanceOf[js.Any], DisableFirstAscent = DisableFirstAscent.asInstanceOf[js.Any], DisableLastDescent = DisableLastDescent.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextHeightBehaviorEnumValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextHeightBehaviorEnumValues] (val x: Self) extends AnyVal {
    
    inline def setAll(value: TextHeightBehavior): Self = StObject.set(x, "All", value.asInstanceOf[js.Any])
    
    inline def setDisableAll(value: TextHeightBehavior): Self = StObject.set(x, "DisableAll", value.asInstanceOf[js.Any])
    
    inline def setDisableFirstAscent(value: TextHeightBehavior): Self = StObject.set(x, "DisableFirstAscent", value.asInstanceOf[js.Any])
    
    inline def setDisableLastDescent(value: TextHeightBehavior): Self = StObject.set(x, "DisableLastDescent", value.asInstanceOf[js.Any])
  }
}
