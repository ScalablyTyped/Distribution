package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterConstraints extends js.Object {
  
  /**
    * The values that the administrator has allowed for the parameter.
    */
  var AllowedValues: js.UndefOr[typings.awsSdk.servicecatalogMod.AllowedValues] = js.native
}
object ParameterConstraints {
  
  @scala.inline
  def apply(): ParameterConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterConstraints]
  }
  
  @scala.inline
  implicit class ParameterConstraintsOps[Self <: ParameterConstraints] (val x: Self) extends AnyVal {
    
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
    def setAllowedValuesVarargs(value: AllowedValue*): Self = this.set("AllowedValues", js.Array(value :_*))
    
    @scala.inline
    def setAllowedValues(value: AllowedValues): Self = this.set("AllowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedValues: Self = this.set("AllowedValues", js.undefined)
  }
}
