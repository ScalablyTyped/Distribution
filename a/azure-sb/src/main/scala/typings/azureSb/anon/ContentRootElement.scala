package typings.azureSb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentRootElement extends js.Object {
  
  var ContentRootElement: String = js.native
}
object ContentRootElement {
  
  @scala.inline
  def apply(ContentRootElement: String): ContentRootElement = {
    val __obj = js.Dynamic.literal(ContentRootElement = ContentRootElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRootElement]
  }
  
  @scala.inline
  implicit class ContentRootElementOps[Self <: ContentRootElement] (val x: Self) extends AnyVal {
    
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
    def setContentRootElement(value: String): Self = this.set("ContentRootElement", value.asInstanceOf[js.Any])
  }
}
