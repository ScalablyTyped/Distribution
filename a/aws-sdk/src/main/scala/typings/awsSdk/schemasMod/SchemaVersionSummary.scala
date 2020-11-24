package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaVersionSummary extends js.Object {
  
  /**
    * The ARN of the schema version.
    */
  var SchemaArn: js.UndefOr[string] = js.native
  
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[string] = js.native
  
  /**
    * The version number of the schema.
    */
  var SchemaVersion: js.UndefOr[string] = js.native
  
  /**
    * The type of schema.
    */
  var Type: js.UndefOr[typings.awsSdk.schemasMod.Type] = js.native
}
object SchemaVersionSummary {
  
  @scala.inline
  def apply(): SchemaVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersionSummary]
  }
  
  @scala.inline
  implicit class SchemaVersionSummaryOps[Self <: SchemaVersionSummary] (val x: Self) extends AnyVal {
    
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
    def setSchemaArn(value: string): Self = this.set("SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaArn: Self = this.set("SchemaArn", js.undefined)
    
    @scala.inline
    def setSchemaName(value: string): Self = this.set("SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaName: Self = this.set("SchemaName", js.undefined)
    
    @scala.inline
    def setSchemaVersion(value: string): Self = this.set("SchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaVersion: Self = this.set("SchemaVersion", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
