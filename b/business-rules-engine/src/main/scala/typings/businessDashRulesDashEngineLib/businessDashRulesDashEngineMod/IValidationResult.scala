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

object IValidationResult {
  @scala.inline
  def apply(
    Add: IValidationResult => scala.Unit,
    Children: js.Array[IValidationResult],
    ErrorCount: scala.Double,
    ErrorMessage: java.lang.String,
    HasErrors: scala.Boolean,
    HasErrorsDirty: scala.Boolean,
    Name: java.lang.String,
    Remove: scala.Double => scala.Unit,
    Optional: IOptional = null,
    TranslateArgs: js.Array[IErrorTranslateArgs] = null
  ): IValidationResult = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Children = Children, ErrorCount = ErrorCount, ErrorMessage = ErrorMessage, HasErrors = HasErrors, HasErrorsDirty = HasErrorsDirty, Name = Name, Remove = js.Any.fromFunction1(Remove))
    if (Optional != null) __obj.updateDynamic("Optional")(Optional)
    if (TranslateArgs != null) __obj.updateDynamic("TranslateArgs")(TranslateArgs)
    __obj.asInstanceOf[IValidationResult]
  }
}

