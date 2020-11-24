package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookManager extends js.Object {
  
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
  implicit class NotebookManagerOps[Self <: NotebookManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentManager(value: ContentManager): Self = this.set("contentManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionManager(value: SessionManager): Self = this.set("sessionManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerManager(value: ServerManager): Self = this.set("serverManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerManager: Self = this.set("serverManager", js.undefined)
  }
}
