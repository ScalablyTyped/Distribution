package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamNameCondition extends js.Object {
  /**
    * A comparison operator. Currently, you can specify only the BEGINS_WITH operator, which finds streams whose names start with a given prefix.
    */
  var ComparisonOperator: js.UndefOr[typings.awsSdk.kinesisvideoMod.ComparisonOperator] = js.native
  /**
    * A value to compare.
    */
  var ComparisonValue: js.UndefOr[StreamName] = js.native
}

object StreamNameCondition {
  @scala.inline
  def apply(): StreamNameCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamNameCondition]
  }
  @scala.inline
  implicit class StreamNameConditionOps[Self <: StreamNameCondition] (val x: Self) extends AnyVal {
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
    def setComparisonOperator(value: ComparisonOperator): Self = this.set("ComparisonOperator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparisonOperator: Self = this.set("ComparisonOperator", js.undefined)
    @scala.inline
    def setComparisonValue(value: StreamName): Self = this.set("ComparisonValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparisonValue: Self = this.set("ComparisonValue", js.undefined)
  }
  
}

