package typings.babelTypes.anon

import typings.babelTypes.mod.BlockStatement_
import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: BlockStatement_ | Statement | Expression
}

object Body {
  @scala.inline
  def apply(body: BlockStatement_ | Statement | Expression): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

