package typings.babelTypes.mod

import typings.babelTypes.AnonBody
import typings.std.Extract
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "ensureBlock")
@js.native
object ensureBlock extends js.Object {
  def apply(node: Extract[Node, AnonBody]): BlockStatement_ = js.native
  def apply[K /* <: /* keyof std.Extract<@babel/types.@babel/types.Node, @babel/types.AnonBody> */ String */](node: Extract[Node, Record[K, BlockStatement_ | Statement | Expression]], key: K): BlockStatement_ = js.native
}

