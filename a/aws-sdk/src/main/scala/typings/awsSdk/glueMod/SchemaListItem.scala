package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaListItem extends js.Object {
  
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
  implicit class SchemaListItemOps[Self <: SchemaListItem] (val x: Self) extends AnyVal {
    
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
    def setCreatedTime(value: CreatedTimestamp): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
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
    def setSchemaStatus(value: SchemaStatus): Self = this.set("SchemaStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaStatus: Self = this.set("SchemaStatus", js.undefined)
    
    @scala.inline
    def setUpdatedTime(value: UpdatedTimestamp): Self = this.set("UpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedTime: Self = this.set("UpdatedTime", js.undefined)
  }
}
