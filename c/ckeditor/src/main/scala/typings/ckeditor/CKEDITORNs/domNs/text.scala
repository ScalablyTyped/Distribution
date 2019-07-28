package typings.ckeditor.CKEDITORNs.domNs

import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.text")
@js.native
class text protected () extends node {
  def this(text: String) = this()
  def this(text: Text) = this()
  def this(text: String, ownerDocument: document) = this()
  def this(text: Text, ownerDocument: document) = this()
  @JSName("$")
  val $_text: Text = js.native
  def getLength(): Double = js.native
  def getText(): String = js.native
  def setText(text: String): Unit = js.native
  def split(offset: Double): text = js.native
  def substring(indexA: Double): Unit = js.native
  def substring(indexA: Double, indexB: Double): Unit = js.native
}

