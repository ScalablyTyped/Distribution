package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine", "AbstractValidator")
@js.native
class AbstractValidator[T] () extends IAbstractValidator[T] {
  var AbstractValidators: org.scalablytyped.runtime.StringDictionary[IAbstractValidator[_]] = js.native
  /* CompleteClass */
  override var ForList: scala.Boolean = js.native
  var ValidationFunctions: org.scalablytyped.runtime.StringDictionary[js.Array[IValidatorFce]] = js.native
  var Validators: org.scalablytyped.runtime.StringDictionary[js.Array[IPropertyValidator]] = js.native
  /* CompleteClass */
  override def CreateAbstractListRule(name: java.lang.String): IAbstractValidationRule[_] = js.native
  /* CompleteClass */
  override def CreateAbstractRule(name: java.lang.String): IAbstractValidationRule[_] = js.native
  /* CompleteClass */
  override def CreateRule(name: java.lang.String): IAbstractValidationRule[_] = js.native
  /* CompleteClass */
  override def RuleFor(prop: java.lang.String, validator: IPropertyValidator): js.Any = js.native
  /* CompleteClass */
  override def Validation(validatorFce: IValidatorFce): js.Any = js.native
  /* CompleteClass */
  override def ValidationFor(prop: java.lang.String, validatorFce: IValidatorFce): js.Any = js.native
  /* CompleteClass */
  override def ValidatorFor[K](prop: java.lang.String, validator: IAbstractValidator[K]): js.Any = js.native
  def ValidatorFor[K](prop: java.lang.String, validator: IAbstractValidator[K], forList: scala.Boolean): scala.Unit = js.native
}

