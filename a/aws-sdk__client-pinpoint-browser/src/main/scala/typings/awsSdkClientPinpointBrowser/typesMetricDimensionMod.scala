package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMetricDimensionMod {
  
  trait MetricDimension extends StObject {
    
    /**
      * The operator that you're using to compare metric values. Possible values: GREATER_THAN, LESS_THAN, GREATER_THAN_OR_EQUAL, LESS_THAN_OR_EQUAL, or EQUAL
      */
    var ComparisonOperator: js.UndefOr[String] = js.undefined
    
    /**
      * Value to be compared.
      */
    var Value: js.UndefOr[Double] = js.undefined
  }
  object MetricDimension {
    
    inline def apply(): MetricDimension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetricDimension]
    }
    
    extension [Self <: MetricDimension](x: Self) {
      
      inline def setComparisonOperator(value: String): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
      
      inline def setComparisonOperatorUndefined: Self = StObject.set(x, "ComparisonOperator", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    }
  }
  
  type UnmarshalledMetricDimension = MetricDimension
}
