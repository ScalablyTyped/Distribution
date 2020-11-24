package typings.azureSb.anon

import typings.azureSb.mod.Azure.ServiceBus.DateString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Author extends js.Object {
  
  var ContentRootElement: String = js.native
  
  var author: js.UndefOr[Name] = js.native
  
  var id: String = js.native
  
  var link: String = js.native
  
  var published: DateString = js.native
  
  var title: String = js.native
  
  var updated: DateString = js.native
}
object Author {
  
  @scala.inline
  def apply(
    ContentRootElement: String,
    id: String,
    link: String,
    published: DateString,
    title: String,
    updated: DateString
  ): Author = {
    val __obj = js.Dynamic.literal(ContentRootElement = ContentRootElement.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
  
  @scala.inline
  implicit class AuthorOps[Self <: Author] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublished(value: DateString): Self = this.set("published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: DateString): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: Name): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
  }
}
