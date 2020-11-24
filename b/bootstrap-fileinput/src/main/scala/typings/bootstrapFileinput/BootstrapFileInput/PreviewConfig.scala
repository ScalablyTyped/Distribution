package typings.bootstrapFileinput.BootstrapFileInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewConfig extends js.Object {
  
  /**
    * the caption or filename to display for each initial preview item content.
    */
  var caption: String = js.native
  
  /**
    * the extra data that will be passed as data to the initial preview delete url / AJAX server call via POST.
    * This will default to deleteExtraData if not set.
    */
  var extra: js.Object | js.Function0[js.Object] = js.native
  
  /**
    * the additional frame css class to set for the file's thumbnail frame.
    */
  var frameClass: String = js.native
  
  /**
    * the key that will be passed as data to the url via AJAX POST.
    */
  var key: String | js.Object = js.native
  
  /**
    * the URL for deleting the image/ content in the initial preview via AJAX post response.This will default to deleteUrl if not set.
    */
  var url: String = js.native
  
  /**
    * the CSS width of the image/ content displayed.
    */
  var width: String = js.native
}
object PreviewConfig {
  
  @scala.inline
  def apply(
    caption: String,
    extra: js.Object | js.Function0[js.Object],
    frameClass: String,
    key: String | js.Object,
    url: String,
    width: String
  ): PreviewConfig = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], frameClass = frameClass.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewConfig]
  }
  
  @scala.inline
  implicit class PreviewConfigOps[Self <: PreviewConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraFunction0(value: () => js.Object): Self = this.set("extra", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExtra(value: js.Object | js.Function0[js.Object]): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameClass(value: String): Self = this.set("frameClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String | js.Object): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
