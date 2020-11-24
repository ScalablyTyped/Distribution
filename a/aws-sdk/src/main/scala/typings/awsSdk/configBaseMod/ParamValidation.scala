package typings.awsSdk.configBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamValidation extends js.Object {
  
  /**
    * Validates that a string value matches one of the allowable enum values.
    */
  var enum: js.UndefOr[Boolean] = js.native
  
  /**
    * Validates that a value meets the max constraint.
    */
  var max: js.UndefOr[Boolean] = js.native
  
  /**
    * Validates that a value meets the min constraint.
    * This is enabled by default when paramValidation is set to true.
    */
  var min: js.UndefOr[Boolean] = js.native
  
  /**
    * Validates that a string value matches a regular expression.
    */
  var pattern: js.UndefOr[Boolean] = js.native
}
object ParamValidation {
  
  @scala.inline
  def apply(): ParamValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamValidation]
  }
  
  @scala.inline
  implicit class ParamValidationOps[Self <: ParamValidation] (val x: Self) extends AnyVal {
    
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
    def setEnum(value: Boolean): Self = this.set("enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    
    @scala.inline
    def setMax(value: Boolean): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Boolean): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setPattern(value: Boolean): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
  }
}
