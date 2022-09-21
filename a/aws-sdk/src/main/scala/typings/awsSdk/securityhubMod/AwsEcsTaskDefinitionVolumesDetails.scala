package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionVolumesDetails extends StObject {
  
  /**
    * Information about a Docker volume.
    */
  var DockerVolumeConfiguration: js.UndefOr[AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails] = js.undefined
  
  /**
    * Information about the Amazon Elastic File System file system that is used for task storage.
    */
  var EfsVolumeConfiguration: js.UndefOr[AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails] = js.undefined
  
  /**
    * Information about a bind mount host volume.
    */
  var Host: js.UndefOr[AwsEcsTaskDefinitionVolumesHostDetails] = js.undefined
  
  /**
    * The name of the data volume.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionVolumesDetails {
  
  inline def apply(): AwsEcsTaskDefinitionVolumesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionVolumesDetails]
  }
  
  extension [Self <: AwsEcsTaskDefinitionVolumesDetails](x: Self) {
    
    inline def setDockerVolumeConfiguration(value: AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails): Self = StObject.set(x, "DockerVolumeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDockerVolumeConfigurationUndefined: Self = StObject.set(x, "DockerVolumeConfiguration", js.undefined)
    
    inline def setEfsVolumeConfiguration(value: AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails): Self = StObject.set(x, "EfsVolumeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEfsVolumeConfigurationUndefined: Self = StObject.set(x, "EfsVolumeConfiguration", js.undefined)
    
    inline def setHost(value: AwsEcsTaskDefinitionVolumesHostDetails): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "Host", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
