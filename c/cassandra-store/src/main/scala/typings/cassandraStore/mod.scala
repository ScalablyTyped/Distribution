package typings.cassandraStore

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.mod.Client
import typings.cassandraDriver.mod.ClientOptions
import typings.cassandraDriver.mod.EmptyCallback
import typings.expressSession.mod.SessionData
import typings.expressSession.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cassandra-store", JSImport.Namespace)
  @js.native
  class ^ protected () extends CassandraStore {
    def this(opts: CassandraStoreOptions) = this()
    def this(opts: CassandraStoreOptions, callback: EmptyCallback) = this()
  }
  
  @js.native
  trait CassandraStore extends Store {
    
    /* private */ var _client: Client = js.native
    
    /* private */ var _clientOptions: ClientOptions = js.native
    
    @JSName("all")
    def all_MCassandraStore(
      callback: js.Function2[
          /* err */ js.Any, 
          /* obj */ js.UndefOr[js.Array[SessionData] | StringDictionary[SessionData] | Null], 
          Unit
        ]
    ): Unit = js.native
    
    @JSName("clear")
    def clear_MCassandraStore(): Unit = js.native
    @JSName("clear")
    def clear_MCassandraStore(callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    def client: Client = js.native
    
    def clientOptions: ClientOptions = js.native
    def clientOptions_=(value: ClientOptions): Unit = js.native
    
    def client_=(value: Client): Unit = js.native
    
    @JSName("length")
    def length_MCassandraStore(callback: js.Function2[/* err */ js.Any, /* length */ Double, Unit]): Unit = js.native
    
    def table: String = js.native
    def table_=(value: String): Unit = js.native
    
    @JSName("touch")
    def touch_MCassandraStore(sid: String, session: SessionData): Unit = js.native
    @JSName("touch")
    def touch_MCassandraStore(sid: String, session: SessionData, callback: js.Function0[Unit]): Unit = js.native
  }
  
  trait CassandraStoreOptions extends StObject {
    
    var client: js.UndefOr[Client | Null] = js.undefined
    
    var clientOptions: ClientOptions
    
    var table: String
  }
  object CassandraStoreOptions {
    
    inline def apply(clientOptions: ClientOptions, table: String): CassandraStoreOptions = {
      val __obj = js.Dynamic.literal(clientOptions = clientOptions.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[CassandraStoreOptions]
    }
    
    extension [Self <: CassandraStoreOptions](x: Self) {
      
      inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientNull: Self = StObject.set(x, "client", null)
      
      inline def setClientOptions(value: ClientOptions): Self = StObject.set(x, "clientOptions", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
}
