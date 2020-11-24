package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSchemaResponse extends js.Object {
  
  /**
    * The compatibility mode of the schema.
    */
  var Compatibility: js.UndefOr[typings.awsSdk.glueMod.Compatibility] = js.native
  
  /**
    * The date and time the schema was created.
    */
  var CreatedTime: js.UndefOr[CreatedTimestamp] = js.native
  
  /**
    * The data format of the schema definition. Currently only AVRO is supported.
    */
  var DataFormat: js.UndefOr[typings.awsSdk.glueMod.DataFormat] = js.native
  
  /**
    * A description of schema if specified when created
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    * The latest version of the schema associated with the returned schema definition.
    */
  var LatestSchemaVersion: js.UndefOr[VersionLongNumber] = js.native
  
  /**
    * The next version of the schema associated with the returned schema definition.
    */
  var NextSchemaVersion: js.UndefOr[VersionLongNumber] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the registry.
    */
  var RegistryArn: js.UndefOr[GlueResourceArn] = js.native
  
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[SchemaRegistryNameString] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the schema.
    */
  var SchemaArn: js.UndefOr[GlueResourceArn] = js.native
  
  /**
    * The version number of the checkpoint (the last time the compatibility mode was changed).
    */
  var SchemaCheckpoint: js.UndefOr[SchemaCheckpointNumber] = js.native
  
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[SchemaRegistryNameString] = js.native
  
  /**
    * The status of the schema.
    */
  var SchemaStatus: js.UndefOr[typings.awsSdk.glueMod.SchemaStatus] = js.native
  
  /**
    * The date and time the schema was updated.
    */
  var UpdatedTime: js.UndefOr[UpdatedTimestamp] = js.native
}
object GetSchemaResponse {
  
  @scala.inline
  def apply(): GetSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSchemaResponse]
  }
  
  @scala.inline
  implicit class GetSchemaResponseOps[Self <: GetSchemaResponse] (val x: Self) extends AnyVal {
    
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
    def setCompatibility(value: Compatibility): Self = this.set("Compatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibility: Self = this.set("Compatibility", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: CreatedTimestamp): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setDataFormat(value: DataFormat): Self = this.set("DataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFormat: Self = this.set("DataFormat", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setLatestSchemaVersion(value: VersionLongNumber): Self = this.set("LatestSchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestSchemaVersion: Self = this.set("LatestSchemaVersion", js.undefined)
    
    @scala.inline
    def setNextSchemaVersion(value: VersionLongNumber): Self = this.set("NextSchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextSchemaVersion: Self = this.set("NextSchemaVersion", js.undefined)
    
    @scala.inline
    def setRegistryArn(value: GlueResourceArn): Self = this.set("RegistryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryArn: Self = this.set("RegistryArn", js.undefined)
    
    @scala.inline
    def setRegistryName(value: SchemaRegistryNameString): Self = this.set("RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryName: Self = this.set("RegistryName", js.undefined)
    
    @scala.inline
    def setSchemaArn(value: GlueResourceArn): Self = this.set("SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaArn: Self = this.set("SchemaArn", js.undefined)
    
    @scala.inline
    def setSchemaCheckpoint(value: SchemaCheckpointNumber): Self = this.set("SchemaCheckpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaCheckpoint: Self = this.set("SchemaCheckpoint", js.undefined)
    
    @scala.inline
    def setSchemaName(value: SchemaRegistryNameString): Self = this.set("SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaName: Self = this.set("SchemaName", js.undefined)
    
    @scala.inline
    def setSchemaStatus(value: SchemaStatus): Self = this.set("SchemaStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaStatus: Self = this.set("SchemaStatus", js.undefined)
    
    @scala.inline
    def setUpdatedTime(value: UpdatedTimestamp): Self = this.set("UpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedTime: Self = this.set("UpdatedTime", js.undefined)
  }
}
