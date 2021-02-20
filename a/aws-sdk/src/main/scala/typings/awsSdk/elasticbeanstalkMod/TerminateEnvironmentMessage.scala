package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminateEnvironmentMessage extends StObject {
  
  /**
    * The ID of the environment to terminate.  Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentId: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentId] = js.native
  
  /**
    * The name of the environment to terminate.  Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  
  /**
    * Terminates the target environment even if another environment in the same group is dependent on it.
    */
  var ForceTerminate: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ForceTerminate] = js.native
  
  /**
    * Indicates whether the associated AWS resources should shut down when the environment is terminated:    true: The specified environment as well as the associated AWS resources, such as Auto Scaling group and LoadBalancer, are terminated.    false: AWS Elastic Beanstalk resource management is removed from the environment, but the AWS resources continue to operate.    For more information, see the  AWS Elastic Beanstalk User Guide.    Default: true   Valid Values: true | false 
    */
  var TerminateResources: js.UndefOr[TerminateEnvironmentResources] = js.native
}
object TerminateEnvironmentMessage {
  
  @scala.inline
  def apply(): TerminateEnvironmentMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateEnvironmentMessage]
  }
  
  @scala.inline
  implicit class TerminateEnvironmentMessageMutableBuilder[Self <: TerminateEnvironmentMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    @scala.inline
    def setForceTerminate(value: ForceTerminate): Self = StObject.set(x, "ForceTerminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceTerminateUndefined: Self = StObject.set(x, "ForceTerminate", js.undefined)
    
    @scala.inline
    def setTerminateResources(value: TerminateEnvironmentResources): Self = StObject.set(x, "TerminateResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateResourcesUndefined: Self = StObject.set(x, "TerminateResources", js.undefined)
  }
}
