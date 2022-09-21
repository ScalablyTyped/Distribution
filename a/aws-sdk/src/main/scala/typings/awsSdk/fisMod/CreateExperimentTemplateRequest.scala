package typings.awsSdk.fisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExperimentTemplateRequest extends StObject {
  
  /**
    * The actions for the experiment.
    */
  var actions: CreateExperimentTemplateActionInputMap
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: ClientToken
  
  /**
    * A description for the experiment template.
    */
  var description: ExperimentTemplateDescription
  
  /**
    * The configuration for experiment logging.
    */
  var logConfiguration: js.UndefOr[CreateExperimentTemplateLogConfigurationInput] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that grants the FIS service permission to perform service actions on your behalf.
    */
  var roleArn: RoleArn
  
  /**
    * The stop conditions.
    */
  var stopConditions: CreateExperimentTemplateStopConditionInputList
  
  /**
    * The tags to apply to the experiment template.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The targets for the experiment.
    */
  var targets: js.UndefOr[CreateExperimentTemplateTargetInputMap] = js.undefined
}
object CreateExperimentTemplateRequest {
  
  inline def apply(
    actions: CreateExperimentTemplateActionInputMap,
    clientToken: ClientToken,
    description: ExperimentTemplateDescription,
    roleArn: RoleArn,
    stopConditions: CreateExperimentTemplateStopConditionInputList
  ): CreateExperimentTemplateRequest = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], clientToken = clientToken.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stopConditions = stopConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExperimentTemplateRequest]
  }
  
  extension [Self <: CreateExperimentTemplateRequest](x: Self) {
    
    inline def setActions(value: CreateExperimentTemplateActionInputMap): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ExperimentTemplateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setLogConfiguration(value: CreateExperimentTemplateLogConfigurationInput): Self = StObject.set(x, "logConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogConfigurationUndefined: Self = StObject.set(x, "logConfiguration", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setStopConditions(value: CreateExperimentTemplateStopConditionInputList): Self = StObject.set(x, "stopConditions", value.asInstanceOf[js.Any])
    
    inline def setStopConditionsVarargs(value: CreateExperimentTemplateStopConditionInput*): Self = StObject.set(x, "stopConditions", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTargets(value: CreateExperimentTemplateTargetInputMap): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
  }
}
