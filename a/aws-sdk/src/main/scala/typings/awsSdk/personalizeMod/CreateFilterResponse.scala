package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFilterResponse extends js.Object {
  /**
    * The ARN of the new filter.
    */
  var filterArn: js.UndefOr[Arn] = js.native
}

object CreateFilterResponse {
  @scala.inline
  def apply(): CreateFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFilterResponse]
  }
  @scala.inline
  implicit class CreateFilterResponseOps[Self <: CreateFilterResponse] (val x: Self) extends AnyVal {
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
    def setFilterArn(value: Arn): Self = this.set("filterArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterArn: Self = this.set("filterArn", js.undefined)
  }
  
}

