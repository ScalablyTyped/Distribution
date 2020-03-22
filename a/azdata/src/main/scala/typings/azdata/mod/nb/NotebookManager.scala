package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotebookManager extends js.Object {
  /**
  			 * Manages reading and writing contents to/from files.
  			 * Files may be local or remote, with this manager giving them a chance to convert and migrate
  			 * from specific notebook file types to and from a standard type for this UI
  			 */
  val contentManager: ContentManager
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

object NotebookManager {
  @scala.inline
  def apply(
    contentManager: ContentManager,
    sessionManager: SessionManager,
    serverManager: ServerManager = null
  ): NotebookManager = {
    val __obj = js.Dynamic.literal(contentManager = contentManager.asInstanceOf[js.Any], sessionManager = sessionManager.asInstanceOf[js.Any])
    if (serverManager != null) __obj.updateDynamic("serverManager")(serverManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookManager]
  }
}

