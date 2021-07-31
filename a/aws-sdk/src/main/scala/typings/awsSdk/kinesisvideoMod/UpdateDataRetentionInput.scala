package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDataRetentionInput extends StObject {
  
  /**
    * The version of the stream whose retention period you want to change. To get the version, call either the DescribeStream or the ListStreams API.
    */
  var CurrentVersion: Version
  
  /**
    * The retention period, in hours. The value you specify replaces the current value. The maximum value for this parameter is 87600 (ten years).
    */
  var DataRetentionChangeInHours: typings.awsSdk.kinesisvideoMod.DataRetentionChangeInHours
  
  /**
    * Indicates whether you want to increase or decrease the retention period.
    */
  var Operation: UpdateDataRetentionOperation
  
  /**
    * The Amazon Resource Name (ARN) of the stream whose retention period you want to change.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the stream whose retention period you want to change.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisvideoMod.StreamName] = js.undefined
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
  implicit class UpdateDataRetentionInputMutableBuilder[Self <: UpdateDataRetentionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentVersion(value: Version): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRetentionChangeInHours(value: DataRetentionChangeInHours): Self = StObject.set(x, "DataRetentionChangeInHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: UpdateDataRetentionOperation): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    @scala.inline
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
