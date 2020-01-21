package typings.babelPluginJestHoist

import typings.babelTraverse.mod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVisitor extends js.Object {
  var visitor: Visitor[js.Object]
}

object AnonVisitor {
  @scala.inline
  def apply(visitor: Visitor[js.Object]): AnonVisitor = {
    val __obj = js.Dynamic.literal(visitor = visitor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonVisitor]
  }
}

