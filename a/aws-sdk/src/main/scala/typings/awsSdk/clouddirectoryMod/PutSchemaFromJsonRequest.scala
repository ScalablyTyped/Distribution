package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutSchemaFromJsonRequest extends StObject {
  
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
  implicit class PutSchemaFromJsonRequestMutableBuilder[Self <: PutSchemaFromJsonRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: SchemaJsonDocument): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
  }
}
