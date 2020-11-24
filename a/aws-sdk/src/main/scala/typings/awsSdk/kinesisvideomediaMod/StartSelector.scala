package typings.awsSdk.kinesisvideomediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSelector extends js.Object {
  
  /**
    * Specifies the fragment number from where you want the GetMedia API to start returning the fragments. 
    */
  var AfterFragmentNumber: js.UndefOr[FragmentNumberString] = js.native
  
  /**
    * Continuation token that Kinesis Video Streams returned in the previous GetMedia response. The GetMedia API then starts with the chunk identified by the continuation token.
    */
  var ContinuationToken: js.UndefOr[typings.awsSdk.kinesisvideomediaMod.ContinuationToken] = js.native
  
  /**
    * Identifies the fragment on the Kinesis video stream where you want to start getting the data from.   NOW - Start with the latest chunk on the stream.   EARLIEST - Start with earliest available chunk on the stream.   FRAGMENT_NUMBER - Start with the chunk after a specific fragment. You must also specify the AfterFragmentNumber parameter.   PRODUCER_TIMESTAMP or SERVER_TIMESTAMP - Start with the chunk containing a fragment with the specified producer or server timestamp. You specify the timestamp by adding StartTimestamp.    CONTINUATION_TOKEN - Read using the specified continuation token.     If you choose the NOW, EARLIEST, or CONTINUATION_TOKEN as the startSelectorType, you don't provide any additional information in the startSelector. 
    */
  var StartSelectorType: typings.awsSdk.kinesisvideomediaMod.StartSelectorType = js.native
  
  /**
    * A timestamp value. This value is required if you choose the PRODUCER_TIMESTAMP or the SERVER_TIMESTAMP as the startSelectorType. The GetMedia API then starts with the chunk containing the fragment that has the specified timestamp.
    */
  var StartTimestamp: js.UndefOr[Timestamp] = js.native
}
object StartSelector {
  
  @scala.inline
  def apply(StartSelectorType: StartSelectorType): StartSelector = {
    val __obj = js.Dynamic.literal(StartSelectorType = StartSelectorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSelector]
  }
  
  @scala.inline
  implicit class StartSelectorOps[Self <: StartSelector] (val x: Self) extends AnyVal {
    
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
    def setStartSelectorType(value: StartSelectorType): Self = this.set("StartSelectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterFragmentNumber(value: FragmentNumberString): Self = this.set("AfterFragmentNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterFragmentNumber: Self = this.set("AfterFragmentNumber", js.undefined)
    
    @scala.inline
    def setContinuationToken(value: ContinuationToken): Self = this.set("ContinuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuationToken: Self = this.set("ContinuationToken", js.undefined)
    
    @scala.inline
    def setStartTimestamp(value: Timestamp): Self = this.set("StartTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimestamp: Self = this.set("StartTimestamp", js.undefined)
  }
}
