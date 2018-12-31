package typings
package ckeditorLib.CKEDITORNs.fileToolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait uploadWidgetDefinition
  extends ckeditorLib.CKEDITORNs.pluginsNs.widgetNs.definition {
  var additionalRequestParameters: js.Any
  var loadMethod: java.lang.String
  var loaderType: js.Any
  var skipNotifications: scala.Boolean
  var supportedTypes: java.lang.String
  var uploadUrl: java.lang.String
  def fileToElement(pastedFile: js.Any): stdLib.HTMLElement
  def onAbort(): scala.Boolean
  def onError(): scala.Boolean
  def onLoaded(): scala.Boolean
  def onUploaded(): scala.Boolean
  def onUploading(): scala.Boolean
  def replaceWith(): js.Any
}

