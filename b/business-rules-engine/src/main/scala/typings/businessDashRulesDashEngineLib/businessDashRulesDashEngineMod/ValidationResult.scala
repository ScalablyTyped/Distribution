package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine", "ValidationResult")
@js.native
class ValidationResult protected () extends IValidationResult {
  def this(Name: java.lang.String) = this()
  /* CompleteClass */
  override var Children: js.Array[IValidationResult] = js.native
  /* CompleteClass */
  override var ErrorCount: scala.Double = js.native
  /* CompleteClass */
  override var ErrorMessage: java.lang.String = js.native
  /* CompleteClass */
  override var HasErrors: scala.Boolean = js.native
  /* CompleteClass */
  override var HasErrorsDirty: scala.Boolean = js.native
  var IsDirty: scala.Boolean = js.native
  /* CompleteClass */
  override var Name: java.lang.String = js.native
  @JSName("Optional")
  var Optional_Original: IOptional = js.native
  @JSName("TranslateArgs")
  var TranslateArgs_ValidationResult: js.Array[IErrorTranslateArgs] = js.native
  /* CompleteClass */
  override def Add(validationResult: IValidationResult): scala.Unit = js.native
  @JSName("Optional")
  def Optional_MValidationResult(): scala.Boolean = js.native
  /* CompleteClass */
  override def Remove(index: scala.Double): scala.Unit = js.native
}

