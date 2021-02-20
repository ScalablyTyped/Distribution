package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaListItem extends StObject {
  
  /**
    * The date and time that a schema was created.
    */
  var CreatedTime: js.UndefOr[CreatedTimestamp] = js.native
  
  /**
    * A description for the schema.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    * the name of the registry where the schema resides.
    */
  var RegistryName: js.UndefOr[SchemaRegistryNameString] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the schema.
    */
  var SchemaArn: js.UndefOr[GlueResourceArn] = js.native
  
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[SchemaRegistryNameString] = js.native
  
  /**
    * The status of the schema.
    */
  var SchemaStatus: js.UndefOr[typings.awsSdk.glueMod.SchemaStatus] = js.native
  
  /**
    * The date and time that a schema was updated.
    */
  var UpdatedTime: js.UndefOr[UpdatedTimestamp] = js.native
}
object SchemaListItem {
  
  @scala.inline
  def apply(): SchemaListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListItem]
  }
  
  @scala.inline
  implicit class SchemaListItemMutableBuilder[Self <: SchemaListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTime(value: CreatedTimestamp): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setRegistryName(value: SchemaRegistryNameString): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
    
    @scala.inline
    def setSchemaArn(value: GlueResourceArn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
    
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
