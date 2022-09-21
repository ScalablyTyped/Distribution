package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOptOutListsResult extends StObject {
  
  /**
    * The token to be used for the next set of paginated results. If this field is empty then there are no more results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.NextToken] = js.undefined
  
  /**
    * An array of OptOutListInformation objects that contain the details for the requested OptOutLists.
    */
  var OptOutLists: js.UndefOr[OptOutListInformationList] = js.undefined
}
object DescribeOptOutListsResult {
  
  inline def apply(): DescribeOptOutListsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOptOutListsResult]
  }
  
  extension [Self <: DescribeOptOutListsResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOptOutLists(value: OptOutListInformationList): Self = StObject.set(x, "OptOutLists", value.asInstanceOf[js.Any])
    
    inline def setOptOutListsUndefined: Self = StObject.set(x, "OptOutLists", js.undefined)
    
    inline def setOptOutListsVarargs(value: OptOutListInformation*): Self = StObject.set(x, "OptOutLists", js.Array(value*))
  }
}
