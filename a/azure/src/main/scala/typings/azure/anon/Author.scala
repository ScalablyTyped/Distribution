package typings.azure.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Author extends StObject {
  
  var author: Name
  
  var category: js.Any
  
  var content: js.Any
  
  var id: String
  
  var link: js.Any
  
  var title: js.Any
  
  var updated: String
}
object Author {
  
  @scala.inline
  def apply(
    author: Name,
    category: js.Any,
    content: js.Any,
    id: String,
    link: js.Any,
    title: js.Any,
    updated: String
  ): Author = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
  
  @scala.inline
  implicit class AuthorMutableBuilder[Self <: Author] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Name): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: js.Any): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: js.Any): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: js.Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
