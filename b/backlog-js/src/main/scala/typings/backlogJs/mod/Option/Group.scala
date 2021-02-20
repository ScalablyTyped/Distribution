package typings.backlogJs.mod.Option

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Group {
  
  @js.native
  trait GetGroupsParams extends StObject {
    
    var count: js.UndefOr[Double] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var order: js.UndefOr[Order] = js.native
  }
  object GetGroupsParams {
    
    @scala.inline
    def apply(): GetGroupsParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetGroupsParams]
    }
    
    @scala.inline
    implicit class GetGroupsParamsMutableBuilder[Self <: GetGroupsParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  @js.native
  trait PatchGroupParams extends StObject {
    
    var members: js.UndefOr[js.Array[String]] = js.native
    
    var name: js.UndefOr[String] = js.native
  }
  object PatchGroupParams {
    
    @scala.inline
    def apply(): PatchGroupParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatchGroupParams]
    }
    
    @scala.inline
    implicit class PatchGroupParamsMutableBuilder[Self <: PatchGroupParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
      
      @scala.inline
      def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait PostGroupsParams extends StObject {
    
    var members: js.UndefOr[js.Array[String]] = js.native
    
    var name: String = js.native
  }
  object PostGroupsParams {
    
    @scala.inline
    def apply(name: String): PostGroupsParams = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostGroupsParams]
    }
    
    @scala.inline
    implicit class PostGroupsParamsMutableBuilder[Self <: PostGroupsParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
      
      @scala.inline
      def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
