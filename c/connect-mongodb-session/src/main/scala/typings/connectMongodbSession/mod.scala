package typings.connectMongodbSession

import typings.connectMongodbSession.mod.connectMongodbSession.MongoDBStore
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressSession.mod.SessionOptions
import typings.expressSession.mod.Store
import typings.mongodb.mod.MongoClient
import typings.mongodb.mod.MongoClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    fn: js.Function1[
      /* options */ js.UndefOr[SessionOptions], 
      RequestHandler[ParamsDictionary, js.Any, js.Any, Query]
    ]
  ): MongoDBStore = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[MongoDBStore]
  
  @JSImport("connect-mongodb-session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object connectMongodbSession {
    
    trait ConnectionInfo extends StObject {
      
      var collection: String
      
      var connectionOptions: js.UndefOr[MongoClientOptions] = js.undefined
      
      var databaseName: js.UndefOr[String] = js.undefined
      
      var expires: js.UndefOr[Double] = js.undefined
      
      var idField: js.UndefOr[String] = js.undefined
      
      var uri: String
    }
    object ConnectionInfo {
      
      inline def apply(collection: String, uri: String): ConnectionInfo = {
        val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
        __obj.asInstanceOf[ConnectionInfo]
      }
      
      extension [Self <: ConnectionInfo](x: Self) {
        
        inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
        
        inline def setConnectionOptions(value: MongoClientOptions): Self = StObject.set(x, "connectionOptions", value.asInstanceOf[js.Any])
        
        inline def setConnectionOptionsUndefined: Self = StObject.set(x, "connectionOptions", js.undefined)
        
        inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
        
        inline def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
        
        inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
        
        inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
        
        inline def setIdField(value: String): Self = StObject.set(x, "idField", value.asInstanceOf[js.Any])
        
        inline def setIdFieldUndefined: Self = StObject.set(x, "idField", js.undefined)
        
        inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      }
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - scala.Any because Inheritance from two classes. Inlined 
    - scala.AnyRef because Inheritance from two classes. Inlined 
    - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
    - js.Any because Inheritance from two classes. Inlined 
    - scala.AnyRef because Inheritance from two classes. Inlined 
    - js.Object because Inheritance from two classes. Inlined 
    - js.Any because Inheritance from two classes. Inlined 
    - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
    - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
    - org.scalablytyped.runtime.Instantiable2 because Inheritance from two classes. Inlined 
    - org.scalablytyped.runtime.Instantiable1 because Inheritance from two classes. Inlined 
    - org.scalablytyped.runtime.Instantiable0 because Inheritance from two classes. Inlined  */ @js.native
    trait MongoDBStore extends Store {
      
      var client: MongoClient = js.native
    }
  }
}
