package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSchemaAsJsonRequest extends js.Object {
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
}

