package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsDetails extends StObject {
  
  /**
    * The command that is passed to the container.
    */
  var Command: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The number of CPU units reserved for the container.
    */
  var Cpu: js.UndefOr[Integer] = js.undefined
  
  /**
    * The dependencies that are defined for container startup and shutdown.
    */
  var DependsOn: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsDependsOnList] = js.undefined
  
  /**
    * Whether to disable networking within the container.
    */
  var DisableNetworking: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of DNS search domains that are presented to the container.
    */
  var DnsSearchDomains: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * A list of DNS servers that are presented to the container.
    */
  var DnsServers: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * A key-value map of labels to add to the container.
    */
  var DockerLabels: js.UndefOr[FieldMap] = js.undefined
  
  /**
    * A list of strings to provide custom labels for SELinux and AppArmor multi-level security systems.
    */
  var DockerSecurityOptions: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The entry point that is passed to the container.
    */
  var EntryPoint: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The environment variables to pass to a container.
    */
  var Environment: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsEnvironmentList] = js.undefined
  
  /**
    * A list of files containing the environment variables to pass to a container.
    */
  var EnvironmentFiles: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesList] = js.undefined
  
  /**
    * Whether the container is essential. All tasks must have at least one essential container.
    */
  var Essential: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of hostnames and IP address mappings to append to the /etc/hosts file on the container.
    */
  var ExtraHosts: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsExtraHostsList] = js.undefined
  
  /**
    * The FireLens configuration for the container. Specifies and configures a log router for container logs.
    */
  var FirelensConfiguration: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails] = js.undefined
  
  /**
    * The container health check command and associated configuration parameters for the container.
    */
  var HealthCheck: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails] = js.undefined
  
  /**
    * The hostname to use for the container.
    */
  var Hostname: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The image used to start the container.
    */
  var Image: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * If set to true, then containerized applications can be deployed that require stdin or a tty to be allocated.
    */
  var Interactive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of links for the container in the form  container_name:alias . Allows containers to communicate with each other without the need for port mappings.
    */
  var Links: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * Linux-specific modifications that are applied to the container, such as Linux kernel capabilities.
    */
  var LinuxParameters: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails] = js.undefined
  
  /**
    * The log configuration specification for the container.
    */
  var LogConfiguration: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails] = js.undefined
  
  /**
    * The amount (in MiB) of memory to present to the container. If the container attempts to exceed the memory specified here, the container is shut down. The total amount of memory reserved for all containers within a task must be lower than the task memory value, if one is specified.
    */
  var Memory: js.UndefOr[Integer] = js.undefined
  
  /**
    * The soft limit (in MiB) of memory to reserve for the container.
    */
  var MemoryReservation: js.UndefOr[Integer] = js.undefined
  
  /**
    * The mount points for the data volumes in the container.
    */
  var MountPoints: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsMountPointsList] = js.undefined
  
  /**
    * The name of the container.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The list of port mappings for the container.
    */
  var PortMappings: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsPortMappingsList] = js.undefined
  
  /**
    * Whether the container is given elevated privileges on the host container instance. The elevated privileges are similar to the root user.
    */
  var Privileged: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to allocate a TTY to the container.
    */
  var PseudoTerminal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the container is given read-only access to its root file system.
    */
  var ReadonlyRootFilesystem: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The private repository authentication credentials to use.
    */
  var RepositoryCredentials: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails] = js.undefined
  
  /**
    * The type and amount of a resource to assign to a container. The only supported resource is a GPU.
    */
  var ResourceRequirements: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsList] = js.undefined
  
  /**
    * The secrets to pass to the container.
    */
  var Secrets: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsSecretsList] = js.undefined
  
  /**
    * The number of seconds to wait before giving up on resolving dependencies for a container. 
    */
  var StartTimeout: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of seconds to wait before the container is stopped if it doesn't shut down normally on its own.
    */
  var StopTimeout: js.UndefOr[Integer] = js.undefined
  
  /**
    * A list of namespaced kernel parameters to set in the container.
    */
  var SystemControls: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsSystemControlsList] = js.undefined
  
  /**
    * A list of ulimits to set in the container. 
    */
  var Ulimits: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsUlimitsList] = js.undefined
  
  /**
    * The user to use inside the container. The value can use one of the following formats.     user       user : group       uid       uid : gid       user : gid       uid : group    
    */
  var User: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Data volumes to mount from another container.
    */
  var VolumesFrom: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsVolumesFromList] = js.undefined
  
  /**
    * The working directory in which to run commands inside the container.
    */
  var WorkingDirectory: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsDetails]
  }
  
  extension [Self <: AwsEcsTaskDefinitionContainerDefinitionsDetails](x: Self) {
    
    inline def setCommand(value: NonEmptyStringList): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "Command", js.undefined)
    
    inline def setCommandVarargs(value: NonEmptyString*): Self = StObject.set(x, "Command", js.Array(value*))
    
    inline def setCpu(value: Integer): Self = StObject.set(x, "Cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "Cpu", js.undefined)
    
    inline def setDependsOn(value: AwsEcsTaskDefinitionContainerDefinitionsDependsOnList): Self = StObject.set(x, "DependsOn", value.asInstanceOf[js.Any])
    
    inline def setDependsOnUndefined: Self = StObject.set(x, "DependsOn", js.undefined)
    
    inline def setDependsOnVarargs(value: AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails*): Self = StObject.set(x, "DependsOn", js.Array(value*))
    
    inline def setDisableNetworking(value: Boolean): Self = StObject.set(x, "DisableNetworking", value.asInstanceOf[js.Any])
    
    inline def setDisableNetworkingUndefined: Self = StObject.set(x, "DisableNetworking", js.undefined)
    
    inline def setDnsSearchDomains(value: NonEmptyStringList): Self = StObject.set(x, "DnsSearchDomains", value.asInstanceOf[js.Any])
    
    inline def setDnsSearchDomainsUndefined: Self = StObject.set(x, "DnsSearchDomains", js.undefined)
    
    inline def setDnsSearchDomainsVarargs(value: NonEmptyString*): Self = StObject.set(x, "DnsSearchDomains", js.Array(value*))
    
    inline def setDnsServers(value: NonEmptyStringList): Self = StObject.set(x, "DnsServers", value.asInstanceOf[js.Any])
    
    inline def setDnsServersUndefined: Self = StObject.set(x, "DnsServers", js.undefined)
    
    inline def setDnsServersVarargs(value: NonEmptyString*): Self = StObject.set(x, "DnsServers", js.Array(value*))
    
    inline def setDockerLabels(value: FieldMap): Self = StObject.set(x, "DockerLabels", value.asInstanceOf[js.Any])
    
    inline def setDockerLabelsUndefined: Self = StObject.set(x, "DockerLabels", js.undefined)
    
    inline def setDockerSecurityOptions(value: NonEmptyStringList): Self = StObject.set(x, "DockerSecurityOptions", value.asInstanceOf[js.Any])
    
    inline def setDockerSecurityOptionsUndefined: Self = StObject.set(x, "DockerSecurityOptions", js.undefined)
    
    inline def setDockerSecurityOptionsVarargs(value: NonEmptyString*): Self = StObject.set(x, "DockerSecurityOptions", js.Array(value*))
    
    inline def setEntryPoint(value: NonEmptyStringList): Self = StObject.set(x, "EntryPoint", value.asInstanceOf[js.Any])
    
    inline def setEntryPointUndefined: Self = StObject.set(x, "EntryPoint", js.undefined)
    
    inline def setEntryPointVarargs(value: NonEmptyString*): Self = StObject.set(x, "EntryPoint", js.Array(value*))
    
    inline def setEnvironment(value: AwsEcsTaskDefinitionContainerDefinitionsEnvironmentList): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentFiles(value: AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesList): Self = StObject.set(x, "EnvironmentFiles", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentFilesUndefined: Self = StObject.set(x, "EnvironmentFiles", js.undefined)
    
    inline def setEnvironmentFilesVarargs(value: AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails*): Self = StObject.set(x, "EnvironmentFiles", js.Array(value*))
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setEnvironmentVarargs(value: AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails*): Self = StObject.set(x, "Environment", js.Array(value*))
    
    inline def setEssential(value: Boolean): Self = StObject.set(x, "Essential", value.asInstanceOf[js.Any])
    
    inline def setEssentialUndefined: Self = StObject.set(x, "Essential", js.undefined)
    
    inline def setExtraHosts(value: AwsEcsTaskDefinitionContainerDefinitionsExtraHostsList): Self = StObject.set(x, "ExtraHosts", value.asInstanceOf[js.Any])
    
    inline def setExtraHostsUndefined: Self = StObject.set(x, "ExtraHosts", js.undefined)
    
    inline def setExtraHostsVarargs(value: AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails*): Self = StObject.set(x, "ExtraHosts", js.Array(value*))
    
    inline def setFirelensConfiguration(value: AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails): Self = StObject.set(x, "FirelensConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFirelensConfigurationUndefined: Self = StObject.set(x, "FirelensConfiguration", js.undefined)
    
    inline def setHealthCheck(value: AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails): Self = StObject.set(x, "HealthCheck", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckUndefined: Self = StObject.set(x, "HealthCheck", js.undefined)
    
    inline def setHostname(value: NonEmptyString): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "Hostname", js.undefined)
    
    inline def setImage(value: NonEmptyString): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "Interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "Interactive", js.undefined)
    
    inline def setLinks(value: NonEmptyStringList): Self = StObject.set(x, "Links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "Links", js.undefined)
    
    inline def setLinksVarargs(value: NonEmptyString*): Self = StObject.set(x, "Links", js.Array(value*))
    
    inline def setLinuxParameters(value: AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails): Self = StObject.set(x, "LinuxParameters", value.asInstanceOf[js.Any])
    
    inline def setLinuxParametersUndefined: Self = StObject.set(x, "LinuxParameters", js.undefined)
    
    inline def setLogConfiguration(value: AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails): Self = StObject.set(x, "LogConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogConfigurationUndefined: Self = StObject.set(x, "LogConfiguration", js.undefined)
    
    inline def setMemory(value: Integer): Self = StObject.set(x, "Memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryReservation(value: Integer): Self = StObject.set(x, "MemoryReservation", value.asInstanceOf[js.Any])
    
    inline def setMemoryReservationUndefined: Self = StObject.set(x, "MemoryReservation", js.undefined)
    
    inline def setMemoryUndefined: Self = StObject.set(x, "Memory", js.undefined)
    
    inline def setMountPoints(value: AwsEcsTaskDefinitionContainerDefinitionsMountPointsList): Self = StObject.set(x, "MountPoints", value.asInstanceOf[js.Any])
    
    inline def setMountPointsUndefined: Self = StObject.set(x, "MountPoints", js.undefined)
    
    inline def setMountPointsVarargs(value: AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails*): Self = StObject.set(x, "MountPoints", js.Array(value*))
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPortMappings(value: AwsEcsTaskDefinitionContainerDefinitionsPortMappingsList): Self = StObject.set(x, "PortMappings", value.asInstanceOf[js.Any])
    
    inline def setPortMappingsUndefined: Self = StObject.set(x, "PortMappings", js.undefined)
    
    inline def setPortMappingsVarargs(value: AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails*): Self = StObject.set(x, "PortMappings", js.Array(value*))
    
    inline def setPrivileged(value: Boolean): Self = StObject.set(x, "Privileged", value.asInstanceOf[js.Any])
    
    inline def setPrivilegedUndefined: Self = StObject.set(x, "Privileged", js.undefined)
    
    inline def setPseudoTerminal(value: Boolean): Self = StObject.set(x, "PseudoTerminal", value.asInstanceOf[js.Any])
    
    inline def setPseudoTerminalUndefined: Self = StObject.set(x, "PseudoTerminal", js.undefined)
    
    inline def setReadonlyRootFilesystem(value: Boolean): Self = StObject.set(x, "ReadonlyRootFilesystem", value.asInstanceOf[js.Any])
    
    inline def setReadonlyRootFilesystemUndefined: Self = StObject.set(x, "ReadonlyRootFilesystem", js.undefined)
    
    inline def setRepositoryCredentials(value: AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails): Self = StObject.set(x, "RepositoryCredentials", value.asInstanceOf[js.Any])
    
    inline def setRepositoryCredentialsUndefined: Self = StObject.set(x, "RepositoryCredentials", js.undefined)
    
    inline def setResourceRequirements(value: AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsList): Self = StObject.set(x, "ResourceRequirements", value.asInstanceOf[js.Any])
    
    inline def setResourceRequirementsUndefined: Self = StObject.set(x, "ResourceRequirements", js.undefined)
    
    inline def setResourceRequirementsVarargs(value: AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails*): Self = StObject.set(x, "ResourceRequirements", js.Array(value*))
    
    inline def setSecrets(value: AwsEcsTaskDefinitionContainerDefinitionsSecretsList): Self = StObject.set(x, "Secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsUndefined: Self = StObject.set(x, "Secrets", js.undefined)
    
    inline def setSecretsVarargs(value: AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails*): Self = StObject.set(x, "Secrets", js.Array(value*))
    
    inline def setStartTimeout(value: Integer): Self = StObject.set(x, "StartTimeout", value.asInstanceOf[js.Any])
    
    inline def setStartTimeoutUndefined: Self = StObject.set(x, "StartTimeout", js.undefined)
    
    inline def setStopTimeout(value: Integer): Self = StObject.set(x, "StopTimeout", value.asInstanceOf[js.Any])
    
    inline def setStopTimeoutUndefined: Self = StObject.set(x, "StopTimeout", js.undefined)
    
    inline def setSystemControls(value: AwsEcsTaskDefinitionContainerDefinitionsSystemControlsList): Self = StObject.set(x, "SystemControls", value.asInstanceOf[js.Any])
    
    inline def setSystemControlsUndefined: Self = StObject.set(x, "SystemControls", js.undefined)
    
    inline def setSystemControlsVarargs(value: AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails*): Self = StObject.set(x, "SystemControls", js.Array(value*))
    
    inline def setUlimits(value: AwsEcsTaskDefinitionContainerDefinitionsUlimitsList): Self = StObject.set(x, "Ulimits", value.asInstanceOf[js.Any])
    
    inline def setUlimitsUndefined: Self = StObject.set(x, "Ulimits", js.undefined)
    
    inline def setUlimitsVarargs(value: AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails*): Self = StObject.set(x, "Ulimits", js.Array(value*))
    
    inline def setUser(value: NonEmptyString): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
    
    inline def setVolumesFrom(value: AwsEcsTaskDefinitionContainerDefinitionsVolumesFromList): Self = StObject.set(x, "VolumesFrom", value.asInstanceOf[js.Any])
    
    inline def setVolumesFromUndefined: Self = StObject.set(x, "VolumesFrom", js.undefined)
    
    inline def setVolumesFromVarargs(value: AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails*): Self = StObject.set(x, "VolumesFrom", js.Array(value*))
    
    inline def setWorkingDirectory(value: NonEmptyString): Self = StObject.set(x, "WorkingDirectory", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectoryUndefined: Self = StObject.set(x, "WorkingDirectory", js.undefined)
  }
}
