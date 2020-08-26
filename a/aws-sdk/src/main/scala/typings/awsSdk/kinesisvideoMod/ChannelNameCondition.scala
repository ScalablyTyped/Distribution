package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelNameCondition extends js.Object {
  /**
    * A comparison operator. Currently, you can only specify the BEGINS_WITH operator, which finds signaling channels whose names begin with a given prefix.
    */
  var ComparisonOperator: js.UndefOr[typings.awsSdk.kinesisvideoMod.ComparisonOperator] = js.native
  /**
    * A value to compare.
    */
  var ComparisonValue: js.UndefOr[ChannelName] = js.native
}

object ChannelNameCondition {
  @scala.inline
  def apply(): ChannelNameCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelNameCondition]
  }
  @scala.inline
  implicit class ChannelNameConditionOps[Self <: ChannelNameCondition] (val x: Self) extends AnyVal {
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
    def setComparisonValue(value: ChannelName): Self = this.set("ComparisonValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparisonValue: Self = this.set("ComparisonValue", js.undefined)
  }
  
}

