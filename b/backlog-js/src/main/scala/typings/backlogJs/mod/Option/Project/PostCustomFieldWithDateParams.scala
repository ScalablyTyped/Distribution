package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostCustomFieldWithDateParams extends PostCustomFieldParams {
  
  var initialDate: js.UndefOr[String] = js.native
  
  var initialShift: js.UndefOr[Double] = js.native
  
  var initialValueType: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[String] = js.native
  
  var min: js.UndefOr[String] = js.native
}
object PostCustomFieldWithDateParams {
  
  @scala.inline
  def apply(name: String, typeId: FieldType): PostCustomFieldWithDateParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCustomFieldWithDateParams]
  }
  
  @scala.inline
  implicit class PostCustomFieldWithDateParamsMutableBuilder[Self <: PostCustomFieldWithDateParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialDate(value: String): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
    
    @scala.inline
    def setInitialShift(value: Double): Self = StObject.set(x, "initialShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialShiftUndefined: Self = StObject.set(x, "initialShift", js.undefined)
    
    @scala.inline
    def setInitialValueType(value: Double): Self = StObject.set(x, "initialValueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValueTypeUndefined: Self = StObject.set(x, "initialValueType", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
