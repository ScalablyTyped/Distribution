package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFindingStatisticsResponse extends StObject {
  
  /**
    * An array of objects, one for each group of findings that meet the filter criteria specified in the request.
    */
  var countsByGroup: js.UndefOr[listOfGroupCount] = js.undefined
}
object GetFindingStatisticsResponse {
  
  inline def apply(): GetFindingStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFindingStatisticsResponse]
  }
  
  extension [Self <: GetFindingStatisticsResponse](x: Self) {
    
    inline def setCountsByGroup(value: listOfGroupCount): Self = StObject.set(x, "countsByGroup", value.asInstanceOf[js.Any])
    
    inline def setCountsByGroupUndefined: Self = StObject.set(x, "countsByGroup", js.undefined)
    
    inline def setCountsByGroupVarargs(value: GroupCount*): Self = StObject.set(x, "countsByGroup", js.Array(value :_*))
  }
}
