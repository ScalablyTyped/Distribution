package typings.baseui.fileUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleProps extends js.Object {
  
  @JSName("$afterFileDrop")
  var $afterFileDrop: Boolean = js.native
  
  @JSName("$isDisabled")
  var $isDisabled: Boolean = js.native
  
  @JSName("$isDragAccept")
  var $isDragAccept: Boolean = js.native
  
  @JSName("$isDragActive")
  var $isDragActive: Boolean = js.native
  
  @JSName("$isDragReject")
  var $isDragReject: Boolean = js.native
  
  @JSName("$isFocused")
  var $isFocused: Boolean = js.native
}
object StyleProps {
  
  @scala.inline
  def apply(
    $afterFileDrop: Boolean,
    $isDisabled: Boolean,
    $isDragAccept: Boolean,
    $isDragActive: Boolean,
    $isDragReject: Boolean,
    $isFocused: Boolean
  ): StyleProps = {
    val __obj = js.Dynamic.literal($afterFileDrop = $afterFileDrop.asInstanceOf[js.Any], $isDisabled = $isDisabled.asInstanceOf[js.Any], $isDragAccept = $isDragAccept.asInstanceOf[js.Any], $isDragActive = $isDragActive.asInstanceOf[js.Any], $isDragReject = $isDragReject.asInstanceOf[js.Any], $isFocused = $isFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleProps]
  }
  
  @scala.inline
  implicit class StylePropsOps[Self <: StyleProps] (val x: Self) extends AnyVal {
    
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
    def set$afterFileDrop(value: Boolean): Self = this.set("$afterFileDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isDisabled(value: Boolean): Self = this.set("$isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isDragAccept(value: Boolean): Self = this.set("$isDragAccept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isDragActive(value: Boolean): Self = this.set("$isDragActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isDragReject(value: Boolean): Self = this.set("$isDragReject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isFocused(value: Boolean): Self = this.set("$isFocused", value.asInstanceOf[js.Any])
  }
}
