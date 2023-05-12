package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelKeyDeletionResponse extends StObject {
  
  /**
    * <p>The Amazon Resource Name (<a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) of the KMS key whose deletion is canceled.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
}
object CancelKeyDeletionResponse {
  
  inline def apply(): CancelKeyDeletionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelKeyDeletionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelKeyDeletionResponse] (val x: Self) extends AnyVal {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
  }
}
