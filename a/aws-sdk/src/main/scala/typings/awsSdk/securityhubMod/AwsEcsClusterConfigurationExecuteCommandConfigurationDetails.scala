package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsClusterConfigurationExecuteCommandConfigurationDetails extends StObject {
  
  /**
    * The identifier of the KMS key that is used to encrypt the data between the local client and the container.
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The log configuration for the results of the run command actions. Required if Logging is NONE.
    */
  var LogConfiguration: js.UndefOr[AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails] = js.undefined
  
  /**
    * The log setting to use for redirecting logs for run command results.
    */
  var Logging: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsClusterConfigurationExecuteCommandConfigurationDetails {
  
  inline def apply(): AwsEcsClusterConfigurationExecuteCommandConfigurationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsClusterConfigurationExecuteCommandConfigurationDetails]
  }
  
  extension [Self <: AwsEcsClusterConfigurationExecuteCommandConfigurationDetails](x: Self) {
    
    inline def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLogConfiguration(value: AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails): Self = StObject.set(x, "LogConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogConfigurationUndefined: Self = StObject.set(x, "LogConfiguration", js.undefined)
    
    inline def setLogging(value: NonEmptyString): Self = StObject.set(x, "Logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "Logging", js.undefined)
  }
}
