package typings.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMediaForFragmentListInput extends js.Object {
  
  /**
    * A list of the numbers of fragments for which to retrieve media. You retrieve these values with ListFragments.
    */
  var Fragments: FragmentNumberList = js.native
  
  /**
    * The name of the stream from which to retrieve fragment media.
    */
  var StreamName: typings.awsSdk.kinesisvideoarchivedmediaMod.StreamName = js.native
}
object GetMediaForFragmentListInput {
  
  @scala.inline
  def apply(Fragments: FragmentNumberList, StreamName: StreamName): GetMediaForFragmentListInput = {
    val __obj = js.Dynamic.literal(Fragments = Fragments.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMediaForFragmentListInput]
  }
  
  @scala.inline
  implicit class GetMediaForFragmentListInputOps[Self <: GetMediaForFragmentListInput] (val x: Self) extends AnyVal {
    
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
    def setFragmentsVarargs(value: FragmentNumberString*): Self = this.set("Fragments", js.Array(value :_*))
    
    @scala.inline
    def setFragments(value: FragmentNumberList): Self = this.set("Fragments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
  }
}
