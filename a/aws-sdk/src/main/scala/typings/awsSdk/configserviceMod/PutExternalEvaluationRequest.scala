package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutExternalEvaluationRequest extends StObject {
  
  /**
    * The name of the Config rule.
    */
  var ConfigRuleName: typings.awsSdk.configserviceMod.ConfigRuleName
  
  /**
    * An ExternalEvaluation object that provides details about compliance.
    */
  var ExternalEvaluation: typings.awsSdk.configserviceMod.ExternalEvaluation
}
object PutExternalEvaluationRequest {
  
  inline def apply(ConfigRuleName: ConfigRuleName, ExternalEvaluation: ExternalEvaluation): PutExternalEvaluationRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], ExternalEvaluation = ExternalEvaluation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutExternalEvaluationRequest]
  }
  
  extension [Self <: PutExternalEvaluationRequest](x: Self) {
    
    inline def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    inline def setExternalEvaluation(value: ExternalEvaluation): Self = StObject.set(x, "ExternalEvaluation", value.asInstanceOf[js.Any])
  }
}
