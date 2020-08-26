package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EstimateTemplateCostOutput extends js.Object {
  /**
    * An AWS Simple Monthly Calculator URL with a query string that describes the resources required to run the template.
    */
  var Url: js.UndefOr[typings.awsSdk.cloudformationMod.Url] = js.native
}

object EstimateTemplateCostOutput {
  @scala.inline
  def apply(): EstimateTemplateCostOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EstimateTemplateCostOutput]
  }
  @scala.inline
  implicit class EstimateTemplateCostOutputOps[Self <: EstimateTemplateCostOutput] (val x: Self) extends AnyVal {
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
    def setUrl(value: Url): Self = this.set("Url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
  
}

