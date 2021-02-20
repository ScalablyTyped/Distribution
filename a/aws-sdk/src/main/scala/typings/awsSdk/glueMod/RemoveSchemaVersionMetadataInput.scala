package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveSchemaVersionMetadataInput extends StObject {
  
  /**
    * The value of the metadata key.
    */
  var MetadataKeyValue: MetadataKeyValuePair = js.native
  
  /**
    * A wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
    */
  var SchemaId: js.UndefOr[typings.awsSdk.glueMod.SchemaId] = js.native
  
  /**
    * The unique version ID of the schema version.
    */
  var SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.native
  
  /**
    * The version number of the schema.
    */
  var SchemaVersionNumber: js.UndefOr[typings.awsSdk.glueMod.SchemaVersionNumber] = js.native
}
object RemoveSchemaVersionMetadataInput {
  
  @scala.inline
  def apply(MetadataKeyValue: MetadataKeyValuePair): RemoveSchemaVersionMetadataInput = {
    val __obj = js.Dynamic.literal(MetadataKeyValue = MetadataKeyValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveSchemaVersionMetadataInput]
  }
  
  @scala.inline
  implicit class RemoveSchemaVersionMetadataInputMutableBuilder[Self <: RemoveSchemaVersionMetadataInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadataKeyValue(value: MetadataKeyValuePair): Self = StObject.set(x, "MetadataKeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaId(value: SchemaId): Self = StObject.set(x, "SchemaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaIdUndefined: Self = StObject.set(x, "SchemaId", js.undefined)
    
    @scala.inline
    def setSchemaVersionId(value: SchemaVersionIdString): Self = StObject.set(x, "SchemaVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersionIdUndefined: Self = StObject.set(x, "SchemaVersionId", js.undefined)
    
    @scala.inline
    def setSchemaVersionNumber(value: SchemaVersionNumber): Self = StObject.set(x, "SchemaVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersionNumberUndefined: Self = StObject.set(x, "SchemaVersionNumber", js.undefined)
  }
}
