package typings.awsSdk.fisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentTemplate extends StObject {
  
  /**
    * The actions for the experiment.
    */
  var actions: js.UndefOr[ExperimentTemplateActionMap] = js.undefined
  
  /**
    * The time the experiment template was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description for the experiment template.
    */
  var description: js.UndefOr[ExperimentTemplateDescription] = js.undefined
  
  /**
    * The ID of the experiment template.
    */
  var id: js.UndefOr[ExperimentTemplateId] = js.undefined
  
  /**
    * The time the experiment template was last updated.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The configuration for experiment logging.
    */
  var logConfiguration: js.UndefOr[ExperimentTemplateLogConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The stop conditions for the experiment.
    */
  var stopConditions: js.UndefOr[ExperimentTemplateStopConditionList] = js.undefined
  
  /**
    * The tags for the experiment template.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The targets for the experiment.
    */
  var targets: js.UndefOr[ExperimentTemplateTargetMap] = js.undefined
}
object ExperimentTemplate {
  
  inline def apply(): ExperimentTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentTemplate]
  }
  
  extension [Self <: ExperimentTemplate](x: Self) {
    
    inline def setActions(value: ExperimentTemplateActionMap): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: ExperimentTemplateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: ExperimentTemplateId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setLogConfiguration(value: ExperimentTemplateLogConfiguration): Self = StObject.set(x, "logConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogConfigurationUndefined: Self = StObject.set(x, "logConfiguration", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setStopConditions(value: ExperimentTemplateStopConditionList): Self = StObject.set(x, "stopConditions", value.asInstanceOf[js.Any])
    
    inline def setStopConditionsUndefined: Self = StObject.set(x, "stopConditions", js.undefined)
    
    inline def setStopConditionsVarargs(value: ExperimentTemplateStopCondition*): Self = StObject.set(x, "stopConditions", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTargets(value: ExperimentTemplateTargetMap): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
  }
}
