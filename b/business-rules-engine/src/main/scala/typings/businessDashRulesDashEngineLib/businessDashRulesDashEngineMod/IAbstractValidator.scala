package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractValidator[T] extends js.Object {
  var ForList: scala.Boolean
  def CreateAbstractListRule(name: java.lang.String): IAbstractValidationRule[_]
  def CreateAbstractRule(name: java.lang.String): IAbstractValidationRule[_]
  def CreateRule(name: java.lang.String): IAbstractValidationRule[_]
  def RuleFor(prop: java.lang.String, validator: IPropertyValidator): js.Any
  def Validation(validatorFce: IValidatorFce): js.Any
  def ValidationFor(prop: java.lang.String, validatorFce: IValidatorFce): js.Any
  def ValidatorFor[K](prop: java.lang.String, validator: IAbstractValidator[K]): js.Any
}

