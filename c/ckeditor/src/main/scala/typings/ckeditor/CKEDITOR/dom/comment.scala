package typings.ckeditor.CKEDITOR.dom

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.comment")
@js.native
class comment protected () extends node {
  def this(comment: String) = this()
  def this(comment: Node) = this()
  def this(comment: String, ownerDocument: typings.ckeditor.CKEDITOR.dom.document) = this()
  def this(comment: Node, ownerDocument: typings.ckeditor.CKEDITOR.dom.document) = this()
  def getOuterHtml(): String = js.native
}

