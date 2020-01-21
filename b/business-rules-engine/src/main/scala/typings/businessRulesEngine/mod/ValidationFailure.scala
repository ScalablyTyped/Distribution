package typings.businessRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine", "ValidationFailure")
@js.native
class ValidationFailure protected () extends IError {
  def this(Error: IError, IsAsync: Boolean) = this()
  var Error: IError = js.native
  /* CompleteClass */
  override var ErrorMessage: String = js.native
  /* CompleteClass */
  override var HasError: Boolean = js.native
  var IsAsync: Boolean = js.native
  @JSName("TranslateArgs")
  var TranslateArgs_ValidationFailure: IErrorTranslateArgs = js.native
}

