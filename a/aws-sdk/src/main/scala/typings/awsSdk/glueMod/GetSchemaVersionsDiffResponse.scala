package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSchemaVersionsDiffResponse extends js.Object {
  
  /**
    * The difference between schemas as a string in JsonPatch format.
    */
  var Diff: js.UndefOr[SchemaDefinitionDiff] = js.native
}
object GetSchemaVersionsDiffResponse {
  
  @scala.inline
  def apply(): GetSchemaVersionsDiffResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSchemaVersionsDiffResponse]
  }
  
  @scala.inline
  implicit class GetSchemaVersionsDiffResponseOps[Self <: GetSchemaVersionsDiffResponse] (val x: Self) extends AnyVal {
    
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
    def setDiff(value: SchemaDefinitionDiff): Self = this.set("Diff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiff: Self = this.set("Diff", js.undefined)
  }
}
