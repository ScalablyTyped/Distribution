package typings.calidation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldConfig[T /* <: js.Object */] extends StObject {
  
  var isBlacklisted: js.UndefOr[BlacklistValidator[T]] = js.undefined
  
  var isEmail: js.UndefOr[SimpleValidator[T]] = js.undefined
  
  var isEqual: js.UndefOr[ValueValidator[js.Any, T]] = js.undefined
  
  var isExactLength: js.UndefOr[LengthValidator[T]] = js.undefined
  
  var isGreaterThan: js.UndefOr[ValueValidator[Double, T]] = js.undefined
  
  var isLessThan: js.UndefOr[ValueValidator[Double, T]] = js.undefined
  
  var isMaxLength: js.UndefOr[LengthValidator[T]] = js.undefined
  
  var isMinLength: js.UndefOr[LengthValidator[T]] = js.undefined
  
  var isNumber: js.UndefOr[SimpleValidator[T]] = js.undefined
  
  var isRegexMatch: js.UndefOr[RegexValidator[T]] = js.undefined
  
  var isRequired: js.UndefOr[SimpleValidator[T]] = js.undefined
  
  var isWhitelisted: js.UndefOr[WhitelistValidator[T]] = js.undefined
}
object FieldConfig {
  
  @scala.inline
  def apply[T /* <: js.Object */](): FieldConfig[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldConfig[T]]
  }
  
  @scala.inline
  implicit class FieldConfigMutableBuilder[Self <: FieldConfig[?], T /* <: js.Object */] (val x: Self & FieldConfig[T]) extends AnyVal {
    
    @scala.inline
    def setIsBlacklisted(value: BlacklistValidator[T]): Self = StObject.set(x, "isBlacklisted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBlacklistedFunction1(value: /* context */ ValidatorContext[T] => BlacklistValidatorConfig[T]): Self = StObject.set(x, "isBlacklisted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsBlacklistedUndefined: Self = StObject.set(x, "isBlacklisted", js.undefined)
    
    @scala.inline
    def setIsEmail(value: SimpleValidator[T]): Self = StObject.set(x, "isEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEmailFunction1(value: /* context */ ValidatorContext[T] => SimpleValidatorConfig[T]): Self = StObject.set(x, "isEmail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmailUndefined: Self = StObject.set(x, "isEmail", js.undefined)
    
    @scala.inline
    def setIsEqual(value: ValueValidator[js.Any, T]): Self = StObject.set(x, "isEqual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEqualFunction1(value: /* context */ ValidatorContext[T] => ValueValidatorConfig[js.Any, T]): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEqualUndefined: Self = StObject.set(x, "isEqual", js.undefined)
    
    @scala.inline
    def setIsExactLength(value: LengthValidator[T]): Self = StObject.set(x, "isExactLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExactLengthFunction1(value: /* context */ ValidatorContext[T] => LengthValidatorConfig[T]): Self = StObject.set(x, "isExactLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsExactLengthUndefined: Self = StObject.set(x, "isExactLength", js.undefined)
    
    @scala.inline
    def setIsGreaterThan(value: ValueValidator[Double, T]): Self = StObject.set(x, "isGreaterThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGreaterThanFunction1(value: /* context */ ValidatorContext[T] => ValueValidatorConfig[Double, T]): Self = StObject.set(x, "isGreaterThan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsGreaterThanUndefined: Self = StObject.set(x, "isGreaterThan", js.undefined)
    
    @scala.inline
    def setIsLessThan(value: ValueValidator[Double, T]): Self = StObject.set(x, "isLessThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLessThanFunction1(value: /* context */ ValidatorContext[T] => ValueValidatorConfig[Double, T]): Self = StObject.set(x, "isLessThan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsLessThanUndefined: Self = StObject.set(x, "isLessThan", js.undefined)
    
    @scala.inline
    def setIsMaxLength(value: LengthValidator[T]): Self = StObject.set(x, "isMaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMaxLengthFunction1(value: /* context */ ValidatorContext[T] => LengthValidatorConfig[T]): Self = StObject.set(x, "isMaxLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsMaxLengthUndefined: Self = StObject.set(x, "isMaxLength", js.undefined)
    
    @scala.inline
    def setIsMinLength(value: LengthValidator[T]): Self = StObject.set(x, "isMinLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMinLengthFunction1(value: /* context */ ValidatorContext[T] => LengthValidatorConfig[T]): Self = StObject.set(x, "isMinLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsMinLengthUndefined: Self = StObject.set(x, "isMinLength", js.undefined)
    
    @scala.inline
    def setIsNumber(value: SimpleValidator[T]): Self = StObject.set(x, "isNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNumberFunction1(value: /* context */ ValidatorContext[T] => SimpleValidatorConfig[T]): Self = StObject.set(x, "isNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNumberUndefined: Self = StObject.set(x, "isNumber", js.undefined)
    
    @scala.inline
    def setIsRegexMatch(value: RegexValidator[T]): Self = StObject.set(x, "isRegexMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRegexMatchFunction1(value: /* context */ ValidatorContext[T] => RegexValidatorConfig[T]): Self = StObject.set(x, "isRegexMatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsRegexMatchUndefined: Self = StObject.set(x, "isRegexMatch", js.undefined)
    
    @scala.inline
    def setIsRequired(value: SimpleValidator[T]): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRequiredFunction1(value: /* context */ ValidatorContext[T] => SimpleValidatorConfig[T]): Self = StObject.set(x, "isRequired", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
    
    @scala.inline
    def setIsWhitelisted(value: WhitelistValidator[T]): Self = StObject.set(x, "isWhitelisted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWhitelistedFunction1(value: /* context */ ValidatorContext[T] => RegexValidatorConfig[T]): Self = StObject.set(x, "isWhitelisted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsWhitelistedUndefined: Self = StObject.set(x, "isWhitelisted", js.undefined)
  }
}
