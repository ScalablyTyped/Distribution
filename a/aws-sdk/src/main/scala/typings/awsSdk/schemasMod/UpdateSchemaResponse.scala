package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSchemaResponse extends StObject {
  
  /**
    * The description of the schema.
    */
  var Description: js.UndefOr[string] = js.native
  
  /**
    * The date and time that schema was modified.
    */
  var LastModified: js.UndefOr[timestampIso8601] = js.native
  
  /**
    * The ARN of the schema.
    */
  var SchemaArn: js.UndefOr[string] = js.native
  
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[string] = js.native
  
  /**
    * The version number of the schema
    */
  var SchemaVersion: js.UndefOr[string] = js.native
  
  var Tags: js.UndefOr[typings.awsSdk.schemasMod.Tags] = js.native
  
  /**
    * The type of the schema.
    */
  var Type: js.UndefOr[string] = js.native
  
  /**
    * The date the schema version was created.
    */
  var VersionCreatedDate: js.UndefOr[timestampIso8601] = js.native
}
object UpdateSchemaResponse {
  
  @scala.inline
  def apply(): UpdateSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSchemaResponse]
  }
  
  @scala.inline
  implicit class UpdateSchemaResponseMutableBuilder[Self <: UpdateSchemaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLastModified(value: timestampIso8601): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    @scala.inline
    def setSchemaArn(value: string): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
    
    @scala.inline
    def setSchemaName(value: string): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaNameUndefined: Self = StObject.set(x, "SchemaName", js.undefined)
    
    @scala.inline
    def setSchemaVersion(value: string): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersionUndefined: Self = StObject.set(x, "SchemaVersion", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setType(value: string): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setVersionCreatedDate(value: timestampIso8601): Self = StObject.set(x, "VersionCreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionCreatedDateUndefined: Self = StObject.set(x, "VersionCreatedDate", js.undefined)
  }
}
