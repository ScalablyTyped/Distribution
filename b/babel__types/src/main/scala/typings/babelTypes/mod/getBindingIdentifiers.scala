package typings.babelTypes.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types", "getBindingIdentifiers")
@js.native
object getBindingIdentifiers extends js.Object {
  
  def apply(node: Node): Record[String, Identifier_] = js.native
  def apply(node: Node, duplicates: js.UndefOr[scala.Nothing], outerOnly: Boolean): Record[String, Identifier_] = js.native
  def apply(node: Node, duplicates: Boolean): Record[String, Identifier_ | js.Array[Identifier_]] = js.native
  def apply(node: Node, duplicates: Boolean, outerOnly: Boolean): Record[String, Identifier_ | js.Array[Identifier_]] = js.native
}
