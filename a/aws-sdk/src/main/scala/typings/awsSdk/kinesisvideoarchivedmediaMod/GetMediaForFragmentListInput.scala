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
    * The Amazon Resource Name (ARN) of the stream from which to retrieve fragment media. Specify either this parameter or the StreamName parameter.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the stream from which to retrieve fragment media. Specify either this parameter or the StreamARN parameter.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.StreamName] = js.undefined
}
object GetMediaForFragmentListInput {
  
  inline def apply(Fragments: FragmentNumberList): GetMediaForFragmentListInput = {
    val __obj = js.Dynamic.literal(Fragments = Fragments.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMediaForFragmentListInput]
  }
  
  extension [Self <: GetMediaForFragmentListInput](x: Self) {
    
    inline def setFragments(value: FragmentNumberList): Self = StObject.set(x, "Fragments", value.asInstanceOf[js.Any])
    
    inline def setFragmentsVarargs(value: FragmentNumberString*): Self = StObject.set(x, "Fragments", js.Array(value*))
    
    inline def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
