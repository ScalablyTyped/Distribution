package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteManager extends StObject {
  
  /**
    * (Optional) ServerManager to handle server lifetime management operations.
    * Depending on the implementation this may not be needed.
    */
  val serverManager: js.UndefOr[ServerManager] = js.undefined
  
  /**
    * A SessionManager that handles starting, stopping and handling notifications around sessions.
    * Each notebook has 1 session associated with it, and the session is responsible
    * for kernel management
    */
  val sessionManager: SessionManager
}
object ExecuteManager {
  
  inline def apply(sessionManager: SessionManager): ExecuteManager = {
    val __obj = js.Dynamic.literal(sessionManager = sessionManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteManager]
  }
  
  extension [Self <: ExecuteManager](x: Self) {
    
    inline def setServerManager(value: ServerManager): Self = StObject.set(x, "serverManager", value.asInstanceOf[js.Any])
    
    inline def setServerManagerUndefined: Self = StObject.set(x, "serverManager", js.undefined)
    
    inline def setSessionManager(value: SessionManager): Self = StObject.set(x, "sessionManager", value.asInstanceOf[js.Any])
  }
}
