package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerOverride extends js.Object {
  
  /**
    * The command to send to the container that overrides the default command from the Docker image or the task definition. You must also specify a container name.
    */
  var command: js.UndefOr[StringList] = js.native
  
  /**
    * The number of cpu units reserved for the container, instead of the default value from the task definition. You must also specify a container name.
    */
  var cpu: js.UndefOr[BoxedInteger] = js.native
  
  /**
    * The environment variables to send to the container. You can add new environment variables, which are added to the container at launch, or you can override the existing environment variables from the Docker image or the task definition. You must also specify a container name.
    */
  var environment: js.UndefOr[EnvironmentVariables] = js.native
  
  /**
    * A list of files containing the environment variables to pass to a container, instead of the value from the container definition.
    */
  var environmentFiles: js.UndefOr[EnvironmentFiles] = js.native
  
  /**
    * The hard limit (in MiB) of memory to present to the container, instead of the default value from the task definition. If your container attempts to exceed the memory specified here, the container is killed. You must also specify a container name.
    */
  var memory: js.UndefOr[BoxedInteger] = js.native
  
  /**
    * The soft limit (in MiB) of memory to reserve for the container, instead of the default value from the task definition. You must also specify a container name.
    */
  var memoryReservation: js.UndefOr[BoxedInteger] = js.native
  
  /**
    * The name of the container that receives the override. This parameter is required if any override is specified.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The type and amount of a resource to assign to a container, instead of the default value from the task definition. The only supported resource is a GPU.
    */
  var resourceRequirements: js.UndefOr[ResourceRequirements] = js.native
}
object ContainerOverride {
  
  @scala.inline
  def apply(): ContainerOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerOverride]
  }
  
  @scala.inline
  implicit class ContainerOverrideOps[Self <: ContainerOverride] (val x: Self) extends AnyVal {
    
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
    def setCommandVarargs(value: String*): Self = this.set("command", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: StringList): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setCpu(value: BoxedInteger): Self = this.set("cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpu: Self = this.set("cpu", js.undefined)
    
    @scala.inline
    def setEnvironmentVarargs(value: KeyValuePair*): Self = this.set("environment", js.Array(value :_*))
    
    @scala.inline
    def setEnvironment(value: EnvironmentVariables): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setEnvironmentFilesVarargs(value: EnvironmentFile*): Self = this.set("environmentFiles", js.Array(value :_*))
    
    @scala.inline
    def setEnvironmentFiles(value: EnvironmentFiles): Self = this.set("environmentFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentFiles: Self = this.set("environmentFiles", js.undefined)
    
    @scala.inline
    def setMemory(value: BoxedInteger): Self = this.set("memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemory: Self = this.set("memory", js.undefined)
    
    @scala.inline
    def setMemoryReservation(value: BoxedInteger): Self = this.set("memoryReservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryReservation: Self = this.set("memoryReservation", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResourceRequirementsVarargs(value: ResourceRequirement*): Self = this.set("resourceRequirements", js.Array(value :_*))
    
    @scala.inline
    def setResourceRequirements(value: ResourceRequirements): Self = this.set("resourceRequirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceRequirements: Self = this.set("resourceRequirements", js.undefined)
  }
}
