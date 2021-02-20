package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EvaluationResultQualifier extends StObject {
  
  /**
    * The name of the AWS Config rule that was used in the evaluation.
    */
  var ConfigRuleName: js.UndefOr[typings.awsSdk.configserviceMod.ConfigRuleName] = js.native
  
  /**
    * The ID of the evaluated AWS resource.
    */
  var ResourceId: js.UndefOr[BaseResourceId] = js.native
  
  /**
    * The type of AWS resource that was evaluated.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.native
}
object EvaluationResultQualifier {
  
  @scala.inline
  def apply(): EvaluationResultQualifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResultQualifier]
  }
  
  @scala.inline
  implicit class EvaluationResultQualifierMutableBuilder[Self <: EvaluationResultQualifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigRuleNameUndefined: Self = StObject.set(x, "ConfigRuleName", js.undefined)
    
    @scala.inline
    def setResourceId(value: BaseResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setResourceType(value: StringWithCharLimit256): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
