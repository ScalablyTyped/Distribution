package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryBuildInput extends StObject {
  
  /**
    * Specifies the identifier of the build to restart.
    */
  var id: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A unique, case sensitive identifier you provide to ensure the idempotency of the RetryBuild request. The token is included in the RetryBuild request and is valid for five minutes. If you repeat the RetryBuild request with the same token, but change a parameter, AWS CodeBuild returns a parameter mismatch error.
    */
  var idempotencyToken: js.UndefOr[String] = js.native
}
object RetryBuildInput {
  
  @scala.inline
  def apply(): RetryBuildInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryBuildInput]
  }
  
  @scala.inline
  implicit class RetryBuildInputMutableBuilder[Self <: RetryBuildInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIdempotencyToken(value: String): Self = StObject.set(x, "idempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotencyTokenUndefined: Self = StObject.set(x, "idempotencyToken", js.undefined)
  }
}
