package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultField extends StObject {
  
  /**
    * The log event field.
    */
  var field: js.UndefOr[Field] = js.native
  
  /**
    * The value of this field.
    */
  var value: js.UndefOr[Value] = js.native
}
object ResultField {
  
  @scala.inline
  def apply(): ResultField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultField]
  }
  
  @scala.inline
  implicit class ResultFieldMutableBuilder[Self <: ResultField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
