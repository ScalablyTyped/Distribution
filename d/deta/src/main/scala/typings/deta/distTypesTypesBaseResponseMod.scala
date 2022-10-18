package typings.deta

import typings.deta.anon.Items
import typings.deta.distTypesTypesBasicMod.NullType
import typings.deta.distTypesTypesBasicMod.ObjectType
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
  
  trait InsertResponse
    extends StObject
       with ObjectType
  
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
