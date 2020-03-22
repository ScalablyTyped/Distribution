package typings.azdata.mod.nb

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionManager extends js.Object {
  /**
  			 * Indicates whether the manager is ready.
  			 */
  val isReady: Boolean
  /**
  			 * A Thenable that is fulfilled when the manager is ready.
  			 */
  val ready: Thenable[Unit]
  val specs: js.UndefOr[IAllKernels] = js.undefined
  def shutdown(id: String): Thenable[Unit]
  def startNew(options: ISessionOptions): Thenable[ISession]
}

object SessionManager {
  @scala.inline
  def apply(
    isReady: Boolean,
    ready: Thenable[Unit],
    shutdown: String => Thenable[Unit],
    startNew: ISessionOptions => Thenable[ISession],
    specs: IAllKernels = null
  ): SessionManager = {
    val __obj = js.Dynamic.literal(isReady = isReady.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], shutdown = js.Any.fromFunction1(shutdown), startNew = js.Any.fromFunction1(startNew))
    if (specs != null) __obj.updateDynamic("specs")(specs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionManager]
  }
}

