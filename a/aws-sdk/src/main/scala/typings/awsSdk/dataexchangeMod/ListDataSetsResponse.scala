package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDataSetsResponse extends StObject {
  
  /**
    * The data set objects listed by the request.
    */
  var DataSets: js.UndefOr[ListOfDataSetEntry] = js.native
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.dataexchangeMod.NextToken] = js.native
}
object ListDataSetsResponse {
  
  @scala.inline
  def apply(): ListDataSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataSetsResponse]
  }
  
  @scala.inline
  implicit class ListDataSetsResponseMutableBuilder[Self <: ListDataSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSets(value: ListOfDataSetEntry): Self = StObject.set(x, "DataSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetsUndefined: Self = StObject.set(x, "DataSets", js.undefined)
    
    @scala.inline
    def setDataSetsVarargs(value: DataSetEntry*): Self = StObject.set(x, "DataSets", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
