package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDataSharesResult extends StObject {
  
  /**
    * The results returned from describing datashares.
    */
  var DataShares: js.UndefOr[DataShareList] = js.undefined
  
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeDataShares request exceed the value specified in MaxRecords, Amazon Web Services returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DescribeDataSharesResult {
  
  inline def apply(): DescribeDataSharesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataSharesResult]
  }
  
  extension [Self <: DescribeDataSharesResult](x: Self) {
    
    inline def setDataShares(value: DataShareList): Self = StObject.set(x, "DataShares", value.asInstanceOf[js.Any])
    
    inline def setDataSharesUndefined: Self = StObject.set(x, "DataShares", js.undefined)
    
    inline def setDataSharesVarargs(value: DataShare*): Self = StObject.set(x, "DataShares", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
