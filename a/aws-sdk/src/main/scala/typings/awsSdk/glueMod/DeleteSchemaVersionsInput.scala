package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSchemaVersionsInput extends js.Object {
  
  /**
    * This is a wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
    */
  var SchemaId: typings.awsSdk.glueMod.SchemaId = js.native
  
  /**
    * A version range may be supplied which may be of the format:   a single version number, 5   a range, 5-8 : deletes versions 5, 6, 7, 8  
    */
  var Versions: VersionsString = js.native
}
object DeleteSchemaVersionsInput {
  
  @scala.inline
  def apply(SchemaId: SchemaId, Versions: VersionsString): DeleteSchemaVersionsInput = {
    val __obj = js.Dynamic.literal(SchemaId = SchemaId.asInstanceOf[js.Any], Versions = Versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSchemaVersionsInput]
  }
  
  @scala.inline
  implicit class DeleteSchemaVersionsInputOps[Self <: DeleteSchemaVersionsInput] (val x: Self) extends AnyVal {
    
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
    def setVersions(value: VersionsString): Self = this.set("Versions", value.asInstanceOf[js.Any])
  }
}
