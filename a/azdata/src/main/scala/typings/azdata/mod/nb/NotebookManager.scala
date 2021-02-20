package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookManager extends StObject {
  
  /**
    * Manages reading and writing contents to/from files.
    * Files may be local or remote, with this manager giving them a chance to convert and migrate
    * from specific notebook file types to and from a standard type for this UI
    */
  val contentManager: ContentManager = js.native
  
  /**
    * (Optional) ServerManager to handle server lifetime management operations.
    * Depending on the implementation this may not be needed.
    */
  val serverManager: js.UndefOr[ServerManager] = js.native
  
  /**
    * A SessionManager that handles starting, stopping and handling notifications around sessions.
    * Each notebook has 1 session associated with it, and the session is responsible
    * for kernel management
    */
  val sessionManager: SessionManager = js.native
}
object NotebookManager {
  
  @scala.inline
  def apply(contentManager: ContentManager, sessionManager: SessionManager): NotebookManager = {
    val __obj = js.Dynamic.literal(contentManager = contentManager.asInstanceOf[js.Any], sessionManager = sessionManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookManager]
  }
  
  @scala.inline
  implicit class NotebookManagerMutableBuilder[Self <: NotebookManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentManager(value: ContentManager): Self = StObject.set(x, "contentManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerManager(value: ServerManager): Self = StObject.set(x, "serverManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerManagerUndefined: Self = StObject.set(x, "serverManager", js.undefined)
    
    @scala.inline
    def setSessionManager(value: SessionManager): Self = StObject.set(x, "sessionManager", value.asInstanceOf[js.Any])
  }
}
