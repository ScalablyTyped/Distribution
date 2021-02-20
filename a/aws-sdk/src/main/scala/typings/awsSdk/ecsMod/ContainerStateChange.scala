package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerStateChange extends StObject {
  
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
  implicit class ContainerStateChangeMutableBuilder[Self <: ContainerStateChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    @scala.inline
    def setExitCode(value: BoxedInteger): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
    @scala.inline
    def setImageDigest(value: String): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDigestUndefined: Self = StObject.set(x, "imageDigest", js.undefined)
    
    @scala.inline
    def setNetworkBindings(value: NetworkBindings): Self = StObject.set(x, "networkBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkBindingsUndefined: Self = StObject.set(x, "networkBindings", js.undefined)
    
    @scala.inline
    def setNetworkBindingsVarargs(value: NetworkBinding*): Self = StObject.set(x, "networkBindings", js.Array(value :_*))
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setRuntimeId(value: String): Self = StObject.set(x, "runtimeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeIdUndefined: Self = StObject.set(x, "runtimeId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
