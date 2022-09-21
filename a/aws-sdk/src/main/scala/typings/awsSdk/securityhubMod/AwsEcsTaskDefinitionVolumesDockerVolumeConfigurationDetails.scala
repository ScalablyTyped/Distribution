package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails extends StObject {
  
  /**
    * Whether to create the Docker volume automatically if it does not already exist.
    */
  var Autoprovision: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Docker volume driver to use.
    */
  var Driver: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A map of Docker driver-specific options that are passed through.
    */
  var DriverOpts: js.UndefOr[FieldMap] = js.undefined
  
  /**
    * Custom metadata to add to the Docker volume.
    */
  var Labels: js.UndefOr[FieldMap] = js.undefined
  
  /**
    * The scope for the Docker volume that determines its lifecycle. Docker volumes that are scoped to a task are provisioned automatically when the task starts and destroyed when the task stops. Docker volumes that are shared persist after the task stops. Valid values are shared or task.
    */
  var Scope: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails {
  
  inline def apply(): AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails]
  }
  
  extension [Self <: AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails](x: Self) {
    
    inline def setAutoprovision(value: Boolean): Self = StObject.set(x, "Autoprovision", value.asInstanceOf[js.Any])
    
    inline def setAutoprovisionUndefined: Self = StObject.set(x, "Autoprovision", js.undefined)
    
    inline def setDriver(value: NonEmptyString): Self = StObject.set(x, "Driver", value.asInstanceOf[js.Any])
    
    inline def setDriverOpts(value: FieldMap): Self = StObject.set(x, "DriverOpts", value.asInstanceOf[js.Any])
    
    inline def setDriverOptsUndefined: Self = StObject.set(x, "DriverOpts", js.undefined)
    
    inline def setDriverUndefined: Self = StObject.set(x, "Driver", js.undefined)
    
    inline def setLabels(value: FieldMap): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    inline def setScope(value: NonEmptyString): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "Scope", js.undefined)
  }
}
