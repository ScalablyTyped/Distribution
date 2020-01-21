package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSchemaResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the created schema.
    */
  var schemaArn: js.UndefOr[Arn] = js.native
}

object CreateSchemaResponse {
  @scala.inline
  def apply(schemaArn: Arn = null): CreateSchemaResponse = {
    val __obj = js.Dynamic.literal()
    if (schemaArn != null) __obj.updateDynamic("schemaArn")(schemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSchemaResponse]
  }
}

