package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderMetadata extends StObject {
  
  var objectMetadata: js.Array[ObjectMetadata] = js.native
}
object ProviderMetadata {
  
  @scala.inline
  def apply(objectMetadata: js.Array[ObjectMetadata]): ProviderMetadata = {
    val __obj = js.Dynamic.literal(objectMetadata = objectMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderMetadata]
  }
  
  @scala.inline
  implicit class ProviderMetadataMutableBuilder[Self <: ProviderMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectMetadata(value: js.Array[ObjectMetadata]): Self = StObject.set(x, "objectMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectMetadataVarargs(value: ObjectMetadata*): Self = StObject.set(x, "objectMetadata", js.Array(value :_*))
  }
}
