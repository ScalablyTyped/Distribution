package typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddPipelineOptions extends StObject {
  
  /**
    * The phase that this policy must come after.
    */
  var afterPhase: js.UndefOr[PipelinePhase] = js.undefined
  
  /**
    * Policies that this policy must come after.
    */
  var afterPolicies: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Policies that this policy must come before.
    */
  var beforePolicies: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The phase this policy belongs to.
    */
  var phase: js.UndefOr[PipelinePhase] = js.undefined
}
object AddPipelineOptions {
  
  inline def apply(): AddPipelineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddPipelineOptions]
  }
  
  extension [Self <: AddPipelineOptions](x: Self) {
    
    inline def setAfterPhase(value: PipelinePhase): Self = StObject.set(x, "afterPhase", value.asInstanceOf[js.Any])
    
    inline def setAfterPhaseUndefined: Self = StObject.set(x, "afterPhase", js.undefined)
    
    inline def setAfterPolicies(value: js.Array[String]): Self = StObject.set(x, "afterPolicies", value.asInstanceOf[js.Any])
    
    inline def setAfterPoliciesUndefined: Self = StObject.set(x, "afterPolicies", js.undefined)
    
    inline def setAfterPoliciesVarargs(value: String*): Self = StObject.set(x, "afterPolicies", js.Array(value*))
    
    inline def setBeforePolicies(value: js.Array[String]): Self = StObject.set(x, "beforePolicies", value.asInstanceOf[js.Any])
    
    inline def setBeforePoliciesUndefined: Self = StObject.set(x, "beforePolicies", js.undefined)
    
    inline def setBeforePoliciesVarargs(value: String*): Self = StObject.set(x, "beforePolicies", js.Array(value*))
    
    inline def setPhase(value: PipelinePhase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
  }
}
