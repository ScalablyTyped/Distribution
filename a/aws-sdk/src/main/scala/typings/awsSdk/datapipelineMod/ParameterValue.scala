package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterValue extends StObject {
  
  /**
    * The ID of the parameter value.
    */
  var id: fieldNameString = js.native
  
  /**
    * The field value, expressed as a String.
    */
  var stringValue: fieldStringValue = js.native
}
object ParameterValue {
  
  @scala.inline
  def apply(id: fieldNameString, stringValue: fieldStringValue): ParameterValue = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterValue]
  }
  
  @scala.inline
  implicit class ParameterValueMutableBuilder[Self <: ParameterValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: fieldNameString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValue(value: fieldStringValue): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
  }
}
