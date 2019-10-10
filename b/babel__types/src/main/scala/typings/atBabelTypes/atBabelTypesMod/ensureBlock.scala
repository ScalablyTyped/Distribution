package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.Anon_Body
import typings.std.Extract
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "ensureBlock")
@js.native
object ensureBlock extends js.Object {
  def apply(node: Extract[Node, Anon_Body]): BlockStatement = js.native
  def apply[K /* <: String */](node: Extract[Node, Record[K, BlockStatement | Statement | Expression]], key: K): BlockStatement = js.native
}

