package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderMetadata extends StObject {
  
  var objectMetadata: js.Array[ObjectMetadata]
}
object ProviderMetadata {
  
  inline def apply(objectMetadata: js.Array[ObjectMetadata]): ProviderMetadata = {
    val __obj = js.Dynamic.literal(objectMetadata = objectMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProviderMetadata] (val x: Self) extends AnyVal {
    
    inline def setObjectMetadata(value: js.Array[ObjectMetadata]): Self = StObject.set(x, "objectMetadata", value.asInstanceOf[js.Any])
    
    inline def setObjectMetadataVarargs(value: ObjectMetadata*): Self = StObject.set(x, "objectMetadata", js.Array(value*))
  }
}
