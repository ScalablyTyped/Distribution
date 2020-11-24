package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSchemaByDefinitionResponse extends js.Object {
  
  /**
    * The date and time the schema was created.
    */
  var CreatedTime: js.UndefOr[CreatedTimestamp] = js.native
  
  /**
    * The data format of the schema definition. Currently only AVRO is supported.
    */
  var DataFormat: js.UndefOr[typings.awsSdk.glueMod.DataFormat] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the schema.
    */
  var SchemaArn: js.UndefOr[GlueResourceArn] = js.native
  
  /**
    * The schema ID of the schema version.
    */
  var SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.native
  
  /**
    * The status of the schema version.
    */
  var Status: js.UndefOr[SchemaVersionStatus] = js.native
}
object GetSchemaByDefinitionResponse {
  
  @scala.inline
  def apply(): GetSchemaByDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSchemaByDefinitionResponse]
  }
  
  @scala.inline
  implicit class GetSchemaByDefinitionResponseOps[Self <: GetSchemaByDefinitionResponse] (val x: Self) extends AnyVal {
    
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
    def setDataFormat(value: DataFormat): Self = this.set("DataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFormat: Self = this.set("DataFormat", js.undefined)
    
    @scala.inline
    def setSchemaArn(value: GlueResourceArn): Self = this.set("SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaArn: Self = this.set("SchemaArn", js.undefined)
    
    @scala.inline
    def setSchemaVersionId(value: SchemaVersionIdString): Self = this.set("SchemaVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaVersionId: Self = this.set("SchemaVersionId", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaVersionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
