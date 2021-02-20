package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectMetadata extends StObject {
  
  var metadataType: MetadataType = js.native
  
  var metadataTypeName: String = js.native
  
  var name: String = js.native
  
  var schema: String = js.native
  
  var urn: String = js.native
}
object ObjectMetadata {
  
  @scala.inline
  def apply(metadataType: MetadataType, metadataTypeName: String, name: String, schema: String, urn: String): ObjectMetadata = {
    val __obj = js.Dynamic.literal(metadataType = metadataType.asInstanceOf[js.Any], metadataTypeName = metadataTypeName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetadata]
  }
  
  @scala.inline
  implicit class ObjectMetadataMutableBuilder[Self <: ObjectMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadataType(value: MetadataType): Self = StObject.set(x, "metadataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataTypeName(value: String): Self = StObject.set(x, "metadataTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrn(value: String): Self = StObject.set(x, "urn", value.asInstanceOf[js.Any])
  }
}
