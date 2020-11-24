package typings.camo.mod

import typings.std.ArrayBufferConstructor
import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.DateConstructor
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.RegExp
import typings.std.StringConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTypeOptions[Type] extends js.Object {
  
  /**
    * Posible options
    */
  var choices: js.UndefOr[js.Array[Type]] = js.native
  
  /**
    * Default value
    */
  var default: js.UndefOr[Type] = js.native
  
  /**
    * RegEx to match value
    */
  var `match`: js.UndefOr[RegExp] = js.native
  
  /**
    * Max value (only with Number)
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * Min value (only with Number)
    */
  var min: js.UndefOr[Double] = js.native
  
  /**
    * Required field
    */
  var required: js.UndefOr[Boolean] = js.native
  
  /**
    * Type of data
    */
  var `type`: SchemaTypeConstructor = js.native
  
  /**
    * Unique value (like ids)
    */
  var unique: js.UndefOr[Boolean] = js.native
  
  /**
    * Validation function.
    *
    * @param {Type} value Value taken.
    * @returns {boolean} true (validation ok) or false (validation wrong).
    */
  var validate: js.UndefOr[js.Function1[/* value */ Type, Boolean]] = js.native
}
object SchemaTypeOptions {
  
  @scala.inline
  def apply[Type](`type`: SchemaTypeConstructor): SchemaTypeOptions[Type] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTypeOptions[Type]]
  }
  
  @scala.inline
  implicit class SchemaTypeOptionsOps[Self <: SchemaTypeOptions[_], Type] (val x: Self with SchemaTypeOptions[Type]) extends AnyVal {
    
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
    def setTypeVarargs(
      value: (ArrayBufferConstructor | ArrayConstructor | BooleanConstructor | DateConstructor | NumberConstructor | ObjectConstructor | StringConstructor)*
    ): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: SchemaTypeConstructor): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChoicesVarargs(value: Type*): Self = this.set("choices", js.Array(value :_*))
    
    @scala.inline
    def setChoices(value: js.Array[Type]): Self = this.set("choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChoices: Self = this.set("choices", js.undefined)
    
    @scala.inline
    def setDefault(value: Type): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setMatch(value: RegExp): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
    
    @scala.inline
    def setValidate(value: /* value */ Type => Boolean): Self = this.set("validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
