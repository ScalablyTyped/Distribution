package typings.connectSqlite3

import org.scalablytyped.runtime.Instantiable0
import typings.connectSqlite3.mod.connect.ConnectParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Session
    extends StObject
       with ConnectParams {
    
    var session: Store
  }
  object Session {
    
    inline def apply(session: Store): Session = {
      val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
      __obj.asInstanceOf[Session]
    }
    
    extension [Self <: Session](x: Self) {
      
      inline def setSession(value: Store): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    }
  }
  
  trait Store
    extends StObject
       with ConnectParams {
    
    var Store: Instantiable0[typings.connectSqlite3.mod.connect.Store]
  }
  object Store {
    
    inline def apply(Store: Instantiable0[typings.connectSqlite3.mod.connect.Store]): Store = {
      val __obj = js.Dynamic.literal(Store = Store.asInstanceOf[js.Any])
      __obj.asInstanceOf[Store]
    }
    
    extension [Self <: Store](x: Self) {
      
      inline def setStore(value: Instantiable0[typings.connectSqlite3.mod.connect.Store]): Self = StObject.set(x, "Store", value.asInstanceOf[js.Any])
    }
  }
}
