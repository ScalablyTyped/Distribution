package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeKeyResponse extends StObject {
  
  /**
    * <p>Metadata associated with the key.</p>
    */
  var KeyMetadata: js.UndefOr[typings.awsSdkClientKms.distTypesModelsModels0Mod.KeyMetadata] = js.undefined
}
object DescribeKeyResponse {
  
  inline def apply(): DescribeKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setKeyMetadata(value: KeyMetadata): Self = StObject.set(x, "KeyMetadata", value.asInstanceOf[js.Any])
    
    inline def setKeyMetadataUndefined: Self = StObject.set(x, "KeyMetadata", js.undefined)
  }
}
