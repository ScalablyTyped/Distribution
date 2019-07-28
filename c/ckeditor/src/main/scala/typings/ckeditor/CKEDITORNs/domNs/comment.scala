package typings.ckeditor.CKEDITORNs.domNs

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.comment")
@js.native
class comment protected () extends node {
  def this(comment: String) = this()
  def this(comment: Node) = this()
  def this(comment: String, ownerDocument: document) = this()
  def this(comment: Node, ownerDocument: document) = this()
  def getOuterHtml(): String = js.native
}

