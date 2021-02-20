package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStatisticsResponse extends StObject {
  
  /**
    * The statistics returned by the Fleet Indexing service based on the query and aggregation field.
    */
  var statistics: js.UndefOr[Statistics] = js.native
}
object GetStatisticsResponse {
  
  @scala.inline
  def apply(): GetStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStatisticsResponse]
  }
  
  @scala.inline
  implicit class GetStatisticsResponseMutableBuilder[Self <: GetStatisticsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatistics(value: Statistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
  }
}
