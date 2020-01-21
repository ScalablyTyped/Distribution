package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSchemaRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the development schema. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}

object DeleteSchemaRequest {
  @scala.inline
  def apply(SchemaArn: Arn): DeleteSchemaRequest = {
    val __obj = js.Dynamic.literal(SchemaArn = SchemaArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSchemaRequest]
  }
}

