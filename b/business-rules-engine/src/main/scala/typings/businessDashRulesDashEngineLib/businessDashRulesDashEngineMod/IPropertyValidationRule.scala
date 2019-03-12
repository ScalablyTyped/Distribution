package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValidationRule[T] extends js.Object {
  var Validators: org.scalablytyped.runtime.StringDictionary[js.Any]
  def Validate(context: IValidationContext[T]): js.Array[IValidationFailure]
  def ValidateAsync(context: IValidationContext[T]): qLib.qMod.QNs.Promise[js.Array[IValidationFailure]]
}

object IPropertyValidationRule {
  @scala.inline
  def apply[T](
    Validate: IValidationContext[T] => js.Array[IValidationFailure],
    ValidateAsync: IValidationContext[T] => qLib.qMod.QNs.Promise[js.Array[IValidationFailure]],
    Validators: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): IPropertyValidationRule[T] = {
    val __obj = js.Dynamic.literal(Validate = js.Any.fromFunction1(Validate), ValidateAsync = js.Any.fromFunction1(ValidateAsync), Validators = Validators)
  
    __obj.asInstanceOf[IPropertyValidationRule[T]]
  }
}

