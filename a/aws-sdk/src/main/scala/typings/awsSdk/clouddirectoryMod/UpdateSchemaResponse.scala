package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSchemaResponse extends js.Object {
  /**
    * The ARN that is associated with the updated schema. For more information, see arns.
    */
  var SchemaArn: js.UndefOr[Arn] = js.native
}

object UpdateSchemaResponse {
  @scala.inline
  def apply(SchemaArn: Arn = null): UpdateSchemaResponse = {
    val __obj = js.Dynamic.literal()
    if (SchemaArn != null) __obj.updateDynamic("SchemaArn")(SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSchemaResponse]
  }
}

