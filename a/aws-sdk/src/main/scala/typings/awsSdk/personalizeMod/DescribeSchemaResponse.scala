package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSchemaResponse extends js.Object {
  /**
    * The requested schema.
    */
  var schema: js.UndefOr[DatasetSchema] = js.native
}

object DescribeSchemaResponse {
  @scala.inline
  def apply(): DescribeSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSchemaResponse]
  }
  @scala.inline
  implicit class DescribeSchemaResponseOps[Self <: DescribeSchemaResponse] (val x: Self) extends AnyVal {
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
    def setSchema(value: DatasetSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
  
}

