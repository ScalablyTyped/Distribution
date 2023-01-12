package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectMetadata extends StObject {
  
  var metadataType: MetadataType
  
  var metadataTypeName: String
  
  var name: String
  
  var schema: String
  
  var urn: String
}
object ObjectMetadata {
  
  inline def apply(metadataType: MetadataType, metadataTypeName: String, name: String, schema: String, urn: String): ObjectMetadata = {
    val __obj = js.Dynamic.literal(metadataType = metadataType.asInstanceOf[js.Any], metadataTypeName = metadataTypeName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectMetadata] (val x: Self) extends AnyVal {
    
    inline def setMetadataType(value: MetadataType): Self = StObject.set(x, "metadataType", value.asInstanceOf[js.Any])
    
    inline def setMetadataTypeName(value: String): Self = StObject.set(x, "metadataTypeName", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setUrn(value: String): Self = StObject.set(x, "urn", value.asInstanceOf[js.Any])
  }
}
