package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.PropertiesContainerComponentProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined propertyItems, showToggleButton */ @js.native
trait PropertiesContainerComponent
  extends StObject
     with Component {
  
  /**
    * The properties to display
    */
  var propertyItems: js.UndefOr[js.Array[PropertiesContainerItem]] = js.native
  
  /**
    * Whether to show the button that will hide/show the content of the container. Default value is false.
    */
  var showToggleButton: js.UndefOr[Boolean] = js.native
}
