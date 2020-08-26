package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConstraintOutput extends js.Object {
  /**
    * Information about the constraint.
    */
  var ConstraintDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.ConstraintDetail] = js.native
  /**
    * The constraint parameters.
    */
  var ConstraintParameters: js.UndefOr[typings.awsSdk.servicecatalogMod.ConstraintParameters] = js.native
  /**
    * The status of the current request.
    */
  var Status: js.UndefOr[typings.awsSdk.servicecatalogMod.Status] = js.native
}

object CreateConstraintOutput {
  @scala.inline
  def apply(): CreateConstraintOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConstraintOutput]
  }
  @scala.inline
  implicit class CreateConstraintOutputOps[Self <: CreateConstraintOutput] (val x: Self) extends AnyVal {
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
    def setConstraintDetail(value: ConstraintDetail): Self = this.set("ConstraintDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraintDetail: Self = this.set("ConstraintDetail", js.undefined)
    @scala.inline
    def setConstraintParameters(value: ConstraintParameters): Self = this.set("ConstraintParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraintParameters: Self = this.set("ConstraintParameters", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

