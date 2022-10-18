package typings.azureCoreClient.mod

import typings.azureCoreClient.azureCoreClientStrings.perCall
import typings.azureCoreClient.azureCoreClientStrings.perRetry
import typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod.PipelinePolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalPolicyConfig extends StObject {
  
  /**
    * A policy to be added.
    */
  var policy: PipelinePolicy
  
  /**
    * Determines if this policy be applied before or after retry logic.
    * Only use `perRetry` if you need to modify the request again
    * each time the operation is retried due to retryable service
    * issues.
    */
  var position: perCall | perRetry
}
object AdditionalPolicyConfig {
  
  inline def apply(policy: PipelinePolicy, position: perCall | perRetry): AdditionalPolicyConfig = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalPolicyConfig]
  }
  
  extension [Self <: AdditionalPolicyConfig](x: Self) {
    
    inline def setPolicy(value: PipelinePolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: perCall | perRetry): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
