package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConformancePackStatusDetail extends StObject {
  
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
  implicit class ConformancePackStatusDetailMutableBuilder[Self <: ConformancePackStatusDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConformancePackArn(value: ConformancePackArn): Self = StObject.set(x, "ConformancePackArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackId(value: ConformancePackId): Self = StObject.set(x, "ConformancePackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackName(value: ConformancePackName): Self = StObject.set(x, "ConformancePackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackState(value: ConformancePackState): Self = StObject.set(x, "ConformancePackState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackStatusReason(value: ConformancePackStatusReason): Self = StObject.set(x, "ConformancePackStatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackStatusReasonUndefined: Self = StObject.set(x, "ConformancePackStatusReason", js.undefined)
    
    @scala.inline
    def setLastUpdateCompletedTime(value: Date): Self = StObject.set(x, "LastUpdateCompletedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateCompletedTimeUndefined: Self = StObject.set(x, "LastUpdateCompletedTime", js.undefined)
    
    @scala.inline
    def setLastUpdateRequestedTime(value: Date): Self = StObject.set(x, "LastUpdateRequestedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackArn(value: StackArn): Self = StObject.set(x, "StackArn", value.asInstanceOf[js.Any])
  }
}
