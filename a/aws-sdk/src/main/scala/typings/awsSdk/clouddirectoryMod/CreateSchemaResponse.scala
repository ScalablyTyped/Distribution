package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSchemaResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: js.UndefOr[Arn] = js.native
}

object CreateSchemaResponse {
  @scala.inline
  def apply(): CreateSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSchemaResponse]
  }
  @scala.inline
  implicit class CreateSchemaResponseOps[Self <: CreateSchemaResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSchemaArn(value: Arn): Self = this.set("SchemaArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaArn: Self = this.set("SchemaArn", js.undefined)
  }
  
}

