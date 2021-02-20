package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSchemaAsJsonRequest extends StObject {
  
  /**
    * The ARN of the schema to retrieve.
    */
  var SchemaArn: Arn = js.native
}
object GetSchemaAsJsonRequest {
  
  @scala.inline
  def apply(SchemaArn: Arn): GetSchemaAsJsonRequest = {
    val __obj = js.Dynamic.literal(SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSchemaAsJsonRequest]
  }
  
  @scala.inline
  implicit class GetSchemaAsJsonRequestMutableBuilder[Self <: GetSchemaAsJsonRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
  }
}
