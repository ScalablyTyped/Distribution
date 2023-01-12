package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonProperties
  extends StObject
     with ComponentWithIconProperties {
  
  /**
    * Specifies the type of button this is. Default is Normal.
    */
  var buttonType: js.UndefOr[ButtonType] = js.undefined
  
  /**
    * Description text to display inside button element.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The content of the currently selected file
    */
  var fileContent: js.UndefOr[String] = js.undefined
  
  /**
    * The file type filter used for the file input dialog box - only used when the button type is File
    */
  var fileType: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the button opens the file browser dialog
    * @deprecated Use fileType instead
    */
  var isFile: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The label for the button
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether this is a secondary button. Default value is false.
    */
  var secondary: js.UndefOr[Boolean] = js.undefined
}
object ButtonProperties {
  
  inline def apply(): ButtonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonProperties] (val x: Self) extends AnyVal {
    
    inline def setButtonType(value: ButtonType): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    inline def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFileContent(value: String): Self = StObject.set(x, "fileContent", value.asInstanceOf[js.Any])
    
    inline def setFileContentUndefined: Self = StObject.set(x, "fileContent", js.undefined)
    
    inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    inline def setIsFile(value: Boolean): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
    
    inline def setIsFileUndefined: Self = StObject.set(x, "isFile", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
  }
}
