package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowTaskParameterValueExpression extends StObject {
  
  /**
    * This field contains an array of 0 or more strings, each 1 to 255 characters in length.
    */
  var Values: js.UndefOr[MaintenanceWindowTaskParameterValueList] = js.native
}
object MaintenanceWindowTaskParameterValueExpression {
  
  @scala.inline
  def apply(): MaintenanceWindowTaskParameterValueExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskParameterValueExpression]
  }
  
  @scala.inline
  implicit class MaintenanceWindowTaskParameterValueExpressionMutableBuilder[Self <: MaintenanceWindowTaskParameterValueExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: MaintenanceWindowTaskParameterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: MaintenanceWindowTaskParameterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
