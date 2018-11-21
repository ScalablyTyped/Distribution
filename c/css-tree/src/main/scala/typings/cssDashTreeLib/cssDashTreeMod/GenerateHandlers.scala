package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateHandlers extends js.Object {
  def children(node: CssNode): scala.Unit = js.native
  def children(node: CssNode, delimiter: js.Function1[/* node */ CssNode, scala.Unit]): scala.Unit = js.native
  def chunk(chunk: java.lang.String): scala.Unit = js.native
  def node(node: CssNode): scala.Unit = js.native
  def result(): java.lang.String = js.native
}

