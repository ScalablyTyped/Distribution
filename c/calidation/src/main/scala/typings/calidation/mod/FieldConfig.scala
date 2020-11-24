package typings.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldConfig[T /* <: js.Object */] extends js.Object {
  
  var isBlacklisted: js.UndefOr[BlacklistValidator[T]] = js.native
  
  var isEmail: js.UndefOr[SimpleValidator[T]] = js.native
  
  var isEqual: js.UndefOr[ValueValidator[_, T]] = js.native
  
  var isExactLength: js.UndefOr[LengthValidator[T]] = js.native
  
  var isGreaterThan: js.UndefOr[ValueValidator[Double, T]] = js.native
  
  var isLessThan: js.UndefOr[ValueValidator[Double, T]] = js.native
  
  var isMaxLength: js.UndefOr[LengthValidator[T]] = js.native
  
  var isMinLength: js.UndefOr[LengthValidator[T]] = js.native
  
  var isNumber: js.UndefOr[SimpleValidator[T]] = js.native
  
  var isRegexMatch: js.UndefOr[RegexValidator[T]] = js.native
  
  var isRequired: js.UndefOr[SimpleValidator[T]] = js.native
  
  var isWhitelisted: js.UndefOr[WhitelistValidator[T]] = js.native
}
object FieldConfig {
  
  @scala.inline
  def apply[T /* <: js.Object */](): FieldConfig[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldConfig[T]]
  }
  
  @scala.inline
  implicit class FieldConfigOps[Self <: FieldConfig[_], T /* <: js.Object */] (val x: Self with FieldConfig[T]) extends AnyVal {
    
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
    def setIsBlacklistedFunction1(value: /* context */ ValidatorContext[T] => BlacklistValidatorConfig[T]): Self = this.set("isBlacklisted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsBlacklisted(value: BlacklistValidator[T]): Self = this.set("isBlacklisted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBlacklisted: Self = this.set("isBlacklisted", js.undefined)
    
    @scala.inline
    def setIsEmailFunction1(value: /* context */ ValidatorContext[T] => SimpleValidatorConfig[T]): Self = this.set("isEmail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmail(value: SimpleValidator[T]): Self = this.set("isEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEmail: Self = this.set("isEmail", js.undefined)
    
    @scala.inline
    def setIsEqualFunction1(value: /* context */ ValidatorContext[T] => ValueValidatorConfig[_, T]): Self = this.set("isEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEqual(value: ValueValidator[_, T]): Self = this.set("isEqual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEqual: Self = this.set("isEqual", js.undefined)
    
    @scala.inline
    def setIsExactLengthFunction1(value: /* context */ ValidatorContext[T] => LengthValidatorConfig[T]): Self = this.set("isExactLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsExactLength(value: LengthValidator[T]): Self = this.set("isExactLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsExactLength: Self = this.set("isExactLength", js.undefined)
    
    @scala.inline
    def setIsGreaterThanFunction1(value: /* context */ ValidatorContext[T] => ValueValidatorConfig[Double, T]): Self = this.set("isGreaterThan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsGreaterThan(value: ValueValidator[Double, T]): Self = this.set("isGreaterThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsGreaterThan: Self = this.set("isGreaterThan", js.undefined)
    
    @scala.inline
    def setIsLessThanFunction1(value: /* context */ ValidatorContext[T] => ValueValidatorConfig[Double, T]): Self = this.set("isLessThan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsLessThan(value: ValueValidator[Double, T]): Self = this.set("isLessThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLessThan: Self = this.set("isLessThan", js.undefined)
    
    @scala.inline
    def setIsMaxLengthFunction1(value: /* context */ ValidatorContext[T] => LengthValidatorConfig[T]): Self = this.set("isMaxLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsMaxLength(value: LengthValidator[T]): Self = this.set("isMaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMaxLength: Self = this.set("isMaxLength", js.undefined)
    
    @scala.inline
    def setIsMinLengthFunction1(value: /* context */ ValidatorContext[T] => LengthValidatorConfig[T]): Self = this.set("isMinLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsMinLength(value: LengthValidator[T]): Self = this.set("isMinLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMinLength: Self = this.set("isMinLength", js.undefined)
    
    @scala.inline
    def setIsNumberFunction1(value: /* context */ ValidatorContext[T] => SimpleValidatorConfig[T]): Self = this.set("isNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNumber(value: SimpleValidator[T]): Self = this.set("isNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNumber: Self = this.set("isNumber", js.undefined)
    
    @scala.inline
    def setIsRegexMatchFunction1(value: /* context */ ValidatorContext[T] => RegexValidatorConfig[T]): Self = this.set("isRegexMatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsRegexMatch(value: RegexValidator[T]): Self = this.set("isRegexMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRegexMatch: Self = this.set("isRegexMatch", js.undefined)
    
    @scala.inline
    def setIsRequiredFunction1(value: /* context */ ValidatorContext[T] => SimpleValidatorConfig[T]): Self = this.set("isRequired", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsRequired(value: SimpleValidator[T]): Self = this.set("isRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRequired: Self = this.set("isRequired", js.undefined)
    
    @scala.inline
    def setIsWhitelistedFunction1(value: /* context */ ValidatorContext[T] => RegexValidatorConfig[T]): Self = this.set("isWhitelisted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsWhitelisted(value: WhitelistValidator[T]): Self = this.set("isWhitelisted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsWhitelisted: Self = this.set("isWhitelisted", js.undefined)
  }
}
