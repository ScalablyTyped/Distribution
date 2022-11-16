package typings.deta

import org.scalablytyped.runtime.StringDictionary
import typings.deta.anon.Items
import typings.deta.distTypesTypesActionMod.Action
import typings.deta.distTypesTypesBasicMod.ArrayType
import typings.deta.distTypesTypesBasicMod.BasicType
import typings.deta.distTypesTypesBasicMod.NullType
import typings.deta.distTypesTypesBasicMod.ObjectType
import typings.deta.distTypesTypesBasicMod.UndefinedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesBaseResponseMod {
  
  type DeleteResponse = NullType
  
  trait FetchResponse extends StObject {
    
    var count: Double
    
    var items: js.Array[ObjectType]
    
    var last: js.UndefOr[String] = js.undefined
  }
  object FetchResponse {
    
    inline def apply(count: Double, items: js.Array[ObjectType]): FetchResponse = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchResponse]
    }
    
    extension [Self <: FetchResponse](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[ObjectType]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: ObjectType*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    }
  }
  
  type GetResponse = ObjectType | NullType
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type InsertResponse = deta.deta/dist/types/types/basic.ObjectType
  }}}
  to avoid circular code involving: 
  - deta.deta/dist/types/types/base/response.InsertResponse
  - deta.deta/dist/types/types/basic.ArrayType
  - deta.deta/dist/types/types/basic.ObjectType
  */
  trait InsertResponse
    extends StObject
       with /* key */ StringDictionary[ObjectType | ArrayType | BasicType | NullType | UndefinedType | Action]
  object InsertResponse {
    
    inline def apply(): InsertResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InsertResponse]
    }
  }
  
  trait PutManyResponse extends StObject {
    
    var processed: Items
  }
  object PutManyResponse {
    
    inline def apply(processed: Items): PutManyResponse = {
      val __obj = js.Dynamic.literal(processed = processed.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutManyResponse]
    }
    
    extension [Self <: PutManyResponse](x: Self) {
      
      inline def setProcessed(value: Items): Self = StObject.set(x, "processed", value.asInstanceOf[js.Any])
    }
  }
  
  type PutResponse = ObjectType | NullType
  
  type UpdateResponse = NullType
}
