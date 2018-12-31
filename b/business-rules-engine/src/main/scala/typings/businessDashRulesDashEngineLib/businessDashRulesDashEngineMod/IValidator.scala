package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidator extends js.Object {
  var Error: IError
  def Validate(context: js.Any): IValidationFailure
  def ValidateAsync(context: js.Any): qLib.qMod.QNs.Promise[IValidationFailure]
}

