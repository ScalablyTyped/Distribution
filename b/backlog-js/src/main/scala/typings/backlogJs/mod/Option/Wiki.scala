package typings.backlogJs.mod.Option

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Wiki {
  
  @js.native
  trait GetWikisHistoryParams extends StObject {
    
    var count: js.UndefOr[Double] = js.native
    
    var maxId: js.UndefOr[Double] = js.native
    
    var minId: js.UndefOr[Double] = js.native
    
    var order: js.UndefOr[Order] = js.native
  }
  object GetWikisHistoryParams {
    
    @scala.inline
    def apply(): GetWikisHistoryParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetWikisHistoryParams]
    }
    
    @scala.inline
    implicit class GetWikisHistoryParamsMutableBuilder[Self <: GetWikisHistoryParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setMaxId(value: Double): Self = StObject.set(x, "maxId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxIdUndefined: Self = StObject.set(x, "maxId", js.undefined)
      
      @scala.inline
      def setMinId(value: Double): Self = StObject.set(x, "minId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinIdUndefined: Self = StObject.set(x, "minId", js.undefined)
      
      @scala.inline
      def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  @js.native
  trait PatchWikiParams extends StObject {
    
    var content: js.UndefOr[String] = js.native
    
    var mailNotify: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
  }
  object PatchWikiParams {
    
    @scala.inline
    def apply(): PatchWikiParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatchWikiParams]
    }
    
    @scala.inline
    implicit class PatchWikiParamsMutableBuilder[Self <: PatchWikiParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setMailNotify(value: Boolean): Self = StObject.set(x, "mailNotify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMailNotifyUndefined: Self = StObject.set(x, "mailNotify", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait PostWikiParams extends StObject {
    
    var content: String = js.native
    
    var mailNotify: js.UndefOr[Boolean] = js.native
    
    var name: String = js.native
    
    var projectId: Double = js.native
  }
  object PostWikiParams {
    
    @scala.inline
    def apply(content: String, name: String, projectId: Double): PostWikiParams = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostWikiParams]
    }
    
    @scala.inline
    implicit class PostWikiParamsMutableBuilder[Self <: PostWikiParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMailNotify(value: Boolean): Self = StObject.set(x, "mailNotify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMailNotifyUndefined: Self = StObject.set(x, "mailNotify", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectId(value: Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    }
  }
}
