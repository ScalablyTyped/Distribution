package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerOverride extends StObject {
  
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
  implicit class ContainerOverrideMutableBuilder[Self <: ContainerOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: StringList): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value :_*))
    
    @scala.inline
    def setCpu(value: BoxedInteger): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    @scala.inline
    def setEnvironment(value: EnvironmentVariables): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentFiles(value: EnvironmentFiles): Self = StObject.set(x, "environmentFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentFilesUndefined: Self = StObject.set(x, "environmentFiles", js.undefined)
    
    @scala.inline
    def setEnvironmentFilesVarargs(value: EnvironmentFile*): Self = StObject.set(x, "environmentFiles", js.Array(value :_*))
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setEnvironmentVarargs(value: KeyValuePair*): Self = StObject.set(x, "environment", js.Array(value :_*))
    
    @scala.inline
    def setMemory(value: BoxedInteger): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryReservation(value: BoxedInteger): Self = StObject.set(x, "memoryReservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryReservationUndefined: Self = StObject.set(x, "memoryReservation", js.undefined)
    
    @scala.inline
    def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResourceRequirements(value: ResourceRequirements): Self = StObject.set(x, "resourceRequirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRequirementsUndefined: Self = StObject.set(x, "resourceRequirements", js.undefined)
    
    @scala.inline
    def setResourceRequirementsVarargs(value: ResourceRequirement*): Self = StObject.set(x, "resourceRequirements", js.Array(value :_*))
  }
}
