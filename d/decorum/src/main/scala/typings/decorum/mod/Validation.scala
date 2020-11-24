package typings.decorum.mod

import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("decorum", "Validation")
@js.native
object Validation extends js.Object {
  
  def apply[TModel](message: String, predicate: js.Function2[/* value */ js.Any, /* model */ TModel, Boolean]): PropertyDecorator = js.native
  def apply[TModel](
    message: MessageHandler[CustomValidator[TModel]],
    predicate: js.Function2[/* value */ js.Any, /* model */ TModel, Boolean]
  ): PropertyDecorator = js.native
}
