package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMetricDimensionMod {
  
  @js.native
  trait MetricDimension extends StObject {
    
    /**
      * The operator that you're using to compare metric values. Possible values: GREATER_THAN, LESS_THAN, GREATER_THAN_OR_EQUAL, LESS_THAN_OR_EQUAL, or EQUAL
      */
    var ComparisonOperator: js.UndefOr[String] = js.native
    
    /**
      * Value to be compared.
      */
    var Value: js.UndefOr[Double] = js.native
  }
  object MetricDimension {
    
    @scala.inline
    def apply(): MetricDimension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetricDimension]
    }
    
    @scala.inline
    implicit class MetricDimensionMutableBuilder[Self <: MetricDimension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComparisonOperator(value: String): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparisonOperatorUndefined: Self = StObject.set(x, "ComparisonOperator", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    }
  }
  
  type UnmarshalledMetricDimension = MetricDimension
}
