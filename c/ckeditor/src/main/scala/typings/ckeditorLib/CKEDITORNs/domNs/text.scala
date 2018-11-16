package typings
package ckeditorLib.CKEDITORNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.text")
@js.native
class text protected () extends node {
  def this(text: java.lang.String) = this()
  def this(text: stdLib.Text) = this()
  def this(text: java.lang.String, ownerDocument: document) = this()
  def this(text: stdLib.Text, ownerDocument: document) = this()
  @JSName("$")
  val $_text: stdLib.Text = js.native
  val `type`: scala.Double = js.native
  def getLength(): scala.Double = js.native
  def getText(): java.lang.String = js.native
  def setText(text: java.lang.String): scala.Unit = js.native
  def split(offset: scala.Double): text = js.native
  def substring(indexA: scala.Double): scala.Unit = js.native
  def substring(indexA: scala.Double, indexB: scala.Double): scala.Unit = js.native
}

