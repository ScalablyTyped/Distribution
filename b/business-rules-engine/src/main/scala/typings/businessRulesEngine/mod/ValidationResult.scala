package typings.businessRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine", "ValidationResult")
@js.native
class ValidationResult protected () extends IValidationResult {
  def this(Name: String) = this()
  var IsDirty: Boolean = js.native
  @JSName("Optional")
  var Optional_Original: IOptional = js.native
  @JSName("TranslateArgs")
  var TranslateArgs_ValidationResult: js.Array[IErrorTranslateArgs] = js.native
  @JSName("Optional")
  def Optional_MValidationResult(): Boolean = js.native
}

