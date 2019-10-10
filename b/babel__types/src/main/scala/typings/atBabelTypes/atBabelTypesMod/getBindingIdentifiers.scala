package typings.atBabelTypes.atBabelTypesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "getBindingIdentifiers")
@js.native
object getBindingIdentifiers extends js.Object {
  def apply(node: Node): Record[String, Identifier] = js.native
  def apply(node: Node, duplicates: Boolean): Record[String, Identifier | js.Array[Identifier]] = js.native
  def apply(node: Node, duplicates: Boolean, outerOnly: Boolean): Record[String, Identifier | js.Array[Identifier]] = js.native
}

