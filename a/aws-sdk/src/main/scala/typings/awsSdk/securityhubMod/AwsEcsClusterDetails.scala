package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsClusterDetails extends StObject {
  
  /**
    * The number of services that are running on the cluster in an ACTIVE state. You can view these services with the Amazon ECS  ListServices  API operation. 
    */
  var ActiveServicesCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The short name of one or more capacity providers to associate with the cluster.
    */
  var CapacityProviders: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that identifies the cluster. 
    */
  var ClusterArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A name that you use to identify your cluster. 
    */
  var ClusterName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The setting to use to create the cluster. Specifically used to configure whether to enable CloudWatch Container Insights for the cluster.
    */
  var ClusterSettings: js.UndefOr[AwsEcsClusterClusterSettingsList] = js.undefined
  
  /**
    * The run command configuration for the cluster.
    */
  var Configuration: js.UndefOr[AwsEcsClusterConfigurationDetails] = js.undefined
  
  /**
    * The default capacity provider strategy for the cluster. The default capacity provider strategy is used when services or tasks are run without a specified launch type or capacity provider strategy.
    */
  var DefaultCapacityProviderStrategy: js.UndefOr[AwsEcsClusterDefaultCapacityProviderStrategyList] = js.undefined
  
  /**
    * The number of container instances registered into the cluster. This includes container instances in both ACTIVE and DRAINING status. 
    */
  var RegisteredContainerInstancesCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of tasks in the cluster that are in the RUNNING state. 
    */
  var RunningTasksCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The status of the cluster. 
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsClusterDetails {
  
  inline def apply(): AwsEcsClusterDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsClusterDetails]
  }
  
  extension [Self <: AwsEcsClusterDetails](x: Self) {
    
    inline def setActiveServicesCount(value: Integer): Self = StObject.set(x, "ActiveServicesCount", value.asInstanceOf[js.Any])
    
    inline def setActiveServicesCountUndefined: Self = StObject.set(x, "ActiveServicesCount", js.undefined)
    
    inline def setCapacityProviders(value: NonEmptyStringList): Self = StObject.set(x, "CapacityProviders", value.asInstanceOf[js.Any])
    
    inline def setCapacityProvidersUndefined: Self = StObject.set(x, "CapacityProviders", js.undefined)
    
    inline def setCapacityProvidersVarargs(value: NonEmptyString*): Self = StObject.set(x, "CapacityProviders", js.Array(value*))
    
    inline def setClusterArn(value: NonEmptyString): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    inline def setClusterName(value: NonEmptyString): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "ClusterName", js.undefined)
    
    inline def setClusterSettings(value: AwsEcsClusterClusterSettingsList): Self = StObject.set(x, "ClusterSettings", value.asInstanceOf[js.Any])
    
    inline def setClusterSettingsUndefined: Self = StObject.set(x, "ClusterSettings", js.undefined)
    
    inline def setClusterSettingsVarargs(value: AwsEcsClusterClusterSettingsDetails*): Self = StObject.set(x, "ClusterSettings", js.Array(value*))
    
    inline def setConfiguration(value: AwsEcsClusterConfigurationDetails): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setDefaultCapacityProviderStrategy(value: AwsEcsClusterDefaultCapacityProviderStrategyList): Self = StObject.set(x, "DefaultCapacityProviderStrategy", value.asInstanceOf[js.Any])
    
    inline def setDefaultCapacityProviderStrategyUndefined: Self = StObject.set(x, "DefaultCapacityProviderStrategy", js.undefined)
    
    inline def setDefaultCapacityProviderStrategyVarargs(value: AwsEcsClusterDefaultCapacityProviderStrategyDetails*): Self = StObject.set(x, "DefaultCapacityProviderStrategy", js.Array(value*))
    
    inline def setRegisteredContainerInstancesCount(value: Integer): Self = StObject.set(x, "RegisteredContainerInstancesCount", value.asInstanceOf[js.Any])
    
    inline def setRegisteredContainerInstancesCountUndefined: Self = StObject.set(x, "RegisteredContainerInstancesCount", js.undefined)
    
    inline def setRunningTasksCount(value: Integer): Self = StObject.set(x, "RunningTasksCount", value.asInstanceOf[js.Any])
    
    inline def setRunningTasksCountUndefined: Self = StObject.set(x, "RunningTasksCount", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
