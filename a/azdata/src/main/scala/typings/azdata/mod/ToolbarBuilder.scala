package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarBuilder
  extends StObject
     with ContainerBuilder[ToolbarContainer, ToolbarLayout, Any, ContainerProperties] {
  
  /**
    * Creates a child component and adds it to this container.
    *
    * @param toolbarComponent the component to be added
    */
  def addToolbarItem(toolbarComponent: ToolbarComponent): Unit = js.native
  
  /**
    * Creates a collection of child components and adds them all to this container
    *
    * @param toolbarComponents the definitions
    */
  def addToolbarItems(toolbarComponents: js.Array[ToolbarComponent]): Unit = js.native
  
  def withToolbarItems(components: js.Array[ToolbarComponent]): ContainerBuilder[ToolbarContainer, ToolbarLayout, Any, ContainerProperties] = js.native
}
