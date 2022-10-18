package typings.backlogJs.distTypesOptionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Group {
  
  trait GetGroupsParams extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[Order] = js.undefined
  }
  object GetGroupsParams {
    
    inline def apply(): GetGroupsParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetGroupsParams]
    }
    
    extension [Self <: GetGroupsParams](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  trait PatchGroupParams extends StObject {
    
    var members: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object PatchGroupParams {
    
    inline def apply(): PatchGroupParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatchGroupParams]
    }
    
    extension [Self <: PatchGroupParams](x: Self) {
      
      inline def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
      
      inline def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait PostGroupsParams extends StObject {
    
    var members: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: String
  }
  object PostGroupsParams {
    
    inline def apply(name: String): PostGroupsParams = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostGroupsParams]
    }
    
    extension [Self <: PostGroupsParams](x: Self) {
      
      inline def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
      
      inline def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
