package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryBuildBatchInput extends StObject {
  
  /**
    * Specifies the identifier of the batch build to restart.
    */
  var id: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A unique, case sensitive identifier you provide to ensure the idempotency of the RetryBuildBatch request. The token is included in the RetryBuildBatch request and is valid for five minutes. If you repeat the RetryBuildBatch request with the same token, but change a parameter, AWS CodeBuild returns a parameter mismatch error.
    */
  var idempotencyToken: js.UndefOr[String] = js.native
  
  /**
    * Specifies the type of retry to perform.
    */
  var retryType: js.UndefOr[RetryBuildBatchType] = js.native
}
object RetryBuildBatchInput {
  
  @scala.inline
  def apply(): RetryBuildBatchInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryBuildBatchInput]
  }
  
  @scala.inline
  implicit class RetryBuildBatchInputMutableBuilder[Self <: RetryBuildBatchInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIdempotencyToken(value: String): Self = StObject.set(x, "idempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotencyTokenUndefined: Self = StObject.set(x, "idempotencyToken", js.undefined)
    
    @scala.inline
    def setRetryType(value: RetryBuildBatchType): Self = StObject.set(x, "retryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryTypeUndefined: Self = StObject.set(x, "retryType", js.undefined)
  }
}
