package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTableReplicaAutoScalingOutput extends js.Object {
  /**
    * Represents the auto scaling properties of the table.
    */
  var TableAutoScalingDescription: js.UndefOr[typings.awsSdk.dynamodbMod.TableAutoScalingDescription] = js.native
}

object DescribeTableReplicaAutoScalingOutput {
  @scala.inline
  def apply(): DescribeTableReplicaAutoScalingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTableReplicaAutoScalingOutput]
  }
  @scala.inline
  implicit class DescribeTableReplicaAutoScalingOutputOps[Self <: DescribeTableReplicaAutoScalingOutput] (val x: Self) extends AnyVal {
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
    def setTableAutoScalingDescription(value: TableAutoScalingDescription): Self = this.set("TableAutoScalingDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableAutoScalingDescription: Self = this.set("TableAutoScalingDescription", js.undefined)
  }
  
}

