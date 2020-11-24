package typings.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchCustomFieldWithDateParams extends PatchCustomFieldParams {
  
  var initialDate: js.UndefOr[String] = js.native
  
  var initialShift: js.UndefOr[Double] = js.native
  
  var initialValueType: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[String] = js.native
  
  var min: js.UndefOr[String] = js.native
}
object PatchCustomFieldWithDateParams {
  
  @scala.inline
  def apply(): PatchCustomFieldWithDateParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchCustomFieldWithDateParams]
  }
  
  @scala.inline
  implicit class PatchCustomFieldWithDateParamsOps[Self <: PatchCustomFieldWithDateParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInitialDate(value: String): Self = this.set("initialDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialDate: Self = this.set("initialDate", js.undefined)
    
    @scala.inline
    def setInitialShift(value: Double): Self = this.set("initialShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialShift: Self = this.set("initialShift", js.undefined)
    
    @scala.inline
    def setInitialValueType(value: Double): Self = this.set("initialValueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialValueType: Self = this.set("initialValueType", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: String): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
}
