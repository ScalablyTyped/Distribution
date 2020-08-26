package typings.azdata.mod.nb

import typings.azdata.mod.IConnectionProfile
import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISession extends js.Object {
  /**
    * Is change of kernels supported for this session?
    */
  var canChangeKernels: Boolean = js.native
  /**
    * Tracks whether the default kernel failed to load
    * This could be for a reason such as the kernel name not being recognized as a valid kernel;
    */
  var defaultKernelLoaded: js.UndefOr[Boolean] = js.native
  /*
    * Unique id of the session.
    */
  val id: String = js.native
  /**
    * The kernel.
    *
    * #### Notes
    * This is a read-only property, and can be altered by [changeKernel].
    */
  val kernel: IKernel = js.native
  /**
    * The current name associated with the session.
    */
  val name: String = js.native
  /**
    * The current path associated with the session.
    */
  val path: String = js.native
  /**
    * The status indicates if the kernel is healthy, dead, starting, etc.
    */
  val status: KernelStatus = js.native
  /**
    * The type of the session.
    */
  val `type`: String = js.native
  def changeKernel(kernelInfo: IKernelSpec): Thenable[IKernel] = js.native
  def configureConnection(connection: IConnectionProfile): Thenable[Unit] = js.native
  def configureKernel(kernelInfo: IKernelSpec): Thenable[Unit] = js.native
}

object ISession {
  @scala.inline
  def apply(
    canChangeKernels: Boolean,
    changeKernel: IKernelSpec => Thenable[IKernel],
    configureConnection: IConnectionProfile => Thenable[Unit],
    configureKernel: IKernelSpec => Thenable[Unit],
    id: String,
    kernel: IKernel,
    name: String,
    path: String,
    status: KernelStatus,
    `type`: String
  ): ISession = {
    val __obj = js.Dynamic.literal(canChangeKernels = canChangeKernels.asInstanceOf[js.Any], changeKernel = js.Any.fromFunction1(changeKernel), configureConnection = js.Any.fromFunction1(configureConnection), configureKernel = js.Any.fromFunction1(configureKernel), id = id.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISession]
  }
  @scala.inline
  implicit class ISessionOps[Self <: ISession] (val x: Self) extends AnyVal {
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
    def setCanChangeKernels(value: Boolean): Self = this.set("canChangeKernels", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangeKernel(value: IKernelSpec => Thenable[IKernel]): Self = this.set("changeKernel", js.Any.fromFunction1(value))
    @scala.inline
    def setConfigureConnection(value: IConnectionProfile => Thenable[Unit]): Self = this.set("configureConnection", js.Any.fromFunction1(value))
    @scala.inline
    def setConfigureKernel(value: IKernelSpec => Thenable[Unit]): Self = this.set("configureKernel", js.Any.fromFunction1(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKernel(value: IKernel): Self = this.set("kernel", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: KernelStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultKernelLoaded(value: Boolean): Self = this.set("defaultKernelLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultKernelLoaded: Self = this.set("defaultKernelLoaded", js.undefined)
  }
  
}

