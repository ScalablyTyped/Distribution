package typings.blocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BaseUrl extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var create: js.UndefOr[Url] = js.native
    
    var destroy: js.UndefOr[Url] = js.native
    
    var idAttr: js.UndefOr[String] = js.native
    
    var read: js.UndefOr[Url] = js.native
    
    var update: js.UndefOr[Url] = js.native
  }
  object BaseUrl {
    
    @scala.inline
    def apply(): BaseUrl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseUrl]
    }
    
    @scala.inline
    implicit class BaseUrlMutableBuilder[Self <: BaseUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setCreate(value: Url): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setDestroy(value: Url): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setIdAttr(value: String): Self = StObject.set(x, "idAttr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdAttrUndefined: Self = StObject.set(x, "idAttr", js.undefined)
      
      @scala.inline
      def setRead(value: Url): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setUpdate(value: Url): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  @js.native
  trait Create extends StObject {
    
    var create: js.UndefOr[Url] = js.native
    
    var destroy: js.UndefOr[Url] = js.native
    
    var read: js.UndefOr[Url] = js.native
    
    var update: js.UndefOr[Url] = js.native
  }
  object Create {
    
    @scala.inline
    def apply(): Create = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Create]
    }
    
    @scala.inline
    implicit class CreateMutableBuilder[Self <: Create] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: Url): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setDestroy(value: Url): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setRead(value: Url): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setUpdate(value: Url): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  @js.native
  trait Express extends StObject {
    
    def express(): js.Any = js.native
  }
  object Express {
    
    @scala.inline
    def apply(express: () => js.Any): Express = {
      val __obj = js.Dynamic.literal(express = js.Any.fromFunction0(express))
      __obj.asInstanceOf[Express]
    }
    
    @scala.inline
    implicit class ExpressMutableBuilder[Self <: Express] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpress(value: () => js.Any): Self = StObject.set(x, "express", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait History extends StObject {
    
    var history: String = js.native
  }
  object History {
    
    @scala.inline
    def apply(history: String): History = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
      __obj.asInstanceOf[History]
    }
    
    @scala.inline
    implicit class HistoryMutableBuilder[Self <: History] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHistory(value: String): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Route extends StObject {
    
    var route: js.UndefOr[js.Any] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Route {
    
    @scala.inline
    def apply(): Route = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Route]
    }
    
    @scala.inline
    implicit class RouteMutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoute(value: js.Any): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Url extends StObject {
    
    var url: js.UndefOr[String] = js.native
  }
  object Url {
    
    @scala.inline
    def apply(): Url = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
