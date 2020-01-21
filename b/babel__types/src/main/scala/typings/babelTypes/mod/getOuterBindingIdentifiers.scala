package typings.babelTypes.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "getOuterBindingIdentifiers")
@js.native
object getOuterBindingIdentifiers extends js.Object {
  def apply(node: Node): Record[String, Identifier_] = js.native
  def apply(node: Node, duplicates: Boolean): Record[String, Identifier_ | js.Array[Identifier_]] = js.native
}

