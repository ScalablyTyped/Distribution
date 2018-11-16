package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine", "ValidationFailure")
@js.native
class ValidationFailure protected () extends IError {
  def this(Error: IError, IsAsync: scala.Boolean) = this()
  var Error: IError = js.native
  /* CompleteClass */
  override var ErrorMessage: java.lang.String = js.native
  /* CompleteClass */
  override var HasError: scala.Boolean = js.native
  var IsAsync: scala.Boolean = js.native
  @JSName("TranslateArgs")
  var TranslateArgs_ValidationFailure: IErrorTranslateArgs = js.native
}

