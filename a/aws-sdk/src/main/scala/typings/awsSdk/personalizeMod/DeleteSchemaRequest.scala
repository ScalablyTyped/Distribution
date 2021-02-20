package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSchemaRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the schema to delete.
    */
  var schemaArn: Arn = js.native
}
object DeleteSchemaRequest {
  
  @scala.inline
  def apply(schemaArn: Arn): DeleteSchemaRequest = {
    val __obj = js.Dynamic.literal(schemaArn = schemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSchemaRequest]
  }
  
  @scala.inline
  implicit class DeleteSchemaRequestMutableBuilder[Self <: DeleteSchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = StObject.set(x, "schemaArn", value.asInstanceOf[js.Any])
  }
}
