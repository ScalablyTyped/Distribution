package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateHandlers extends js.Object {
  
  def children(node: CssNode): Unit = js.native
  def children(node: CssNode, delimiter: js.Function1[/* node */ CssNode, Unit]): Unit = js.native
  
  def chunk(chunk: String): Unit = js.native
  
  def node(node: CssNode): Unit = js.native
  
  def result(): String = js.native
}
