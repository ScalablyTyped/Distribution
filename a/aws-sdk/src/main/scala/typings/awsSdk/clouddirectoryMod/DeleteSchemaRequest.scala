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
  @scala.inline
  implicit class DeleteSchemaRequestOps[Self <: DeleteSchemaRequest] (val x: Self) extends AnyVal {
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
  }
  
}

