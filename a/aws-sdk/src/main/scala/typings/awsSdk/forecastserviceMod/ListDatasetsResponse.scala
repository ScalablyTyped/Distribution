package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDatasetsResponse extends StObject {
  
  /**
    * An array of objects that summarize each dataset's properties.
    */
  var Datasets: js.UndefOr[typings.awsSdk.forecastserviceMod.Datasets] = js.native
  
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.forecastserviceMod.NextToken] = js.native
}
object ListDatasetsResponse {
  
  @scala.inline
  def apply(): ListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetsResponse]
  }
  
  @scala.inline
  implicit class ListDatasetsResponseMutableBuilder[Self <: ListDatasetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasets(value: Datasets): Self = StObject.set(x, "Datasets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetsUndefined: Self = StObject.set(x, "Datasets", js.undefined)
    
    @scala.inline
    def setDatasetsVarargs(value: DatasetSummary*): Self = StObject.set(x, "Datasets", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
