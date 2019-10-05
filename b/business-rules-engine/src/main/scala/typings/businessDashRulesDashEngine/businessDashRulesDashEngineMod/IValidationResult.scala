package typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidationResult extends js.Object {
  var Children: js.Array[IValidationResult]
  var ErrorCount: Double
  var ErrorMessage: String
  var HasErrors: Boolean
  var HasErrorsDirty: Boolean
  var Name: String
  var Optional: js.UndefOr[IOptional] = js.undefined
  var TranslateArgs: js.UndefOr[js.Array[IErrorTranslateArgs]] = js.undefined
  def Add(validationResult: IValidationResult): Unit
  def Remove(index: Double): Unit
}

object IValidationResult {
  @scala.inline
  def apply(
    Add: IValidationResult => Unit,
    Children: js.Array[IValidationResult],
    ErrorCount: Double,
    ErrorMessage: String,
    HasErrors: Boolean,
    HasErrorsDirty: Boolean,
    Name: String,
    Remove: Double => Unit,
    Optional: () => Boolean = null,
    TranslateArgs: js.Array[IErrorTranslateArgs] = null
  ): IValidationResult = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Children = Children, ErrorCount = ErrorCount, ErrorMessage = ErrorMessage, HasErrors = HasErrors, HasErrorsDirty = HasErrorsDirty, Name = Name, Remove = js.Any.fromFunction1(Remove))
    if (Optional != null) __obj.updateDynamic("Optional")(js.Any.fromFunction0(Optional))
    if (TranslateArgs != null) __obj.updateDynamic("TranslateArgs")(TranslateArgs)
    __obj.asInstanceOf[IValidationResult]
  }
}

