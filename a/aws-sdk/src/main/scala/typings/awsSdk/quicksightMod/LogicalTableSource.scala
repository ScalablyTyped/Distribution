package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogicalTableSource extends js.Object {
  /**
    * Specifies the result of a join of two logical tables.
    */
  var JoinInstruction: js.UndefOr[typings.awsSdk.quicksightMod.JoinInstruction] = js.native
  /**
    * Physical table ID.
    */
  var PhysicalTableId: js.UndefOr[typings.awsSdk.quicksightMod.PhysicalTableId] = js.native
}

object LogicalTableSource {
  @scala.inline
  def apply(): LogicalTableSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogicalTableSource]
  }
  @scala.inline
  implicit class LogicalTableSourceOps[Self <: LogicalTableSource] (val x: Self) extends AnyVal {
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
    def setJoinInstruction(value: JoinInstruction): Self = this.set("JoinInstruction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJoinInstruction: Self = this.set("JoinInstruction", js.undefined)
    @scala.inline
    def setPhysicalTableId(value: PhysicalTableId): Self = this.set("PhysicalTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhysicalTableId: Self = this.set("PhysicalTableId", js.undefined)
  }
  
}

