package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabbedPanelComponentBuilder
  extends StObject
     with ContainerBuilder[TabbedPanelComponent, TabbedPanelLayout, Any, ContainerProperties] {
  
  /**
    * Add the tabs to the component
    * @param tabs tabs/tab groups to be added
    */
  def withTabs(tabs: js.Array[Tab | TabGroup]): ContainerBuilder[TabbedPanelComponent, TabbedPanelLayout, Any, ContainerProperties] = js.native
}
