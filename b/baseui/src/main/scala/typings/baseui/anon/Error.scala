package typings.baseui.anon

import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.search
import typings.baseui.baseuiStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends js.Object {
  
  @JSName("$error")
  var $error: Boolean = js.native
  
  @JSName("$isLoading")
  var $isLoading: Boolean = js.native
  
  @JSName("$multi")
  var $multi: Boolean = js.native
  
  @JSName("$required")
  var $required: Boolean = js.native
  
  @JSName("$searchable")
  var $searchable: Boolean = js.native
  
  @JSName("$size")
  var $size: mini | default_ | compact | large_ = js.native
  
  @JSName("$type")
  var $type: select | search = js.native
  
  @JSName("$width")
  var $width: Double = js.native
}
object Error {
  
  @scala.inline
  def apply(
    $error: Boolean,
    $isLoading: Boolean,
    $multi: Boolean,
    $required: Boolean,
    $searchable: Boolean,
    $size: mini | default_ | compact | large_,
    $type: select | search,
    $width: Double
  ): Error = {
    val __obj = js.Dynamic.literal($error = $error.asInstanceOf[js.Any], $isLoading = $isLoading.asInstanceOf[js.Any], $multi = $multi.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $searchable = $searchable.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], $width = $width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    
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
    def set$error(value: Boolean): Self = this.set("$error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isLoading(value: Boolean): Self = this.set("$isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$multi(value: Boolean): Self = this.set("$multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$required(value: Boolean): Self = this.set("$required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$searchable(value: Boolean): Self = this.set("$searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$size(value: mini | default_ | compact | large_): Self = this.set("$size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$type(value: select | search): Self = this.set("$type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$width(value: Double): Self = this.set("$width", value.asInstanceOf[js.Any])
  }
}
