package typings.chrome.anon

import typings.chrome.chrome.devtools.inspectedWindow.Resource
import typings.chrome.chrome.devtools.panels.ElementsPanel
import typings.chrome.chrome.devtools.panels.ExtensionPanel
import typings.chrome.chrome.devtools.panels.SourcesPanel
import typings.chrome.chromeStrings.dark
import typings.chrome.chromeStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpanels extends StObject {
  
  def create(title: String, iconPath: String, pagePath: String): Unit = js.native
  def create(
    title: String,
    iconPath: String,
    pagePath: String,
    callback: js.Function1[/* panel */ ExtensionPanel, Unit]
  ): Unit = js.native
  
  var elements: ElementsPanel = js.native
  
  def openResource(url: String, lineNumber: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def setOpenResourceHandler(): Unit = js.native
  def setOpenResourceHandler(callback: js.Function1[/* resource */ Resource, Unit]): Unit = js.native
  
  var sources: SourcesPanel = js.native
  
  var themeName: default | dark = js.native
}
