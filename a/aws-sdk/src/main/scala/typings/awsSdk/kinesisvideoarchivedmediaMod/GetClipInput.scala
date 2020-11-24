package typings.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetClipInput extends js.Object {
  
  /**
    * The time range of the requested clip and the source of the timestamps.
    */
  var ClipFragmentSelector: typings.awsSdk.kinesisvideoarchivedmediaMod.ClipFragmentSelector = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the stream for which to retrieve the media clip.  You must specify either the StreamName or the StreamARN. 
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
  
  /**
    * The name of the stream for which to retrieve the media clip.  You must specify either the StreamName or the StreamARN. 
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.StreamName] = js.native
}
object GetClipInput {
  
  @scala.inline
  def apply(ClipFragmentSelector: ClipFragmentSelector): GetClipInput = {
    val __obj = js.Dynamic.literal(ClipFragmentSelector = ClipFragmentSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClipInput]
  }
  
  @scala.inline
  implicit class GetClipInputOps[Self <: GetClipInput] (val x: Self) extends AnyVal {
    
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
    def setClipFragmentSelector(value: ClipFragmentSelector): Self = this.set("ClipFragmentSelector", value.asInstanceOf[js.Any])
    
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
