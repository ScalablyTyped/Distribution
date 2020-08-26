package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EstimatedResourceSize extends js.Object {
  /**
    * The time when the estimate of the size of the resource was made.
    */
  var estimatedOn: js.UndefOr[Timestamp] = js.native
  /**
    * The estimated size of the resource in bytes.
    */
  var estimatedSizeInBytes: js.UndefOr[SizeInBytes] = js.native
}

object EstimatedResourceSize {
  @scala.inline
  def apply(): EstimatedResourceSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EstimatedResourceSize]
  }
  @scala.inline
  implicit class EstimatedResourceSizeOps[Self <: EstimatedResourceSize] (val x: Self) extends AnyVal {
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
    def setEstimatedOn(value: Timestamp): Self = this.set("estimatedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedOn: Self = this.set("estimatedOn", js.undefined)
    @scala.inline
    def setEstimatedSizeInBytes(value: SizeInBytes): Self = this.set("estimatedSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedSizeInBytes: Self = this.set("estimatedSizeInBytes", js.undefined)
  }
  
}

