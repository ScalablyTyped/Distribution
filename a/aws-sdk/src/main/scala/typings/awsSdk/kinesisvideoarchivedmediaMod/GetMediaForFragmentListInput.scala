package typings.awsSdk.kinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMediaForFragmentListInput extends StObject {
  
  /**
    * A list of the numbers of fragments for which to retrieve media. You retrieve these values with ListFragments.
    */
  var Fragments: FragmentNumberList
  
  /**
    * The name of the stream from which to retrieve fragment media.
    */
  var StreamName: typings.awsSdk.kinesisvideoarchivedmediaMod.StreamName
}
object GetMediaForFragmentListInput {
  
  @scala.inline
  def apply(Fragments: FragmentNumberList, StreamName: StreamName): GetMediaForFragmentListInput = {
    val __obj = js.Dynamic.literal(Fragments = Fragments.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMediaForFragmentListInput]
  }
  
  @scala.inline
  implicit class GetMediaForFragmentListInputMutableBuilder[Self <: GetMediaForFragmentListInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFragments(value: FragmentNumberList): Self = StObject.set(x, "Fragments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentsVarargs(value: FragmentNumberString*): Self = StObject.set(x, "Fragments", js.Array(value :_*))
    
    @scala.inline
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
