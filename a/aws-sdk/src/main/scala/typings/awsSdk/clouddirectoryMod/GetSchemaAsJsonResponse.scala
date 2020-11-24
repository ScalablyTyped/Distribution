package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSchemaAsJsonResponse extends js.Object {
  
  /**
    * The JSON representation of the schema document.
    */
  var Document: js.UndefOr[SchemaJsonDocument] = js.native
  
  /**
    * The name of the retrieved schema.
    */
  var Name: js.UndefOr[SchemaName] = js.native
}
object GetSchemaAsJsonResponse {
  
  @scala.inline
  def apply(): GetSchemaAsJsonResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSchemaAsJsonResponse]
  }
  
  @scala.inline
  implicit class GetSchemaAsJsonResponseOps[Self <: GetSchemaAsJsonResponse] (val x: Self) extends AnyVal {
    
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
    def setDocument(value: SchemaJsonDocument): Self = this.set("Document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocument: Self = this.set("Document", js.undefined)
    
    @scala.inline
    def setName(value: SchemaName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
