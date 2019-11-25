package typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractValidator[T] extends js.Object {
  var ForList: Boolean
  def CreateAbstractListRule(name: String): IAbstractValidationRule[_]
  def CreateAbstractRule(name: String): IAbstractValidationRule[_]
  def CreateRule(name: String): IAbstractValidationRule[_]
  def RuleFor(prop: String, validator: IPropertyValidator): js.Any
  def Validation(validatorFce: IValidatorFce): js.Any
  def ValidationFor(prop: String, validatorFce: IValidatorFce): js.Any
  def ValidatorFor[K](prop: String, validator: IAbstractValidator[K]): js.Any
}

object IAbstractValidator {
  @scala.inline
  def apply[T](
    CreateAbstractListRule: String => IAbstractValidationRule[_],
    CreateAbstractRule: String => IAbstractValidationRule[_],
    CreateRule: String => IAbstractValidationRule[_],
    ForList: Boolean,
    RuleFor: (String, IPropertyValidator) => js.Any,
    Validation: IValidatorFce => js.Any,
    ValidationFor: (String, IValidatorFce) => js.Any,
    ValidatorFor: (String, IAbstractValidator[js.Any]) => js.Any
  ): IAbstractValidator[T] = {
    val __obj = js.Dynamic.literal(CreateAbstractListRule = js.Any.fromFunction1(CreateAbstractListRule), CreateAbstractRule = js.Any.fromFunction1(CreateAbstractRule), CreateRule = js.Any.fromFunction1(CreateRule), ForList = ForList.asInstanceOf[js.Any], RuleFor = js.Any.fromFunction2(RuleFor), Validation = js.Any.fromFunction1(Validation), ValidationFor = js.Any.fromFunction2(ValidationFor), ValidatorFor = js.Any.fromFunction2(ValidatorFor))
  
    __obj.asInstanceOf[IAbstractValidator[T]]
  }
}

