package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DesiredWeightAndCapacity extends js.Object {
  /**
    * The variant's capacity.
    */
  var DesiredInstanceCount: js.UndefOr[TaskCount] = js.native
  /**
    * The variant's weight.
    */
  var DesiredWeight: js.UndefOr[VariantWeight] = js.native
  /**
    * The name of the variant to update.
    */
  var VariantName: typings.awsSdk.sagemakerMod.VariantName = js.native
}

object DesiredWeightAndCapacity {
  @scala.inline
  def apply(VariantName: VariantName): DesiredWeightAndCapacity = {
    val __obj = js.Dynamic.literal(VariantName = VariantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesiredWeightAndCapacity]
  }
  @scala.inline
  implicit class DesiredWeightAndCapacityOps[Self <: DesiredWeightAndCapacity] (val x: Self) extends AnyVal {
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
    def setVariantName(value: VariantName): Self = this.set("VariantName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesiredInstanceCount(value: TaskCount): Self = this.set("DesiredInstanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredInstanceCount: Self = this.set("DesiredInstanceCount", js.undefined)
    @scala.inline
    def setDesiredWeight(value: VariantWeight): Self = this.set("DesiredWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredWeight: Self = this.set("DesiredWeight", js.undefined)
  }
  
}

