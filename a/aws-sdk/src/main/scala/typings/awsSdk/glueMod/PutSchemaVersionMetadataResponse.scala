package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutSchemaVersionMetadataResponse extends js.Object {
  
  /**
    * The latest version of the schema.
    */
  var LatestVersion: js.UndefOr[LatestSchemaVersionBoolean] = js.native
  
  /**
    * The metadata key.
    */
  var MetadataKey: js.UndefOr[MetadataKeyString] = js.native
  
  /**
    * The value of the metadata key.
    */
  var MetadataValue: js.UndefOr[MetadataValueString] = js.native
  
  /**
    * The name for the registry.
    */
  var RegistryName: js.UndefOr[SchemaRegistryNameString] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the schema.
    */
  var SchemaArn: js.UndefOr[GlueResourceArn] = js.native
  
  /**
    * The name for the schema.
    */
  var SchemaName: js.UndefOr[SchemaRegistryNameString] = js.native
  
  /**
    * The unique version ID of the schema version.
    */
  var SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.native
  
  /**
    * The version number of the schema.
    */
  var VersionNumber: js.UndefOr[VersionLongNumber] = js.native
}
object PutSchemaVersionMetadataResponse {
  
  @scala.inline
  def apply(): PutSchemaVersionMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSchemaVersionMetadataResponse]
  }
  
  @scala.inline
  implicit class PutSchemaVersionMetadataResponseOps[Self <: PutSchemaVersionMetadataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLatestVersion(value: LatestSchemaVersionBoolean): Self = this.set("LatestVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestVersion: Self = this.set("LatestVersion", js.undefined)
    
    @scala.inline
    def setMetadataKey(value: MetadataKeyString): Self = this.set("MetadataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataKey: Self = this.set("MetadataKey", js.undefined)
    
    @scala.inline
    def setMetadataValue(value: MetadataValueString): Self = this.set("MetadataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataValue: Self = this.set("MetadataValue", js.undefined)
    
    @scala.inline
    def setRegistryName(value: SchemaRegistryNameString): Self = this.set("RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryName: Self = this.set("RegistryName", js.undefined)
    
    @scala.inline
    def setSchemaArn(value: GlueResourceArn): Self = this.set("SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaArn: Self = this.set("SchemaArn", js.undefined)
    
    @scala.inline
    def setSchemaName(value: SchemaRegistryNameString): Self = this.set("SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaName: Self = this.set("SchemaName", js.undefined)
    
    @scala.inline
    def setSchemaVersionId(value: SchemaVersionIdString): Self = this.set("SchemaVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaVersionId: Self = this.set("SchemaVersionId", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: VersionLongNumber): Self = this.set("VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionNumber: Self = this.set("VersionNumber", js.undefined)
  }
}
