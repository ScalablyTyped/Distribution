package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConformancePackStatusDetail extends js.Object {
  /**
    * Amazon Resource Name (ARN) of comformance pack.
    */
  var ConformancePackArn: typings.awsSdk.configserviceMod.ConformancePackArn = js.native
  /**
    * ID of the conformance pack.
    */
  var ConformancePackId: typings.awsSdk.configserviceMod.ConformancePackId = js.native
  /**
    * Name of the conformance pack.
    */
  var ConformancePackName: typings.awsSdk.configserviceMod.ConformancePackName = js.native
  /**
    * Indicates deployment status of conformance pack. AWS Config sets the state of the conformance pack to:   CREATE_IN_PROGRESS when a conformance pack creation is in progress for an account.   CREATE_COMPLETE when a conformance pack has been successfully created in your account.   CREATE_FAILED when a conformance pack creation failed in your account.   DELETE_IN_PROGRESS when a conformance pack deletion is in progress.    DELETE_FAILED when a conformance pack deletion failed in your account.  
    */
  var ConformancePackState: typings.awsSdk.configserviceMod.ConformancePackState = js.native
  /**
    * The reason of conformance pack creation failure.
    */
  var ConformancePackStatusReason: js.UndefOr[typings.awsSdk.configserviceMod.ConformancePackStatusReason] = js.native
  /**
    * Last time when conformation pack creation and update was successful.
    */
  var LastUpdateCompletedTime: js.UndefOr[Date] = js.native
  /**
    * Last time when conformation pack creation and update was requested.
    */
  var LastUpdateRequestedTime: Date = js.native
  /**
    * Amazon Resource Name (ARN) of AWS CloudFormation stack. 
    */
  var StackArn: typings.awsSdk.configserviceMod.StackArn = js.native
}

object ConformancePackStatusDetail {
  @scala.inline
  def apply(
    ConformancePackArn: ConformancePackArn,
    ConformancePackId: ConformancePackId,
    ConformancePackName: ConformancePackName,
    ConformancePackState: ConformancePackState,
    LastUpdateRequestedTime: Date,
    StackArn: StackArn
  ): ConformancePackStatusDetail = {
    val __obj = js.Dynamic.literal(ConformancePackArn = ConformancePackArn.asInstanceOf[js.Any], ConformancePackId = ConformancePackId.asInstanceOf[js.Any], ConformancePackName = ConformancePackName.asInstanceOf[js.Any], ConformancePackState = ConformancePackState.asInstanceOf[js.Any], LastUpdateRequestedTime = LastUpdateRequestedTime.asInstanceOf[js.Any], StackArn = StackArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackStatusDetail]
  }
  @scala.inline
  implicit class ConformancePackStatusDetailOps[Self <: ConformancePackStatusDetail] (val x: Self) extends AnyVal {
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
    def setConformancePackArn(value: ConformancePackArn): Self = this.set("ConformancePackArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setConformancePackId(value: ConformancePackId): Self = this.set("ConformancePackId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConformancePackName(value: ConformancePackName): Self = this.set("ConformancePackName", value.asInstanceOf[js.Any])
    @scala.inline
    def setConformancePackState(value: ConformancePackState): Self = this.set("ConformancePackState", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastUpdateRequestedTime(value: Date): Self = this.set("LastUpdateRequestedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackArn(value: StackArn): Self = this.set("StackArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setConformancePackStatusReason(value: ConformancePackStatusReason): Self = this.set("ConformancePackStatusReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConformancePackStatusReason: Self = this.set("ConformancePackStatusReason", js.undefined)
    @scala.inline
    def setLastUpdateCompletedTime(value: Date): Self = this.set("LastUpdateCompletedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateCompletedTime: Self = this.set("LastUpdateCompletedTime", js.undefined)
  }
  
}

