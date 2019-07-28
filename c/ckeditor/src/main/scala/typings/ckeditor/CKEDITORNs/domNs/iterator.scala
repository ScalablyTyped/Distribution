package typings.ckeditor.CKEDITORNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.iterator")
@js.native
class iterator protected () extends js.Object {
  def this(range: typings.ckeditor.CKEDITORNs.domNs.range) = this()
  val activeFilter: typings.ckeditor.CKEDITORNs.filter = js.native
  var enforceRealBlocks: Boolean = js.native
  var enlargeBr: Boolean = js.native
  val filter: typings.ckeditor.CKEDITORNs.filter = js.native
  var forceBrBreak: Boolean = js.native
  val range: typings.ckeditor.CKEDITORNs.domNs.range = js.native
  def getNextParagraph(): element = js.native
  def getNextParagraph(blockTag: String): element = js.native
}

