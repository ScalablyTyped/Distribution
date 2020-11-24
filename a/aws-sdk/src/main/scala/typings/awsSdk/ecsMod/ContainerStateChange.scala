package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerStateChange extends js.Object {
  
  /**
    * The name of the container.
    */
  var containerName: js.UndefOr[String] = js.native
  
  /**
    * The exit code for the container, if the state change is a result of the container exiting.
    */
  var exitCode: js.UndefOr[BoxedInteger] = js.native
  
  /**
    * The container image SHA 256 digest.
    */
  var imageDigest: js.UndefOr[String] = js.native
  
  /**
    * Any network bindings associated with the container.
    */
  var networkBindings: js.UndefOr[NetworkBindings] = js.native
  
  /**
    * The reason for the state change.
    */
  var reason: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Docker container.
    */
  var runtimeId: js.UndefOr[String] = js.native
  
  /**
    * The status of the container.
    */
  var status: js.UndefOr[String] = js.native
}
object ContainerStateChange {
  
  @scala.inline
  def apply(): ContainerStateChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerStateChange]
  }
  
  @scala.inline
  implicit class ContainerStateChangeOps[Self <: ContainerStateChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainerName(value: String): Self = this.set("containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerName: Self = this.set("containerName", js.undefined)
    
    @scala.inline
    def setExitCode(value: BoxedInteger): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitCode: Self = this.set("exitCode", js.undefined)
    
    @scala.inline
    def setImageDigest(value: String): Self = this.set("imageDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageDigest: Self = this.set("imageDigest", js.undefined)
    
    @scala.inline
    def setNetworkBindingsVarargs(value: NetworkBinding*): Self = this.set("networkBindings", js.Array(value :_*))
    
    @scala.inline
    def setNetworkBindings(value: NetworkBindings): Self = this.set("networkBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkBindings: Self = this.set("networkBindings", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setRuntimeId(value: String): Self = this.set("runtimeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeId: Self = this.set("runtimeId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
