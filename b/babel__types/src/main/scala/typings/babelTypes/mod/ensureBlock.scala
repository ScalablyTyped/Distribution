package typings.babelTypes.mod

import typings.babelTypes.anon.`0`
import typings.std.Extract
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types", "ensureBlock")
@js.native
object ensureBlock extends js.Object {
  
  def apply(node: Extract[Node, `0`]): BlockStatement_ = js.native
  def apply[K /* <: /* keyof std.Extract<@babel/types.@babel/types.Node, @babel/types.anon.0> */ String */](node: Extract[Node, Record[K, BlockStatement_ | Statement | Expression]], key: K): BlockStatement_ = js.native
}
