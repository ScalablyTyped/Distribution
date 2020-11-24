package typings.classValidator.validateByMod

import typings.classValidator.validatorConstraintInterfaceMod.ValidatorConstraintInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateByOptions extends js.Object {
  
  var async: js.UndefOr[Boolean] = js.native
  
  var constraints: js.UndefOr[js.Array[_]] = js.native
  
  var name: String = js.native
  
  var validator: ValidatorConstraintInterface | js.Function = js.native
}
object ValidateByOptions {
  
  @scala.inline
  def apply(name: String, validator: ValidatorConstraintInterface | js.Function): ValidateByOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateByOptions]
  }
  
  @scala.inline
  implicit class ValidateByOptionsOps[Self <: ValidateByOptions] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidator(value: ValidatorConstraintInterface | js.Function): Self = this.set("validator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setConstraintsVarargs(value: js.Any*): Self = this.set("constraints", js.Array(value :_*))
    
    @scala.inline
    def setConstraints(value: js.Array[_]): Self = this.set("constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
  }
}
