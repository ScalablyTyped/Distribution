package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.TextComponentProperties because var conflicts: CSSStyles, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined value, links, description, requiredIndicator */ @js.native
trait TextComponent
  extends StObject
     with Component
     with TitledComponentProperties {
  
  var description: js.UndefOr[String] = js.native
  
  var links: js.UndefOr[js.Array[LinkArea]] = js.native
  
  var requiredIndicator: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String] = js.native
}
