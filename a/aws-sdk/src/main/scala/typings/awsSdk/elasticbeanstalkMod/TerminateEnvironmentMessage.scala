package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminateEnvironmentMessage extends js.Object {
  
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
  implicit class TerminateEnvironmentMessageOps[Self <: TerminateEnvironmentMessage] (val x: Self) extends AnyVal {
    
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
    def setEnvironmentId(value: EnvironmentId): Self = this.set("EnvironmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentId: Self = this.set("EnvironmentId", js.undefined)
    
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = this.set("EnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentName: Self = this.set("EnvironmentName", js.undefined)
    
    @scala.inline
    def setForceTerminate(value: ForceTerminate): Self = this.set("ForceTerminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceTerminate: Self = this.set("ForceTerminate", js.undefined)
    
    @scala.inline
    def setTerminateResources(value: TerminateEnvironmentResources): Self = this.set("TerminateResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminateResources: Self = this.set("TerminateResources", js.undefined)
  }
}
