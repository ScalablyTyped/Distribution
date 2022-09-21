package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.azdata.mod.ComponentProperties because Already inherited
- typings.azdata.mod.TitledComponentProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined title
- typings.azdata.mod.TextComponentProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined value, links, description, requiredIndicator, headingLevel, textType */ @js.native
trait TextComponent
  extends StObject
     with Component {
  
  /**
    * If set then an info icon is displayed next to the text which will display the description text when hovered over.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The heading level for this component - if set the text component will be created as an h#
    * HTML element with this value being the #.
    */
  var headingLevel: js.UndefOr[HeadingLevel] = js.native
  
  /**
    * List of links to embed within the text. If links are specified there must be placeholder
    * values in the value indicating where the links should be placed, in the format {i}
    *
    * e.g. "Click {0} for more information!""
    */
  var links: js.UndefOr[js.Array[LinkArea]] = js.native
  
  /**
    * Whether to display a * next to the text to indicate that the field is required. Default is false.
    */
  var requiredIndicator: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the type of text box to be displayed. Default is plain text.
    */
  var textType: js.UndefOr[TextType] = js.native
  
  /**
    * The title for the component. This title will show when hovered over
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Provide value to be displayed in the text component. An array of values will be displayed as an unordered list.
    */
  var value: js.UndefOr[String | js.Array[String]] = js.native
}
