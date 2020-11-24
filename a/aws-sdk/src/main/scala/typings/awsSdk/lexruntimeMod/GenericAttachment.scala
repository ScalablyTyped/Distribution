package typings.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericAttachment extends js.Object {
  
  /**
    * The URL of an attachment to the response card.
    */
  var attachmentLinkUrl: js.UndefOr[StringUrlWithLength] = js.native
  
  /**
    * The list of options to show to the user.
    */
  var buttons: js.UndefOr[listOfButtons] = js.native
  
  /**
    * The URL of an image that is displayed to the user.
    */
  var imageUrl: js.UndefOr[StringUrlWithLength] = js.native
  
  /**
    * The subtitle shown below the title.
    */
  var subTitle: js.UndefOr[StringWithLength] = js.native
  
  /**
    * The title of the option.
    */
  var title: js.UndefOr[StringWithLength] = js.native
}
object GenericAttachment {
  
  @scala.inline
  def apply(): GenericAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericAttachment]
  }
  
  @scala.inline
  implicit class GenericAttachmentOps[Self <: GenericAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttachmentLinkUrl(value: StringUrlWithLength): Self = this.set("attachmentLinkUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentLinkUrl: Self = this.set("attachmentLinkUrl", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: Button*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: listOfButtons): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setImageUrl(value: StringUrlWithLength): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setSubTitle(value: StringWithLength): Self = this.set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTitle: Self = this.set("subTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: StringWithLength): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
