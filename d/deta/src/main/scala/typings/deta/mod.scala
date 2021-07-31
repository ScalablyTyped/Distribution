package typings.deta

import org.scalablytyped.runtime.StringDictionary
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("deta", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Deta(projectKey: String): DetaInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("Deta")(projectKey.asInstanceOf[js.Any]).asInstanceOf[DetaInstance]
  @scala.inline
  def Deta(projectKey: String, host: String): DetaInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("Deta")(projectKey.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[DetaInstance]
  
  @js.native
  trait DetaBase extends StObject {
    
    def delete(key: String): js.Promise[Unit] = js.native
    
    def fetch(): js.Promise[AsyncIterable[js.Array[Serializable]]] = js.native
    def fetch(query: Unit, limit: Double): js.Promise[AsyncIterable[js.Array[Serializable]]] = js.native
    def fetch(query: Unit, limit: Double, buffer: Double): js.Promise[AsyncIterable[js.Array[Serializable]]] = js.native
    def fetch(query: Unit, limit: Unit, buffer: Double): js.Promise[AsyncIterable[js.Array[Serializable]]] = js.native
    def fetch(query: DetaBaseQuery): js.Promise[AsyncIterable[js.Array[Serializable]]] = js.native
    def fetch(query: DetaBaseQuery, limit: Double): js.Promise[AsyncIterable[js.Array[Serializable]]] = js.native
    def fetch(query: DetaBaseQuery, limit: Double, buffer: Double): js.Promise[AsyncIterable[js.Array[Serializable]]] = js.native
    def fetch(query: DetaBaseQuery, limit: Unit, buffer: Double): js.Promise[AsyncIterable[js.Array[Serializable]]] = js.native
    
    def get(key: String): js.Promise[Serializable | Null] = js.native
    
    def insert[Data](data: Data, key: String): js.Promise[Data] = js.native
    
    def put[Data](data: Data): js.Promise[Data] = js.native
    def put[Data](data: Data, key: String): js.Promise[Data] = js.native
    
    def putMany[Items](items: Items): js.Promise[Items] = js.native
    
    def update(updates: DetaBaseUpdates, key: String): js.Promise[Unit] = js.native
    
    var util: DetaBaseUtil = js.native
  }
  
  trait DetaBaseQuery
    extends StObject
       with /* key */ StringDictionary[String | Double | Boolean | DetaBaseQuery]
  object DetaBaseQuery {
    
    @scala.inline
    def apply(): DetaBaseQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetaBaseQuery]
    }
  }
  
  type DetaBaseUpdates = StringDictionary[Serializable | js.Object]
  
  @js.native
  trait DetaBaseUtil extends StObject {
    
    def append(value: Serializable): js.Object = js.native
    
    def increment(): js.Object = js.native
    def increment(amount: Double): js.Object = js.native
    
    def prepend(value: Serializable): js.Object = js.native
    
    def trim(): js.Object = js.native
  }
  
  trait DetaInstance extends StObject {
    
    def Base(db: String): DetaBase
  }
  object DetaInstance {
    
    @scala.inline
    def apply(Base: String => DetaBase): DetaInstance = {
      val __obj = js.Dynamic.literal(Base = js.Any.fromFunction1(Base))
      __obj.asInstanceOf[DetaInstance]
    }
    
    @scala.inline
    implicit class DetaInstanceMutableBuilder[Self <: DetaInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String => DetaBase): Self = StObject.set(x, "Base", js.Any.fromFunction1(value))
    }
  }
  
  type Serializable = StringDictionary[js.Any] | String | Double | Boolean | js.Array[js.Any]
}
