package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSchemaVersionResponse extends StObject {
  
  /**
    * The date and time the schema version was created.
    */
  var CreatedTime: js.UndefOr[CreatedTimestamp] = js.undefined
  
  /**
    * The data format of the schema definition. Currently only AVRO is supported.
    */
  var DataFormat: js.UndefOr[typings.awsSdk.glueMod.DataFormat] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the schema.
    */
  var SchemaArn: js.UndefOr[GlueResourceArn] = js.undefined
  
  /**
    * The schema definition for the schema ID.
    */
  var SchemaDefinition: js.UndefOr[SchemaDefinitionString] = js.undefined
  
  /**
    * The SchemaVersionId of the schema version.
    */
  var SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined
  
  /**
    * The status of the schema version. 
    */
  var Status: js.UndefOr[SchemaVersionStatus] = js.undefined
  
  /**
    * The version number of the schema.
    */
  var VersionNumber: js.UndefOr[VersionLongNumber] = js.undefined
}
object GetSchemaVersionResponse {
  
  @scala.inline
  def apply(): GetSchemaVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSchemaVersionResponse]
  }
  
  @scala.inline
  implicit class GetSchemaVersionResponseMutableBuilder[Self <: GetSchemaVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTime(value: CreatedTimestamp): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDataFormat(value: DataFormat): Self = StObject.set(x, "DataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFormatUndefined: Self = StObject.set(x, "DataFormat", js.undefined)
    
    @scala.inline
    def setSchemaArn(value: GlueResourceArn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
    
    @scala.inline
    def setSchemaDefinition(value: SchemaDefinitionString): Self = StObject.set(x, "SchemaDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaDefinitionUndefined: Self = StObject.set(x, "SchemaDefinition", js.undefined)
    
    @scala.inline
    def setSchemaVersionId(value: SchemaVersionIdString): Self = StObject.set(x, "SchemaVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersionIdUndefined: Self = StObject.set(x, "SchemaVersionId", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: VersionLongNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
