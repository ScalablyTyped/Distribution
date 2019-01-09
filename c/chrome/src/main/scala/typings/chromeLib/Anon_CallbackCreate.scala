package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackCreate extends js.Object {
  var elements: chromeLib.chromeNs.devtoolsNs.panelsNs.ElementsPanel = js.native
  var sources: chromeLib.chromeNs.devtoolsNs.panelsNs.SourcesPanel = js.native
  def create(title: java.lang.String, iconPath: java.lang.String, pagePath: java.lang.String): scala.Unit = js.native
  def create(
    title: java.lang.String,
    iconPath: java.lang.String,
    pagePath: java.lang.String,
    callback: js.Function1[/* panel */ chromeLib.chromeNs.devtoolsNs.panelsNs.ExtensionPanel, scala.Unit]
  ): scala.Unit = js.native
  def openResource(url: java.lang.String, lineNumber: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setOpenResourceHandler(): scala.Unit = js.native
  def setOpenResourceHandler(
    callback: js.Function1[
      /* resource */ chromeLib.chromeNs.devtoolsNs.inspectedWindowNs.Resource, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

