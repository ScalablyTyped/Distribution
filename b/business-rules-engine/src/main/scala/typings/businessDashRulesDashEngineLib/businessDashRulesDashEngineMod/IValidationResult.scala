package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidationResult extends js.Object {
  var Children: js.Array[IValidationResult]
  var ErrorCount: scala.Double
  var ErrorMessage: java.lang.String
  var HasErrors: scala.Boolean
  var HasErrorsDirty: scala.Boolean
  var Name: java.lang.String
  var Optional: js.UndefOr[IOptional] = js.undefined
  var TranslateArgs: js.UndefOr[js.Array[IErrorTranslateArgs]] = js.undefined
  def Add(validationResult: IValidationResult): scala.Unit
  def Remove(index: scala.Double): scala.Unit
}

