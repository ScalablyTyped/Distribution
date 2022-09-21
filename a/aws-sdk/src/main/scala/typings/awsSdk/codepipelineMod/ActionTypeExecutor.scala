package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionTypeExecutor extends StObject {
  
  /**
    * The action configuration properties for the action type. These properties are specified in the action definition when the action type is created.
    */
  var configuration: ExecutorConfiguration
  
  /**
    * The timeout in seconds for the job. An action execution can have multiple jobs. This is the timeout for a single job, not the entire action execution.
    */
  var jobTimeout: js.UndefOr[JobTimeout] = js.undefined
  
  /**
    * The policy statement that specifies the permissions in the CodePipeline customer’s account that are needed to successfully run an action. To grant permission to another account, specify the account ID as the Principal, a domain-style identifier defined by the service, for example codepipeline.amazonaws.com.  The size of the passed JSON policy document cannot exceed 2048 characters. 
    */
  var policyStatementsTemplate: js.UndefOr[PolicyStatementsTemplate] = js.undefined
  
  /**
    * The integration model used to create and update the action type, Lambda or JobWorker. 
    */
  var `type`: ExecutorType
}
object ActionTypeExecutor {
  
  inline def apply(configuration: ExecutorConfiguration, `type`: ExecutorType): ActionTypeExecutor = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTypeExecutor]
  }
  
  extension [Self <: ActionTypeExecutor](x: Self) {
    
    inline def setConfiguration(value: ExecutorConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setJobTimeout(value: JobTimeout): Self = StObject.set(x, "jobTimeout", value.asInstanceOf[js.Any])
    
    inline def setJobTimeoutUndefined: Self = StObject.set(x, "jobTimeout", js.undefined)
    
    inline def setPolicyStatementsTemplate(value: PolicyStatementsTemplate): Self = StObject.set(x, "policyStatementsTemplate", value.asInstanceOf[js.Any])
    
    inline def setPolicyStatementsTemplateUndefined: Self = StObject.set(x, "policyStatementsTemplate", js.undefined)
    
    inline def setType(value: ExecutorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
