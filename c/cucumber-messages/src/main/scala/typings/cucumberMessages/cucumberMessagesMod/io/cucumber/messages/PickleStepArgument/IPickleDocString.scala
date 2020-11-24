package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PickleDocString. */
@js.native
trait IPickleDocString extends js.Object {
  
  /** PickleDocString content */
  var content: js.UndefOr[String | Null] = js.native
  
  /** PickleDocString contentType */
  var contentType: js.UndefOr[String | Null] = js.native
}
object IPickleDocString {
  
  @scala.inline
  def apply(): IPickleDocString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPickleDocString]
  }
  
  @scala.inline
  implicit class IPickleDocStringOps[Self <: IPickleDocString] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setContentTypeNull: Self = this.set("contentType", null)
  }
}
