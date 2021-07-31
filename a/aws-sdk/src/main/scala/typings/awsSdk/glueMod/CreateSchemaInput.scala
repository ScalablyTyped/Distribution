package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSchemaInput extends StObject {
  
  /**
    * The compatibility mode of the schema. The possible values are:    NONE: No compatibility mode applies. You can use this choice in development scenarios or if you do not know the compatibility mode that you want to apply to schemas. Any new version added will be accepted without undergoing a compatibility check.    DISABLED: This compatibility choice prevents versioning for a particular schema. You can use this choice to prevent future versioning of a schema.    BACKWARD: This compatibility choice is recommended as it allows data receivers to read both the current and one previous schema version. This means that for instance, a new schema version cannot drop data fields or change the type of these fields, so they can't be read by readers using the previous version.    BACKWARD_ALL: This compatibility choice allows data receivers to read both the current and all previous schema versions. You can use this choice when you need to delete fields or add optional fields, and check compatibility against all previous schema versions.     FORWARD: This compatibility choice allows data receivers to read both the current and one next schema version, but not necessarily later versions. You can use this choice when you need to add fields or delete optional fields, but only check compatibility against the last schema version.    FORWARD_ALL: This compatibility choice allows data receivers to read written by producers of any new registered schema. You can use this choice when you need to add fields or delete optional fields, and check compatibility against all previous schema versions.    FULL: This compatibility choice allows data receivers to read data written by producers using the previous or next version of the schema, but not necessarily earlier or later versions. You can use this choice when you need to add or remove optional fields, but only check compatibility against the last schema version.    FULL_ALL: This compatibility choice allows data receivers to read data written by producers using all previous schema versions. You can use this choice when you need to add or remove optional fields, and check compatibility against all previous schema versions.  
    */
  var Compatibility: js.UndefOr[typings.awsSdk.glueMod.Compatibility] = js.undefined
  
  /**
    * The data format of the schema definition. Currently only AVRO is supported.
    */
  var DataFormat: typings.awsSdk.glueMod.DataFormat
  
  /**
    * An optional description of the schema. If description is not provided, there will not be any automatic default value for this.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    *  This is a wrapper shape to contain the registry identity fields. If this is not provided, the default registry will be used. The ARN format for the same will be: arn:aws:glue:us-east-2:&lt;customer id&gt;:registry/default-registry:random-5-letter-id.
    */
  var RegistryId: js.UndefOr[typings.awsSdk.glueMod.RegistryId] = js.undefined
  
  /**
    * The schema definition using the DataFormat setting for SchemaName.
    */
  var SchemaDefinition: js.UndefOr[SchemaDefinitionString] = js.undefined
  
  /**
    * Name of the schema to be created of max length of 255, and may only contain letters, numbers, hyphen, underscore, dollar sign, or hash mark. No whitespace.
    */
  var SchemaName: SchemaRegistryNameString
  
  /**
    * AWS tags that contain a key value pair and may be searched by console, command line, or API. If specified, follows the AWS tags-on-create pattern.
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
}
object CreateSchemaInput {
  
  @scala.inline
  def apply(DataFormat: DataFormat, SchemaName: SchemaRegistryNameString): CreateSchemaInput = {
    val __obj = js.Dynamic.literal(DataFormat = DataFormat.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSchemaInput]
  }
  
  @scala.inline
  implicit class CreateSchemaInputMutableBuilder[Self <: CreateSchemaInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompatibility(value: Compatibility): Self = StObject.set(x, "Compatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibilityUndefined: Self = StObject.set(x, "Compatibility", js.undefined)
    
    @scala.inline
    def setDataFormat(value: DataFormat): Self = StObject.set(x, "DataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = StObject.set(x, "RegistryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryIdUndefined: Self = StObject.set(x, "RegistryId", js.undefined)
    
    @scala.inline
    def setSchemaDefinition(value: SchemaDefinitionString): Self = StObject.set(x, "SchemaDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaDefinitionUndefined: Self = StObject.set(x, "SchemaDefinition", js.undefined)
    
    @scala.inline
    def setSchemaName(value: SchemaRegistryNameString): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagsMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
