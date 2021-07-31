package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetsResponse extends StObject {
  
  /**
    * An array of Dataset objects. Each object provides metadata information.
    */
  var datasets: js.UndefOr[Datasets] = js.undefined
  
  /**
    * A token for getting the next set of datasets (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
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
    def setDatasets(value: Datasets): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
    
    @scala.inline
    def setDatasetsVarargs(value: DatasetSummary*): Self = StObject.set(x, "datasets", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
