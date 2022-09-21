package typings.blocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BaseUrl extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var create: js.UndefOr[Url] = js.undefined
    
    var destroy: js.UndefOr[Url] = js.undefined
    
    var idAttr: js.UndefOr[String] = js.undefined
    
    var read: js.UndefOr[Url] = js.undefined
    
    var update: js.UndefOr[Url] = js.undefined
  }
  object BaseUrl {
    
    inline def apply(): BaseUrl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseUrl]
    }
    
    extension [Self <: BaseUrl](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setCreate(value: Url): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setDestroy(value: Url): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setIdAttr(value: String): Self = StObject.set(x, "idAttr", value.asInstanceOf[js.Any])
      
      inline def setIdAttrUndefined: Self = StObject.set(x, "idAttr", js.undefined)
      
      inline def setRead(value: Url): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setUpdate(value: Url): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  trait Create extends StObject {
    
    var create: js.UndefOr[Url] = js.undefined
    
    var destroy: js.UndefOr[Url] = js.undefined
    
    var read: js.UndefOr[Url] = js.undefined
    
    var update: js.UndefOr[Url] = js.undefined
  }
  object Create {
    
    inline def apply(): Create = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Create]
    }
    
    extension [Self <: Create](x: Self) {
      
      inline def setCreate(value: Url): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setDestroy(value: Url): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setRead(value: Url): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setUpdate(value: Url): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  trait Express extends StObject {
    
    def express(): Any
  }
  object Express {
    
    inline def apply(express: () => Any): Express = {
      val __obj = js.Dynamic.literal(express = js.Any.fromFunction0(express))
      __obj.asInstanceOf[Express]
    }
    
    extension [Self <: Express](x: Self) {
      
      inline def setExpress(value: () => Any): Self = StObject.set(x, "express", js.Any.fromFunction0(value))
    }
  }
  
  trait History extends StObject {
    
    var history: String
  }
  object History {
    
    inline def apply(history: String): History = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
      __obj.asInstanceOf[History]
    }
    
    extension [Self <: History](x: Self) {
      
      inline def setHistory(value: String): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    }
  }
  
  trait Route extends StObject {
    
    var route: js.UndefOr[Any] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Route {
    
    inline def apply(): Route = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Route]
    }
    
    extension [Self <: Route](x: Self) {
      
      inline def setRoute(value: Any): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Url extends StObject {
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Url {
    
    inline def apply(): Url = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
