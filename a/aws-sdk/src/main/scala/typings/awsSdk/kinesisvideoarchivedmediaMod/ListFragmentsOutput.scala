package typings.awsSdk.kinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFragmentsOutput extends StObject {
  
  /**
    * A list of archived Fragment objects from the stream that meet the selector criteria. Results are in no specific order, even across pages.
    */
  var Fragments: js.UndefOr[FragmentList] = js.undefined
  
  /**
    * If the returned list is truncated, the operation returns this token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.NextToken] = js.undefined
}
object ListFragmentsOutput {
  
  inline def apply(): ListFragmentsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFragmentsOutput]
  }
  
  extension [Self <: ListFragmentsOutput](x: Self) {
    
    inline def setFragments(value: FragmentList): Self = StObject.set(x, "Fragments", value.asInstanceOf[js.Any])
    
    inline def setFragmentsUndefined: Self = StObject.set(x, "Fragments", js.undefined)
    
    inline def setFragmentsVarargs(value: Fragment*): Self = StObject.set(x, "Fragments", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
