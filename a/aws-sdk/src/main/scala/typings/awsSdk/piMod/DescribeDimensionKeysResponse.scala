package typings.awsSdk.piMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDimensionKeysResponse extends StObject {
  
  /**
    * The end time for the returned dimension keys, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedEndTime will be greater than or equal to the value of the user-specified Endtime.
    */
  var AlignedEndTime: js.UndefOr[ISOTimestamp] = js.undefined
  
  /**
    * The start time for the returned dimension keys, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedStartTime will be less than or equal to the value of the user-specified StartTime.
    */
  var AlignedStartTime: js.UndefOr[ISOTimestamp] = js.undefined
  
  /**
    * The dimension keys that were requested.
    */
  var Keys: js.UndefOr[DimensionKeyDescriptionList] = js.undefined
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * If PartitionBy was present in the request, PartitionKeys contains the breakdown of dimension keys by the specified partitions.
    */
  var PartitionKeys: js.UndefOr[ResponsePartitionKeyList] = js.undefined
}
object DescribeDimensionKeysResponse {
  
  inline def apply(): DescribeDimensionKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDimensionKeysResponse]
  }
  
  extension [Self <: DescribeDimensionKeysResponse](x: Self) {
    
    inline def setAlignedEndTime(value: ISOTimestamp): Self = StObject.set(x, "AlignedEndTime", value.asInstanceOf[js.Any])
    
    inline def setAlignedEndTimeUndefined: Self = StObject.set(x, "AlignedEndTime", js.undefined)
    
    inline def setAlignedStartTime(value: ISOTimestamp): Self = StObject.set(x, "AlignedStartTime", value.asInstanceOf[js.Any])
    
    inline def setAlignedStartTimeUndefined: Self = StObject.set(x, "AlignedStartTime", js.undefined)
    
    inline def setKeys(value: DimensionKeyDescriptionList): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "Keys", js.undefined)
    
    inline def setKeysVarargs(value: DimensionKeyDescription*): Self = StObject.set(x, "Keys", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPartitionKeys(value: ResponsePartitionKeyList): Self = StObject.set(x, "PartitionKeys", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeysUndefined: Self = StObject.set(x, "PartitionKeys", js.undefined)
    
    inline def setPartitionKeysVarargs(value: ResponsePartitionKey*): Self = StObject.set(x, "PartitionKeys", js.Array(value :_*))
  }
}
