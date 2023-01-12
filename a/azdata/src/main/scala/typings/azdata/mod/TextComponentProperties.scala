package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextComponentProperties
  extends StObject
     with TitledComponentProperties {
  
  /**
    * If set then an info icon is displayed next to the text which will display the description text when hovered over.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The heading level for this component - if set the text component will be created as an h#
    * HTML element with this value being the #.
    */
  var headingLevel: js.UndefOr[HeadingLevel] = js.undefined
  
  /**
    * List of links to embed within the text. If links are specified there must be placeholder
    * values in the value indicating where the links should be placed, in the format {i}
    *
    * e.g. "Click {0} for more information!""
    */
  var links: js.UndefOr[js.Array[LinkArea]] = js.undefined
  
  /**
    * Whether to display a * next to the text to indicate that the field is required. Default is false.
    */
  var requiredIndicator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the type of text box to be displayed. Default is plain text.
    */
  var textType: js.UndefOr[TextType] = js.undefined
  
  /**
    * Provide value to be displayed in the text component. An array of values will be displayed as an unordered list.
    */
  var value: js.UndefOr[String | js.Array[String]] = js.undefined
}
object TextComponentProperties {
  
  inline def apply(): TextComponentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextComponentProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextComponentProperties] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHeadingLevel(value: HeadingLevel): Self = StObject.set(x, "headingLevel", value.asInstanceOf[js.Any])
    
    inline def setHeadingLevelUndefined: Self = StObject.set(x, "headingLevel", js.undefined)
    
    inline def setLinks(value: js.Array[LinkArea]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: LinkArea*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setRequiredIndicator(value: Boolean): Self = StObject.set(x, "requiredIndicator", value.asInstanceOf[js.Any])
    
    inline def setRequiredIndicatorUndefined: Self = StObject.set(x, "requiredIndicator", js.undefined)
    
    inline def setTextType(value: TextType): Self = StObject.set(x, "textType", value.asInstanceOf[js.Any])
    
    inline def setTextTypeUndefined: Self = StObject.set(x, "textType", js.undefined)
    
    inline def setValue(value: String | js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
