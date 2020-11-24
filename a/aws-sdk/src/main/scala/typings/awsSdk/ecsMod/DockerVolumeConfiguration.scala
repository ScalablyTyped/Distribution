package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DockerVolumeConfiguration extends js.Object {
  
  /**
    * If this value is true, the Docker volume is created if it does not already exist.  This field is only used if the scope is shared. 
    */
  var autoprovision: js.UndefOr[BoxedBoolean] = js.native
  
  /**
    * The Docker volume driver to use. The driver value must match the driver name provided by Docker because it is used for task placement. If the driver was installed using the Docker plugin CLI, use docker plugin ls to retrieve the driver name from your container instance. If the driver was installed using another method, use Docker plugin discovery to retrieve the driver name. For more information, see Docker plugin discovery. This parameter maps to Driver in the Create a volume section of the Docker Remote API and the xxdriver option to docker volume create.
    */
  var driver: js.UndefOr[String] = js.native
  
  /**
    * A map of Docker driver-specific options passed through. This parameter maps to DriverOpts in the Create a volume section of the Docker Remote API and the xxopt option to docker volume create.
    */
  var driverOpts: js.UndefOr[StringMap] = js.native
  
  /**
    * Custom metadata to add to your Docker volume. This parameter maps to Labels in the Create a volume section of the Docker Remote API and the xxlabel option to docker volume create.
    */
  var labels: js.UndefOr[StringMap] = js.native
  
  /**
    * The scope for the Docker volume that determines its lifecycle. Docker volumes that are scoped to a task are automatically provisioned when the task starts and destroyed when the task stops. Docker volumes that are scoped as shared persist after the task stops.
    */
  var scope: js.UndefOr[Scope] = js.native
}
object DockerVolumeConfiguration {
  
  @scala.inline
  def apply(): DockerVolumeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DockerVolumeConfiguration]
  }
  
  @scala.inline
  implicit class DockerVolumeConfigurationOps[Self <: DockerVolumeConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAutoprovision(value: BoxedBoolean): Self = this.set("autoprovision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoprovision: Self = this.set("autoprovision", js.undefined)
    
    @scala.inline
    def setDriver(value: String): Self = this.set("driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriver: Self = this.set("driver", js.undefined)
    
    @scala.inline
    def setDriverOpts(value: StringMap): Self = this.set("driverOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriverOpts: Self = this.set("driverOpts", js.undefined)
    
    @scala.inline
    def setLabels(value: StringMap): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setScope(value: Scope): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
