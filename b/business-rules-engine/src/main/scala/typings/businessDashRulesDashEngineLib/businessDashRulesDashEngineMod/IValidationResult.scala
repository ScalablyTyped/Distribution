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
    Add: js.Function1[IValidationResult, scala.Unit],
    Children: js.Array[IValidationResult],
    ErrorCount: scala.Double,
    ErrorMessage: java.lang.String,
    HasErrors: scala.Boolean,
    HasErrorsDirty: scala.Boolean,
    Name: java.lang.String,
    Remove: js.Function1[scala.Double, scala.Unit],
    Optional: IOptional = null,
    TranslateArgs: js.Array[IErrorTranslateArgs] = null
  ): IValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Children")(Children)
    __obj.updateDynamic("ErrorCount")(ErrorCount)
    __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    __obj.updateDynamic("HasErrors")(HasErrors)
    __obj.updateDynamic("HasErrorsDirty")(HasErrorsDirty)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Remove")(Remove)
    if (Optional != null) __obj.updateDynamic("Optional")(Optional)
    if (TranslateArgs != null) __obj.updateDynamic("TranslateArgs")(TranslateArgs)
    __obj.asInstanceOf[IValidationResult]
  }
}

