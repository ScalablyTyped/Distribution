package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlNode
  extends ValueNodeType
     with BaseNode {
  
  var innerSpacingAfter: js.UndefOr[String] = js.native
  
  var innerSpacingBefore: js.UndefOr[String] = js.native
  
  var stringType: js.UndefOr[String] = js.native
  
  var `type`: url = js.native
  
  var url: String = js.native
}
object UrlNode {
  
  @scala.inline
  def apply(`type`: url, url: String): UrlNode = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlNode]
  }
  
  @scala.inline
  implicit class UrlNodeOps[Self <: UrlNode] (val x: Self) extends AnyVal {
    
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
    def setType(value: url): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerSpacingAfter(value: String): Self = this.set("innerSpacingAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerSpacingAfter: Self = this.set("innerSpacingAfter", js.undefined)
    
    @scala.inline
    def setInnerSpacingBefore(value: String): Self = this.set("innerSpacingBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerSpacingBefore: Self = this.set("innerSpacingBefore", js.undefined)
    
    @scala.inline
    def setStringType(value: String): Self = this.set("stringType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringType: Self = this.set("stringType", js.undefined)
  }
}
