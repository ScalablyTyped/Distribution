package typings.connectMongodbSession

import org.scalablytyped.runtime.StringDictionary
import typings.connectMongodbSession.anon.FnCall
import typings.expressSession.mod.SessionData
import typings.expressSession.mod.Store
import typings.mongodb.mod.MongoClient
import typings.mongodb.mod.MongoClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(fn: FnCall): Any = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("connect-mongodb-session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("connect-mongodb-session", "MongoDBStore")
  @js.native
  open class MongoDBStore () extends Store {
    def this(connection: MongoDBSessionOptions) = this()
    def this(connection: Unit, callback: js.Function1[/* error */ js.Error, Unit]) = this()
    def this(connection: MongoDBSessionOptions, callback: js.Function1[/* error */ js.Error, Unit]) = this()
    
    @JSName("all")
    def all_MMongoDBStore(
      callback: js.Function2[
          /* err */ Any, 
          /* obj */ js.UndefOr[js.Array[SessionData] | StringDictionary[SessionData] | Null], 
          Unit
        ]
    ): Unit = js.native
    
    @JSName("clear")
    def clear_MMongoDBStore(): Unit = js.native
    @JSName("clear")
    def clear_MMongoDBStore(callback: js.Function1[/* err */ js.UndefOr[Any], Unit]): Unit = js.native
    
    var client: MongoClient = js.native
  }
  
  trait MongoDBSessionOptions extends StObject {
    
    var collection: String
    
    var connectionOptions: js.UndefOr[MongoClientOptions] = js.undefined
    
    var databaseName: js.UndefOr[String] = js.undefined
    
    var expires: js.UndefOr[Double] = js.undefined
    
    var expiresAfterSeconds: js.UndefOr[Double] = js.undefined
    
    var expiresKey: js.UndefOr[String] = js.undefined
    
    var idField: js.UndefOr[String] = js.undefined
    
    var uri: String
  }
  object MongoDBSessionOptions {
    
    inline def apply(collection: String, uri: String): MongoDBSessionOptions = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[MongoDBSessionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MongoDBSessionOptions] (val x: Self) extends AnyVal {
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setConnectionOptions(value: MongoClientOptions): Self = StObject.set(x, "connectionOptions", value.asInstanceOf[js.Any])
      
      inline def setConnectionOptionsUndefined: Self = StObject.set(x, "connectionOptions", js.undefined)
      
      inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      inline def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresAfterSeconds(value: Double): Self = StObject.set(x, "expiresAfterSeconds", value.asInstanceOf[js.Any])
      
      inline def setExpiresAfterSecondsUndefined: Self = StObject.set(x, "expiresAfterSeconds", js.undefined)
      
      inline def setExpiresKey(value: String): Self = StObject.set(x, "expiresKey", value.asInstanceOf[js.Any])
      
      inline def setExpiresKeyUndefined: Self = StObject.set(x, "expiresKey", js.undefined)
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setIdField(value: String): Self = StObject.set(x, "idField", value.asInstanceOf[js.Any])
      
      inline def setIdFieldUndefined: Self = StObject.set(x, "idField", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
