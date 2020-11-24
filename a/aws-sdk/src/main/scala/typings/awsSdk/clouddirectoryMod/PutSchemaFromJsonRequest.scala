package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutSchemaFromJsonRequest extends js.Object {
  
  /**
    * The replacement JSON schema.
    */
  var Document: SchemaJsonDocument = js.native
  
  /**
    * The ARN of the schema to update.
    */
  var SchemaArn: Arn = js.native
}
object PutSchemaFromJsonRequest {
  
  @scala.inline
  def apply(Document: SchemaJsonDocument, SchemaArn: Arn): PutSchemaFromJsonRequest = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSchemaFromJsonRequest]
  }
  
  @scala.inline
  implicit class PutSchemaFromJsonRequestOps[Self <: PutSchemaFromJsonRequest] (val x: Self) extends AnyVal {
    
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
    def setSchemaArn(value: Arn): Self = this.set("SchemaArn", value.asInstanceOf[js.Any])
  }
}
