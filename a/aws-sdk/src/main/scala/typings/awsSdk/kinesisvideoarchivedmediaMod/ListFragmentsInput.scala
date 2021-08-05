package typings.awsSdk.kinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFragmentsInput extends StObject {
  
  /**
    * Describes the timestamp range and timestamp origin for the range of fragments to return.
    */
  var FragmentSelector: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.FragmentSelector] = js.undefined
  
  /**
    * The total number of fragments to return. If the total number of fragments available is more than the value specified in max-results, then a ListFragmentsOutput$NextToken is provided in the output that you can use to resume pagination.
    */
  var MaxResults: js.UndefOr[PageLimit] = js.undefined
  
  /**
    * A token to specify where to start paginating. This is the ListFragmentsOutput$NextToken from a previously truncated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.NextToken] = js.undefined
  
  /**
    * The name of the stream from which to retrieve a fragment list.
    */
  var StreamName: typings.awsSdk.kinesisvideoarchivedmediaMod.StreamName
}
object ListFragmentsInput {
  
  inline def apply(StreamName: StreamName): ListFragmentsInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFragmentsInput]
  }
  
  extension [Self <: ListFragmentsInput](x: Self) {
    
    inline def setFragmentSelector(value: FragmentSelector): Self = StObject.set(x, "FragmentSelector", value.asInstanceOf[js.Any])
    
    inline def setFragmentSelectorUndefined: Self = StObject.set(x, "FragmentSelector", js.undefined)
    
    inline def setMaxResults(value: PageLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
