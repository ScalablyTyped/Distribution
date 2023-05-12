package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsAggregator extends StObject {
  
  /**
    * Either a Range or Count aggregator for limiting an OpsData summary.
    */
  var AggregatorType: js.UndefOr[OpsAggregatorType] = js.undefined
  
  /**
    * A nested aggregator for viewing counts of OpsData.
    */
  var Aggregators: js.UndefOr[OpsAggregatorList] = js.undefined
  
  /**
    * The name of an OpsData attribute on which to limit the count of OpsData.
    */
  var AttributeName: js.UndefOr[OpsDataAttributeName] = js.undefined
  
  /**
    * The aggregator filters.
    */
  var Filters: js.UndefOr[OpsFilterList] = js.undefined
  
  /**
    * The data type name to use for viewing counts of OpsData.
    */
  var TypeName: js.UndefOr[OpsDataTypeName] = js.undefined
  
  /**
    * The aggregator value.
    */
  var Values: js.UndefOr[OpsAggregatorValueMap] = js.undefined
}
object OpsAggregator {
  
  inline def apply(): OpsAggregator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsAggregator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpsAggregator] (val x: Self) extends AnyVal {
    
    inline def setAggregatorType(value: OpsAggregatorType): Self = StObject.set(x, "AggregatorType", value.asInstanceOf[js.Any])
    
    inline def setAggregatorTypeUndefined: Self = StObject.set(x, "AggregatorType", js.undefined)
    
    inline def setAggregators(value: OpsAggregatorList): Self = StObject.set(x, "Aggregators", value.asInstanceOf[js.Any])
    
    inline def setAggregatorsUndefined: Self = StObject.set(x, "Aggregators", js.undefined)
    
    inline def setAggregatorsVarargs(value: OpsAggregator*): Self = StObject.set(x, "Aggregators", js.Array(value*))
    
    inline def setAttributeName(value: OpsDataAttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setFilters(value: OpsFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: OpsFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setTypeName(value: OpsDataTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    inline def setValues(value: OpsAggregatorValueMap): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
  }
}
