package typings.azdata.mod.nb

import typings.azdata.mod.IConnectionProfile
import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISession extends StObject {
  
  /**
    * Is change of kernels supported for this session?
    */
  var canChangeKernels: Boolean
  
  def changeKernel(kernelInfo: IKernelSpec): Thenable[IKernel]
  
  def configureConnection(connection: IConnectionProfile): Thenable[Unit]
  
  def configureKernel(kernelInfo: IKernelSpec): Thenable[Unit]
  
  /**
    * Tracks whether the default kernel failed to load
    * This could be for a reason such as the kernel name not being recognized as a valid kernel;
    */
  var defaultKernelLoaded: js.UndefOr[Boolean] = js.undefined
  
  /*
    * Unique id of the session.
    */
  val id: String
  
  /**
    * The kernel.
    *
    * #### Notes
    * This is a read-only property, and can be altered by [changeKernel].
    */
  val kernel: IKernel
  
  /**
    * The current name associated with the session.
    */
  val name: String
  
  /**
    * The current path associated with the session.
    */
  val path: String
  
  /**
    * The status indicates if the kernel is healthy, dead, starting, etc.
    */
  val status: KernelStatus
  
  /**
    * The type of the session.
    */
  val `type`: String
}
object ISession {
  
  inline def apply(
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
  
  extension [Self <: ISession](x: Self) {
    
    inline def setCanChangeKernels(value: Boolean): Self = StObject.set(x, "canChangeKernels", value.asInstanceOf[js.Any])
    
    inline def setChangeKernel(value: IKernelSpec => Thenable[IKernel]): Self = StObject.set(x, "changeKernel", js.Any.fromFunction1(value))
    
    inline def setConfigureConnection(value: IConnectionProfile => Thenable[Unit]): Self = StObject.set(x, "configureConnection", js.Any.fromFunction1(value))
    
    inline def setConfigureKernel(value: IKernelSpec => Thenable[Unit]): Self = StObject.set(x, "configureKernel", js.Any.fromFunction1(value))
    
    inline def setDefaultKernelLoaded(value: Boolean): Self = StObject.set(x, "defaultKernelLoaded", value.asInstanceOf[js.Any])
    
    inline def setDefaultKernelLoadedUndefined: Self = StObject.set(x, "defaultKernelLoaded", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKernel(value: IKernel): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: KernelStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
