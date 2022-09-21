package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.ComponentWithIconProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined iconPath, iconHeight, iconWidth, title */ @js.native
trait ComponentWithIcon
  extends StObject
     with Component {
  
  /**
    * The height of the icon
    */
  var iconHeight: js.UndefOr[Double | String] = js.native
  
  /**
    * The path for the icon with optional dark-theme away alternative
    */
  var iconPath: js.UndefOr[IconPath] = js.native
  
  /**
    * The width of the icon
    */
  var iconWidth: js.UndefOr[Double | String] = js.native
  
  /**
    * The title for the icon. This title will show when hovered over
    */
  var title: js.UndefOr[String] = js.native
}
