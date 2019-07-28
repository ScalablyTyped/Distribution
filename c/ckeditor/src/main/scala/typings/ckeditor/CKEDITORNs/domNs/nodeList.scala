package typings.ckeditor.CKEDITORNs.domNs

import typings.std.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.nodeList")
@js.native
class nodeList protected () extends js.Object {
  def this(nativeList: NodeList) = this()
  def count(): Double = js.native
  def getItem(index: Double): node = js.native
  def toArray(): js.Array[node] = js.native
}

