package typings.awsSdk.lexruntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericAttachment extends StObject {
  
  /**
    * The URL of an attachment to the response card.
    */
  var attachmentLinkUrl: js.UndefOr[StringUrlWithLength] = js.undefined
  
  /**
    * The list of options to show to the user.
    */
  var buttons: js.UndefOr[listOfButtons] = js.undefined
  
  /**
    * The URL of an image that is displayed to the user.
    */
  var imageUrl: js.UndefOr[StringUrlWithLength] = js.undefined
  
  /**
    * The subtitle shown below the title.
    */
  var subTitle: js.UndefOr[StringWithLength] = js.undefined
  
  /**
    * The title of the option.
    */
  var title: js.UndefOr[StringWithLength] = js.undefined
}
object GenericAttachment {
  
  @scala.inline
  def apply(): GenericAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericAttachment]
  }
  
  @scala.inline
  implicit class GenericAttachmentMutableBuilder[Self <: GenericAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentLinkUrl(value: StringUrlWithLength): Self = StObject.set(x, "attachmentLinkUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentLinkUrlUndefined: Self = StObject.set(x, "attachmentLinkUrl", js.undefined)
    
    @scala.inline
    def setButtons(value: listOfButtons): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: Button*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setImageUrl(value: StringUrlWithLength): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setSubTitle(value: StringWithLength): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: StringWithLength): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
