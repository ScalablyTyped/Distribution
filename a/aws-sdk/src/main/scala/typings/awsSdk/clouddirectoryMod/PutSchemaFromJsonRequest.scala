package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

