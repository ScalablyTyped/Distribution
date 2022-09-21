package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCostAndUsageWithResourcesResponse extends StObject {
  
  /**
    * The attributes that apply to a specific dimension value. For example, if the value is a linked account, the attribute is that account name.
    */
  var DimensionValueAttributes: js.UndefOr[DimensionValuesWithAttributesList] = js.undefined
  
  /**
    * The groups that are specified by the Filter or GroupBy parameters in the request.
    */
  var GroupDefinitions: js.UndefOr[typings.awsSdk.costexplorerMod.GroupDefinitions] = js.undefined
  
  /**
    * The token for the next set of retrievable results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.undefined
  
  /**
    * The time period that's covered by the results in the response.
    */
  var ResultsByTime: js.UndefOr[typings.awsSdk.costexplorerMod.ResultsByTime] = js.undefined
}
object GetCostAndUsageWithResourcesResponse {
  
  inline def apply(): GetCostAndUsageWithResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCostAndUsageWithResourcesResponse]
  }
  
  extension [Self <: GetCostAndUsageWithResourcesResponse](x: Self) {
    
    inline def setDimensionValueAttributes(value: DimensionValuesWithAttributesList): Self = StObject.set(x, "DimensionValueAttributes", value.asInstanceOf[js.Any])
    
    inline def setDimensionValueAttributesUndefined: Self = StObject.set(x, "DimensionValueAttributes", js.undefined)
    
    inline def setDimensionValueAttributesVarargs(value: DimensionValuesWithAttributes*): Self = StObject.set(x, "DimensionValueAttributes", js.Array(value*))
    
    inline def setGroupDefinitions(value: GroupDefinitions): Self = StObject.set(x, "GroupDefinitions", value.asInstanceOf[js.Any])
    
    inline def setGroupDefinitionsUndefined: Self = StObject.set(x, "GroupDefinitions", js.undefined)
    
    inline def setGroupDefinitionsVarargs(value: GroupDefinition*): Self = StObject.set(x, "GroupDefinitions", js.Array(value*))
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setResultsByTime(value: ResultsByTime): Self = StObject.set(x, "ResultsByTime", value.asInstanceOf[js.Any])
    
    inline def setResultsByTimeUndefined: Self = StObject.set(x, "ResultsByTime", js.undefined)
    
    inline def setResultsByTimeVarargs(value: ResultByTime*): Self = StObject.set(x, "ResultsByTime", js.Array(value*))
  }
}
