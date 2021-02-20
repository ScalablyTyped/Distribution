package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDatasetGroupsResponse extends StObject {
  
  /**
    * An array of objects that summarize each dataset group's properties.
    */
  var DatasetGroups: js.UndefOr[typings.awsSdk.forecastserviceMod.DatasetGroups] = js.native
  
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.forecastserviceMod.NextToken] = js.native
}
object ListDatasetGroupsResponse {
  
  @scala.inline
  def apply(): ListDatasetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetGroupsResponse]
  }
  
  @scala.inline
  implicit class ListDatasetGroupsResponseMutableBuilder[Self <: ListDatasetGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetGroups(value: DatasetGroups): Self = StObject.set(x, "DatasetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetGroupsUndefined: Self = StObject.set(x, "DatasetGroups", js.undefined)
    
    @scala.inline
    def setDatasetGroupsVarargs(value: DatasetGroupSummary*): Self = StObject.set(x, "DatasetGroups", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
