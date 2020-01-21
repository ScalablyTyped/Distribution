package typings.decorum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "CustomValidator")
@js.native
class CustomValidator[TModel] protected () extends BaseValidator {
  def this(predicate: js.Function2[/* value */ js.Any, /* model */ TModel, Boolean], message: String) = this()
  def this(
    predicate: js.Function2[/* value */ js.Any, /* model */ TModel, Boolean],
    message: MessageHandler[CustomValidator[TModel]]
  ) = this()
}

