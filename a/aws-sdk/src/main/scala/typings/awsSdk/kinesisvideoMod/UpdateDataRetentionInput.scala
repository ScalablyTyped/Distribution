package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDataRetentionInput extends js.Object {
  
  /**
    * The version of the stream whose retention period you want to change. To get the version, call either the DescribeStream or the ListStreams API.
    */
  var CurrentVersion: Version = js.native
  
  /**
    * The retention period, in hours. The value you specify replaces the current value. The maximum value for this parameter is 87600 (ten years).
    */
  var DataRetentionChangeInHours: typings.awsSdk.kinesisvideoMod.DataRetentionChangeInHours = js.native
  
  /**
    * Indicates whether you want to increase or decrease the retention period.
    */
  var Operation: UpdateDataRetentionOperation = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the stream whose retention period you want to change.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
  
  /**
    * The name of the stream whose retention period you want to change.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisvideoMod.StreamName] = js.native
}
object UpdateDataRetentionInput {
  
  @scala.inline
  def apply(
    CurrentVersion: Version,
    DataRetentionChangeInHours: DataRetentionChangeInHours,
    Operation: UpdateDataRetentionOperation
  ): UpdateDataRetentionInput = {
    val __obj = js.Dynamic.literal(CurrentVersion = CurrentVersion.asInstanceOf[js.Any], DataRetentionChangeInHours = DataRetentionChangeInHours.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataRetentionInput]
  }
  
  @scala.inline
  implicit class UpdateDataRetentionInputOps[Self <: UpdateDataRetentionInput] (val x: Self) extends AnyVal {
    
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
    def setCurrentVersion(value: Version): Self = this.set("CurrentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRetentionChangeInHours(value: DataRetentionChangeInHours): Self = this.set("DataRetentionChangeInHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: UpdateDataRetentionOperation): Self = this.set("Operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamARN(value: ResourceARN): Self = this.set("StreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamARN: Self = this.set("StreamARN", js.undefined)
    
    @scala.inline
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamName: Self = this.set("StreamName", js.undefined)
  }
}
