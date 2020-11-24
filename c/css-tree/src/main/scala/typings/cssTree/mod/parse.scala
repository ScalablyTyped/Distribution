package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("css-tree", "parse")
@js.native
object parse extends js.Object {
  
  def apply(text: String): CssNode = js.native
  def apply(text: String, options: ParseOptions): CssNode = js.native
}
