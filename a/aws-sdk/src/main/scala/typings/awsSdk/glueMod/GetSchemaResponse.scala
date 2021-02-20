package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSchemaResponse extends StObject {
  
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
  implicit class GetSchemaResponseMutableBuilder[Self <: GetSchemaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompatibility(value: Compatibility): Self = StObject.set(x, "Compatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibilityUndefined: Self = StObject.set(x, "Compatibility", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: CreatedTimestamp): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDataFormat(value: DataFormat): Self = StObject.set(x, "DataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFormatUndefined: Self = StObject.set(x, "DataFormat", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLatestSchemaVersion(value: VersionLongNumber): Self = StObject.set(x, "LatestSchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestSchemaVersionUndefined: Self = StObject.set(x, "LatestSchemaVersion", js.undefined)
    
    @scala.inline
    def setNextSchemaVersion(value: VersionLongNumber): Self = StObject.set(x, "NextSchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSchemaVersionUndefined: Self = StObject.set(x, "NextSchemaVersion", js.undefined)
    
    @scala.inline
    def setRegistryArn(value: GlueResourceArn): Self = StObject.set(x, "RegistryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryArnUndefined: Self = StObject.set(x, "RegistryArn", js.undefined)
    
    @scala.inline
    def setRegistryName(value: SchemaRegistryNameString): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
    
    @scala.inline
    def setSchemaArn(value: GlueResourceArn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
    
    @scala.inline
    def setSchemaCheckpoint(value: SchemaCheckpointNumber): Self = StObject.set(x, "SchemaCheckpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaCheckpointUndefined: Self = StObject.set(x, "SchemaCheckpoint", js.undefined)
    
    @scala.inline
    def setSchemaName(value: SchemaRegistryNameString): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaNameUndefined: Self = StObject.set(x, "SchemaName", js.undefined)
    
    @scala.inline
    def setSchemaStatus(value: SchemaStatus): Self = StObject.set(x, "SchemaStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaStatusUndefined: Self = StObject.set(x, "SchemaStatus", js.undefined)
    
    @scala.inline
    def setUpdatedTime(value: UpdatedTimestamp): Self = StObject.set(x, "UpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedTimeUndefined: Self = StObject.set(x, "UpdatedTime", js.undefined)
  }
}
