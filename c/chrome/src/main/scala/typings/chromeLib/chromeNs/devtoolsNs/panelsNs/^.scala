package typings
package chromeLib.chromeNs.devtoolsNs.panelsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.devtools.panels")
@js.native
object ^ extends js.Object {
  var elements: ElementsPanel = js.native
  var sources: SourcesPanel = js.native
  def create(title: java.lang.String, iconPath: java.lang.String, pagePath: java.lang.String): scala.Unit = js.native
  def create(
    title: java.lang.String,
    iconPath: java.lang.String,
    pagePath: java.lang.String,
    callback: js.Function1[/* panel */ ExtensionPanel, scala.Unit]
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

