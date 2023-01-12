package typings.backlogJs.distTypesOptionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Wiki {
  
  trait GetWikiParams extends StObject {
    
    var keyword: js.UndefOr[String] = js.undefined
    
    var projectIdOrKey: String | Double
  }
  object GetWikiParams {
    
    inline def apply(projectIdOrKey: String | Double): GetWikiParams = {
      val __obj = js.Dynamic.literal(projectIdOrKey = projectIdOrKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetWikiParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetWikiParams] (val x: Self) extends AnyVal {
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
      
      inline def setProjectIdOrKey(value: String | Double): Self = StObject.set(x, "projectIdOrKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetWikisHistoryParams extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var maxId: js.UndefOr[Double] = js.undefined
    
    var minId: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[Order] = js.undefined
  }
  object GetWikisHistoryParams {
    
    inline def apply(): GetWikisHistoryParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetWikisHistoryParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetWikisHistoryParams] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setMaxId(value: Double): Self = StObject.set(x, "maxId", value.asInstanceOf[js.Any])
      
      inline def setMaxIdUndefined: Self = StObject.set(x, "maxId", js.undefined)
      
      inline def setMinId(value: Double): Self = StObject.set(x, "minId", value.asInstanceOf[js.Any])
      
      inline def setMinIdUndefined: Self = StObject.set(x, "minId", js.undefined)
      
      inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  trait PatchWikiParams extends StObject {
    
    var content: js.UndefOr[String] = js.undefined
    
    var mailNotify: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object PatchWikiParams {
    
    inline def apply(): PatchWikiParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatchWikiParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PatchWikiParams] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setMailNotify(value: Boolean): Self = StObject.set(x, "mailNotify", value.asInstanceOf[js.Any])
      
      inline def setMailNotifyUndefined: Self = StObject.set(x, "mailNotify", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait PostWikiParams extends StObject {
    
    var content: String
    
    var mailNotify: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var projectId: Double
  }
  object PostWikiParams {
    
    inline def apply(content: String, name: String, projectId: Double): PostWikiParams = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostWikiParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PostWikiParams] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setMailNotify(value: Boolean): Self = StObject.set(x, "mailNotify", value.asInstanceOf[js.Any])
      
      inline def setMailNotifyUndefined: Self = StObject.set(x, "mailNotify", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProjectId(value: Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    }
  }
}
