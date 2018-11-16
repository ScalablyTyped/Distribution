package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ajax")
@js.native
object ajaxNs extends js.Object {
  def load(url: java.lang.String): java.lang.String = js.native
  def load(url: java.lang.String, callback: js.Function1[/* data */ js.Any, scala.Unit]): java.lang.String = js.native
  def loadXml(url: java.lang.String): ckeditorLib.CKEDITORNs.xml = js.native
  def loadXml(url: java.lang.String, callback: js.Function1[/* data */ js.Any, scala.Unit]): ckeditorLib.CKEDITORNs.xml = js.native
  def post(url: java.lang.String, data: js.Any): scala.Unit = js.native
  def post(url: java.lang.String, data: js.Any, contentType: java.lang.String): scala.Unit = js.native
  def post(
    url: java.lang.String,
    data: js.Any,
    contentType: java.lang.String,
    callback: js.Function1[/* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

