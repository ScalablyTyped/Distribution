package typings.babelPluginJestHoist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
  var visitor: typings.babelTraverse.mod.Visitor[js.Object]
}

object Visitor {
  @scala.inline
  def apply(visitor: typings.babelTraverse.mod.Visitor[js.Object]): Visitor = {
    val __obj = js.Dynamic.literal(visitor = visitor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visitor]
  }
}

