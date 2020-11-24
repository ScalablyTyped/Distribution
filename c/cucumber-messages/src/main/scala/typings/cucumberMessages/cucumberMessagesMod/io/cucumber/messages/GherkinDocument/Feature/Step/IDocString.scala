package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ILocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DocString. */
@js.native
trait IDocString extends js.Object {
  
  /** DocString content */
  var content: js.UndefOr[String | Null] = js.native
  
  /** DocString contentType */
  var contentType: js.UndefOr[String | Null] = js.native
  
  /** DocString delimiter */
  var delimiter: js.UndefOr[String | Null] = js.native
  
  /** DocString location */
  var location: js.UndefOr[ILocation | Null] = js.native
}
object IDocString {
  
  @scala.inline
  def apply(): IDocString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocString]
  }
  
  @scala.inline
  implicit class IDocStringOps[Self <: IDocString] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setDelimiterNull: Self = this.set("delimiter", null)
    
    @scala.inline
    def setLocation(value: ILocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLocationNull: Self = this.set("location", null)
  }
}
