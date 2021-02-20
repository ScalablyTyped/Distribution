package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFindingStatisticsResponse extends StObject {
  
  /**
    * An array of objects, one for each group of findings that meet the filter criteria specified in the request.
    */
  var countsByGroup: js.UndefOr[listOfGroupCount] = js.native
}
object GetFindingStatisticsResponse {
  
  @scala.inline
  def apply(): GetFindingStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFindingStatisticsResponse]
  }
  
  @scala.inline
  implicit class GetFindingStatisticsResponseMutableBuilder[Self <: GetFindingStatisticsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountsByGroup(value: listOfGroupCount): Self = StObject.set(x, "countsByGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountsByGroupUndefined: Self = StObject.set(x, "countsByGroup", js.undefined)
    
    @scala.inline
    def setCountsByGroupVarargs(value: GroupCount*): Self = StObject.set(x, "countsByGroup", js.Array(value :_*))
  }
}
