package typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod

import org.scalablytyped.runtime.StringDictionary
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValidationRule[T] extends js.Object {
  var Validators: StringDictionary[js.Any]
  def Validate(context: IValidationContext[T]): js.Array[IValidationFailure]
  def ValidateAsync(context: IValidationContext[T]): Promise[js.Array[IValidationFailure]]
}

object IPropertyValidationRule {
  @scala.inline
  def apply[T](
    Validate: IValidationContext[T] => js.Array[IValidationFailure],
    ValidateAsync: IValidationContext[T] => Promise[js.Array[IValidationFailure]],
    Validators: StringDictionary[js.Any]
  ): IPropertyValidationRule[T] = {
    val __obj = js.Dynamic.literal(Validate = js.Any.fromFunction1(Validate), ValidateAsync = js.Any.fromFunction1(ValidateAsync), Validators = Validators.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPropertyValidationRule[T]]
  }
}

