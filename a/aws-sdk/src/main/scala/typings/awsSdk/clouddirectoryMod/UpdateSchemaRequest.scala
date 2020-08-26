package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSchemaRequest extends js.Object {
  /**
    * The name of the schema.
    */
  var Name: SchemaName = js.native
  /**
    * The Amazon Resource Name (ARN) of the development schema. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}

object UpdateSchemaRequest {
  @scala.inline
  def apply(Name: SchemaName, SchemaArn: Arn): UpdateSchemaRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSchemaRequest]
  }
  @scala.inline
  implicit class UpdateSchemaRequestOps[Self <: UpdateSchemaRequest] (val x: Self) extends AnyVal {
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
    def setName(value: SchemaName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemaArn(value: Arn): Self = this.set("SchemaArn", value.asInstanceOf[js.Any])
  }
  
}

