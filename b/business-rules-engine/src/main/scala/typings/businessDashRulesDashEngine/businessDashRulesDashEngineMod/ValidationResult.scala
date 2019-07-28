package typings.businessDashRulesDashEngine.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine", "ValidationResult")
@js.native
class ValidationResult protected () extends IValidationResult {
  def this(Name: String) = this()
  /* CompleteClass */
  override var Children: js.Array[IValidationResult] = js.native
  /* CompleteClass */
  override var ErrorCount: Double = js.native
  /* CompleteClass */
  override var ErrorMessage: String = js.native
  /* CompleteClass */
  override var HasErrors: Boolean = js.native
  /* CompleteClass */
  override var HasErrorsDirty: Boolean = js.native
  var IsDirty: Boolean = js.native
  /* CompleteClass */
  override var Name: String = js.native
  @JSName("Optional")
  var Optional_Original: IOptional = js.native
  @JSName("TranslateArgs")
  var TranslateArgs_ValidationResult: js.Array[IErrorTranslateArgs] = js.native
  /* CompleteClass */
  override def Add(validationResult: IValidationResult): Unit = js.native
  @JSName("Optional")
  def Optional_MValidationResult(): Boolean = js.native
  /* CompleteClass */
  override def Remove(index: Double): Unit = js.native
}

