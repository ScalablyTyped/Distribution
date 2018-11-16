package typings
package ckeditorLib.CKEDITORNs.pluginsNs.imagebaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.imagebase.progressReporter")
@js.native
class progressReporter () extends js.Object {
  def this(wrapperHtml: java.lang.String) = this()
  var wrapper: ckeditorLib.CKEDITORNs.domNs.element = js.native
  def aborted(): scala.Unit = js.native
  def bindLoader(loader: ckeditorLib.CKEDITORNs.fileToolsNs.fileLoader): scala.Unit = js.native
  def done(): scala.Unit = js.native
  def failed(): scala.Unit = js.native
  def remove(): scala.Unit = js.native
  def updated(progress: scala.Double): scala.Unit = js.native
}

