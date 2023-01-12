package typings.azureMobileApps.Azure.MobileApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Data {
  
  trait Column extends StObject {
    
    var name: String
    
    var `type`: String
  }
  object Column {
    
    inline def apply(name: String, `type`: String): Column = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Table extends StObject {
    
    def delete(query: QueryJs, version: String): Thenable[Any]
    
    def initialize(): Thenable[Unit]
    
    def insert(item: Any): Thenable[Any]
    
    def read(query: QueryJs): Thenable[js.Array[Any]]
    
    def schema(): Thenable[js.Array[Column]]
    
    def truncate(): Thenable[Unit]
    
    def undelete(query: QueryJs, version: String): Thenable[Any]
    
    def update(item: Any, query: QueryJs): Thenable[Any]
  }
  object Table {
    
    inline def apply(
      delete: (QueryJs, String) => Thenable[Any],
      initialize: () => Thenable[Unit],
      insert: Any => Thenable[Any],
      read: QueryJs => Thenable[js.Array[Any]],
      schema: () => Thenable[js.Array[Column]],
      truncate: () => Thenable[Unit],
      undelete: (QueryJs, String) => Thenable[Any],
      update: (Any, QueryJs) => Thenable[Any]
    ): Table = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction2(delete), initialize = js.Any.fromFunction0(initialize), insert = js.Any.fromFunction1(insert), read = js.Any.fromFunction1(read), schema = js.Any.fromFunction0(schema), truncate = js.Any.fromFunction0(truncate), undelete = js.Any.fromFunction2(undelete), update = js.Any.fromFunction2(update))
      __obj.asInstanceOf[Table]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
      
      inline def setDelete(value: (QueryJs, String) => Thenable[Any]): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
      
      inline def setInitialize(value: () => Thenable[Unit]): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
      
      inline def setInsert(value: Any => Thenable[Any]): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
      
      inline def setRead(value: QueryJs => Thenable[js.Array[Any]]): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setSchema(value: () => Thenable[js.Array[Column]]): Self = StObject.set(x, "schema", js.Any.fromFunction0(value))
      
      inline def setTruncate(value: () => Thenable[Unit]): Self = StObject.set(x, "truncate", js.Any.fromFunction0(value))
      
      inline def setUndelete(value: (QueryJs, String) => Thenable[Any]): Self = StObject.set(x, "undelete", js.Any.fromFunction2(value))
      
      inline def setUpdate(value: (Any, QueryJs) => Thenable[Any]): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
}
