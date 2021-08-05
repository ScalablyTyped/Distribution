package typings.backlogJs.mod.Option

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Wiki {
  
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
    
    extension [Self <: GetWikisHistoryParams](x: Self) {
      
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
    
    extension [Self <: PatchWikiParams](x: Self) {
      
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
    
    extension [Self <: PostWikiParams](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setMailNotify(value: Boolean): Self = StObject.set(x, "mailNotify", value.asInstanceOf[js.Any])
      
      inline def setMailNotifyUndefined: Self = StObject.set(x, "mailNotify", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProjectId(value: Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    }
  }
}
