package typings
package ckeditorLib.CKEDITORNs.pluginsNs.embedBaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait baseDefinition
  extends ckeditorLib.CKEDITORNs.pluginsNs.widgetNs.definition {
  var providerUrl: ckeditorLib.CKEDITORNs.template = js.native
  var urlRegExp: stdLib.RegExp = js.native
  def getErrorMessage(messageTypeOrMessage: java.lang.String): java.lang.String = js.native
  def getErrorMessage(messageTypeOrMessage: java.lang.String, url: java.lang.String): java.lang.String = js.native
  def getErrorMessage(messageTypeOrMessage: java.lang.String, url: java.lang.String, suffix: java.lang.String): java.lang.String = js.native
  def isUrlValid(url: java.lang.String): scala.Boolean = js.native
  def loadContent(url: java.lang.String): request = js.native
  def loadContent(url: java.lang.String, callback: js.Function0[scala.Unit]): request = js.native
  def loadContent(
    url: java.lang.String,
    callback: js.Function0[scala.Unit],
    errorCallback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): request = js.native
  def loadContent(
    url: java.lang.String,
    callback: js.Function0[scala.Unit],
    errorCallback: js.Function1[/* error */ java.lang.String, scala.Unit],
    noNotifications: scala.Boolean
  ): request = js.native
}

