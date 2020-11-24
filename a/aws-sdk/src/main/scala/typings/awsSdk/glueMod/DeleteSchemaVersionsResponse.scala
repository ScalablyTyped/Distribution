package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSchemaVersionsResponse extends js.Object {
  
  /**
    * A list of SchemaVersionErrorItem objects, each containing an error and schema version.
    */
  var SchemaVersionErrors: js.UndefOr[SchemaVersionErrorList] = js.native
}
object DeleteSchemaVersionsResponse {
  
  @scala.inline
  def apply(): DeleteSchemaVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSchemaVersionsResponse]
  }
  
  @scala.inline
  implicit class DeleteSchemaVersionsResponseOps[Self <: DeleteSchemaVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setSchemaVersionErrorsVarargs(value: SchemaVersionErrorItem*): Self = this.set("SchemaVersionErrors", js.Array(value :_*))
    
    @scala.inline
    def setSchemaVersionErrors(value: SchemaVersionErrorList): Self = this.set("SchemaVersionErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaVersionErrors: Self = this.set("SchemaVersionErrors", js.undefined)
  }
}
