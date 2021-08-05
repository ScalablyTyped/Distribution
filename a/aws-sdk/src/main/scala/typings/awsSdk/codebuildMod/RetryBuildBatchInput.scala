package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryBuildBatchInput extends StObject {
  
  /**
    * Specifies the identifier of the batch build to restart.
    */
  var id: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A unique, case sensitive identifier you provide to ensure the idempotency of the RetryBuildBatch request. The token is included in the RetryBuildBatch request and is valid for five minutes. If you repeat the RetryBuildBatch request with the same token, but change a parameter, AWS CodeBuild returns a parameter mismatch error.
    */
  var idempotencyToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the type of retry to perform.
    */
  var retryType: js.UndefOr[RetryBuildBatchType] = js.undefined
}
object RetryBuildBatchInput {
  
  inline def apply(): RetryBuildBatchInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryBuildBatchInput]
  }
  
  extension [Self <: RetryBuildBatchInput](x: Self) {
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdempotencyToken(value: String): Self = StObject.set(x, "idempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyTokenUndefined: Self = StObject.set(x, "idempotencyToken", js.undefined)
    
    inline def setRetryType(value: RetryBuildBatchType): Self = StObject.set(x, "retryType", value.asInstanceOf[js.Any])
    
    inline def setRetryTypeUndefined: Self = StObject.set(x, "retryType", js.undefined)
  }
}
