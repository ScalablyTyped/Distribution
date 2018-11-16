package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPropertyValidationRule[T] extends js.Object {
  var Validators: ScalablyTyped.runtime.StringDictionary[js.Any]
  def Validate(context: IValidationContext[T]): js.Array[IValidationFailure]
  def ValidateAsync(context: IValidationContext[T]): qLib.qMod.QNs.Promise[js.Array[IValidationFailure]]
}

