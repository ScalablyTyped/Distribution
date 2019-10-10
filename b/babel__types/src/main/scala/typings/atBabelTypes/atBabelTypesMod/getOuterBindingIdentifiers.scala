package typings.atBabelTypes.atBabelTypesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "getOuterBindingIdentifiers")
@js.native
object getOuterBindingIdentifiers extends js.Object {
  def apply(node: Node): Record[String, Identifier] = js.native
  def apply(node: Node, duplicates: Boolean): Record[String, Identifier | js.Array[Identifier]] = js.native
}

