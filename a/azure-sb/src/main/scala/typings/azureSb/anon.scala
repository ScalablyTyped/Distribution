package typings.azureSb

import typings.azureSb.mod.Azure.ServiceBus.DateString
import typings.azureSb.mod.Azure.ServiceBus.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Author extends StObject {
    
    var ContentRootElement: String
    
    var author: js.UndefOr[Name] = js.undefined
    
    var id: String
    
    var link: String
    
    var published: DateString
    
    var title: String
    
    var updated: DateString
  }
  object Author {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: Author] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: Name): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setContentRootElement(value: String): Self = StObject.set(x, "ContentRootElement", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setPublished(value: DateString): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: DateString): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  trait Body extends StObject {
    
    var body: String
    
    var expiry: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[Any] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Body {
    
    inline def apply(body: String): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setExpiry(value: String): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
      
      inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait Code extends StObject {
    
    var Code: String
    
    var Detail: String
  }
  object Code {
    
    inline def apply(Code: String, Detail: String): Code = {
      val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Detail = Detail.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
      
      inline def setDetail(value: String): Self = StObject.set(x, "Detail", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentRootElement extends StObject {
    
    var ContentRootElement: String
  }
  object ContentRootElement {
    
    inline def apply(ContentRootElement: String): ContentRootElement = {
      val __obj = js.Dynamic.literal(ContentRootElement = ContentRootElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentRootElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentRootElement] (val x: Self) extends AnyVal {
      
      inline def setContentRootElement(value: String): Self = StObject.set(x, "ContentRootElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var Error: Code
  }
  object Error {
    
    inline def apply(Error: Code): Error = {
      val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setError(value: Code): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    }
  }
  
  trait Etag extends StObject {
    
    var etag: Any
  }
  object Etag {
    
    inline def apply(etag: Any): Etag = {
      val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Etag]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Etag] (val x: Self) extends AnyVal {
      
      inline def setEtag(value: Any): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Headers extends StObject {
    
    var headers: Dictionary[String]
  }
  object Headers {
    
    inline def apply(headers: Dictionary[String]): Headers = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: Dictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeadersObject extends StObject {
    
    var headers: js.Object
  }
  object HeadersObject {
    
    inline def apply(headers: js.Object): HeadersObject = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeadersObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeadersObject] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
  }
  object Id {
    
    inline def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PushChannel extends StObject {
    
    var pushChannel: String
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
    
    var templates: js.UndefOr[Any] = js.undefined
  }
  object PushChannel {
    
    inline def apply(pushChannel: String): PushChannel = {
      val __obj = js.Dynamic.literal(pushChannel = pushChannel.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushChannel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PushChannel] (val x: Self) extends AnyVal {
      
      inline def setPushChannel(value: String): Self = StObject.set(x, "pushChannel", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setTemplates(value: Any): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
      
      inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    }
  }
  
  trait SignRequest extends StObject {
    
    def signRequest(webResource: Any, callback: js.Function0[Unit]): Unit
  }
  object SignRequest {
    
    inline def apply(signRequest: (Any, js.Function0[Unit]) => Unit): SignRequest = {
      val __obj = js.Dynamic.literal(signRequest = js.Any.fromFunction2(signRequest))
      __obj.asInstanceOf[SignRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignRequest] (val x: Self) extends AnyVal {
      
      inline def setSignRequest(value: (Any, js.Function0[Unit]) => Unit): Self = StObject.set(x, "signRequest", js.Any.fromFunction2(value))
    }
  }
  
  trait _empty extends StObject {
    
    @JSName("_")
    var _underscore: Id
  }
  object _empty {
    
    inline def apply(_underscore: Id): _empty = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[_empty]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
      
      inline def set_underscore(value: Id): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
    }
  }
}
