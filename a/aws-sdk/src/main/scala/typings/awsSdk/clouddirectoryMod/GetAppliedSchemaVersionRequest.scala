package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppliedSchemaVersionRequest extends js.Object {
  /**
    * The ARN of the applied schema.
    */
  var SchemaArn: Arn = js.native
}

object GetAppliedSchemaVersionRequest {
  @scala.inline
  def apply(SchemaArn: Arn): GetAppliedSchemaVersionRequest = {
    val __obj = js.Dynamic.literal(SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppliedSchemaVersionRequest]
  }
}

