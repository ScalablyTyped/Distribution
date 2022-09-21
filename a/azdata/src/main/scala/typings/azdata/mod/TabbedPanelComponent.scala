package typings.azdata.mod

import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabbedPanelComponent
  extends StObject
     with Container[TabbedPanelLayout, Any] {
  
  /**
    * An event triggered when the selected tab is changed.
    * The event argument is the id of the selected tab.
    */
  def onTabChanged(listener: js.Function1[/* e */ String, Any]): Disposable = js.native
  def onTabChanged(listener: js.Function1[/* e */ String, Any], thisArgs: Any): Disposable = js.native
  def onTabChanged(listener: js.Function1[/* e */ String, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onTabChanged(listener: js.Function1[/* e */ String, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  /**
    * An event triggered when the selected tab is changed.
    * The event argument is the id of the selected tab.
    */
  @JSName("onTabChanged")
  var onTabChanged_Original: Event[String] = js.native
  
  /**
    * Selects the tab with the specified id
    * @param id The id of the tab to select
    */
  def selectTab(id: String): Unit = js.native
  
  /**
    * update the tabs.
    * @param tabs new tabs
    */
  def updateTabs(tabs: js.Array[Tab | TabGroup]): Unit = js.native
}
