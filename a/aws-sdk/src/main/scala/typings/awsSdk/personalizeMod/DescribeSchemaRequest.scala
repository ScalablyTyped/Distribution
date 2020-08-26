package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSchemaRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the schema to retrieve.
    */
  var schemaArn: Arn = js.native
}

object DescribeSchemaRequest {
  @scala.inline
  def apply(schemaArn: Arn): DescribeSchemaRequest = {
    val __obj = js.Dynamic.literal(schemaArn = schemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSchemaRequest]
  }
  @scala.inline
  implicit class DescribeSchemaRequestOps[Self <: DescribeSchemaRequest] (val x: Self) extends AnyVal {
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
    def setSchemaArn(value: Arn): Self = this.set("schemaArn", value.asInstanceOf[js.Any])
  }
  
}

