package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSummary extends js.Object {
  
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
    * Tags associated with the schema.
    */
  var Tags: js.UndefOr[typings.awsSdk.schemasMod.Tags] = js.native
  
  /**
    * The number of versions available for the schema.
    */
  var VersionCount: js.UndefOr[long] = js.native
}
object SchemaSummary {
  
  @scala.inline
  def apply(): SchemaSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSummary]
  }
  
  @scala.inline
  implicit class SchemaSummaryOps[Self <: SchemaSummary] (val x: Self) extends AnyVal {
    
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
    def setLastModified(value: timestampIso8601): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
    
    @scala.inline
    def setSchemaArn(value: string): Self = this.set("SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaArn: Self = this.set("SchemaArn", js.undefined)
    
    @scala.inline
    def setSchemaName(value: string): Self = this.set("SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaName: Self = this.set("SchemaName", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setVersionCount(value: long): Self = this.set("VersionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionCount: Self = this.set("VersionCount", js.undefined)
  }
}
