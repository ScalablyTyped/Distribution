package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDimensionResponse extends js.Object {
  /**
    * The ARN (Amazon resource name) of the created dimension.
    */
  var arn: js.UndefOr[DimensionArn] = js.native
  /**
    * A unique identifier for the dimension.
    */
  var name: js.UndefOr[DimensionName] = js.native
}

object CreateDimensionResponse {
  @scala.inline
  def apply(): CreateDimensionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDimensionResponse]
  }
  @scala.inline
  implicit class CreateDimensionResponseOps[Self <: CreateDimensionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: DimensionArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setName(value: DimensionName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

