package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSchemaRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the development schema. For more information, see arns.
    */
  var SchemaArn: Arn
}
object DeleteSchemaRequest {
  
  @scala.inline
  def apply(SchemaArn: Arn): DeleteSchemaRequest = {
    val __obj = js.Dynamic.literal(SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSchemaRequest]
  }
  
  @scala.inline
  implicit class DeleteSchemaRequestMutableBuilder[Self <: DeleteSchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
  }
}
