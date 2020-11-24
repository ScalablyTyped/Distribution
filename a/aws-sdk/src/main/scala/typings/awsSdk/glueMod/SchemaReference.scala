package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaReference extends js.Object {
  
  /**
    * A structure that contains schema identity fields. Either this or the SchemaVersionId has to be provided.
    */
  var SchemaId: js.UndefOr[typings.awsSdk.glueMod.SchemaId] = js.native
  
  /**
    * The unique ID assigned to a version of the schema. Either this or the SchemaId has to be provided.
    */
  var SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.native
  
  /**
    * The version number of the schema.
    */
  var SchemaVersionNumber: js.UndefOr[VersionLongNumber] = js.native
}
object SchemaReference {
  
  @scala.inline
  def apply(): SchemaReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReference]
  }
  
  @scala.inline
  implicit class SchemaReferenceOps[Self <: SchemaReference] (val x: Self) extends AnyVal {
    
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
    def setSchemaId(value: SchemaId): Self = this.set("SchemaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaId: Self = this.set("SchemaId", js.undefined)
    
    @scala.inline
    def setSchemaVersionId(value: SchemaVersionIdString): Self = this.set("SchemaVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaVersionId: Self = this.set("SchemaVersionId", js.undefined)
    
    @scala.inline
    def setSchemaVersionNumber(value: VersionLongNumber): Self = this.set("SchemaVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaVersionNumber: Self = this.set("SchemaVersionNumber", js.undefined)
  }
}
