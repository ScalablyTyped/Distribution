package typings.azdata.mod.nb

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionManager extends js.Object {
  /**
    * Indicates whether the manager is ready.
    */
  val isReady: Boolean = js.native
  /**
    * A Thenable that is fulfilled when the manager is ready.
    */
  val ready: Thenable[Unit] = js.native
  val specs: js.UndefOr[IAllKernels] = js.native
  def shutdown(id: String): Thenable[Unit] = js.native
  def startNew(options: ISessionOptions): Thenable[ISession] = js.native
}

object SessionManager {
  @scala.inline
  def apply(
    isReady: Boolean,
    ready: Thenable[Unit],
    shutdown: String => Thenable[Unit],
    startNew: ISessionOptions => Thenable[ISession]
  ): SessionManager = {
    val __obj = js.Dynamic.literal(isReady = isReady.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], shutdown = js.Any.fromFunction1(shutdown), startNew = js.Any.fromFunction1(startNew))
    __obj.asInstanceOf[SessionManager]
  }
  @scala.inline
  implicit class SessionManagerOps[Self <: SessionManager] (val x: Self) extends AnyVal {
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
    def setIsReady(value: Boolean): Self = this.set("isReady", value.asInstanceOf[js.Any])
    @scala.inline
    def setReady(value: Thenable[Unit]): Self = this.set("ready", value.asInstanceOf[js.Any])
    @scala.inline
    def setShutdown(value: String => Thenable[Unit]): Self = this.set("shutdown", js.Any.fromFunction1(value))
    @scala.inline
    def setStartNew(value: ISessionOptions => Thenable[ISession]): Self = this.set("startNew", js.Any.fromFunction1(value))
    @scala.inline
    def setSpecs(value: IAllKernels): Self = this.set("specs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecs: Self = this.set("specs", js.undefined)
  }
  
}

