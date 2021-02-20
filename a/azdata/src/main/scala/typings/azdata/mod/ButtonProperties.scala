package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonProperties
  extends ComponentProperties
     with ComponentWithIcon {
  
  /**
    * The content of the currently selected file
    */
  var fileContent: js.UndefOr[String] = js.native
  
  /**
    * Whether the button opens the file browser dialog
    */
  var isFile: js.UndefOr[Boolean] = js.native
  
  /**
    * The label for the button
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * @deprecated This will be moved to `ComponentWithIconProperties`
    *
    * The title for the button. This title will show when hovered over
    */
  var title: js.UndefOr[String] = js.native
}
object ButtonProperties {
  
  @scala.inline
  def apply(): ButtonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProperties]
  }
  
  @scala.inline
  implicit class ButtonPropertiesMutableBuilder[Self <: ButtonProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileContent(value: String): Self = StObject.set(x, "fileContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileContentUndefined: Self = StObject.set(x, "fileContent", js.undefined)
    
    @scala.inline
    def setIsFile(value: Boolean): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFileUndefined: Self = StObject.set(x, "isFile", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
