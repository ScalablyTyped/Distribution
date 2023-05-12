package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateKeyResponse extends StObject {
  
  /**
    * <p>Metadata associated with the KMS key.</p>
    */
  var KeyMetadata: js.UndefOr[typings.awsSdkClientKms.distTypesModelsModels0Mod.KeyMetadata] = js.undefined
}
object CreateKeyResponse {
  
  inline def apply(): CreateKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setKeyMetadata(value: KeyMetadata): Self = StObject.set(x, "KeyMetadata", value.asInstanceOf[js.Any])
    
    inline def setKeyMetadataUndefined: Self = StObject.set(x, "KeyMetadata", js.undefined)
  }
}
