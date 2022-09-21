package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.InfoBoxComponentProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined style, text, announceText */ @js.native
trait InfoBoxComponent
  extends StObject
     with Component {
  
  /**
    * Controls whether the text should be announced by the screen reader. Default value is false.
    */
  var announceText: js.UndefOr[Boolean] = js.native
  
  /**
    * The style of the InfoBox
    */
  var style: InfoBoxStyle = js.native
  
  /**
    * The display text of the InfoBox
    */
  var text: String = js.native
}
