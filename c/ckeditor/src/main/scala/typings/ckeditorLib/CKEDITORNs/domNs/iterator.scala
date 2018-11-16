package typings
package ckeditorLib.CKEDITORNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.iterator")
@js.native
class iterator protected () extends js.Object {
  def this(range: range) = this()
  val activeFilter: ckeditorLib.CKEDITORNs.filter = js.native
  var enforceRealBlocks: scala.Boolean = js.native
  var enlargeBr: scala.Boolean = js.native
  val filter: ckeditorLib.CKEDITORNs.filter = js.native
  var forceBrBreak: scala.Boolean = js.native
  val range: range = js.native
  def getNextParagraph(): element = js.native
  def getNextParagraph(blockTag: java.lang.String): element = js.native
}

