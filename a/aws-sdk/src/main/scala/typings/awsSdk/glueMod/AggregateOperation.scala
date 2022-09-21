package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateOperation extends StObject {
  
  /**
    * Specifies the aggregation function to apply. Possible aggregation functions include: avg countDistinct, count, first, last, kurtosis, max, min, skewness, stddev_samp, stddev_pop, sum, sumDistinct, var_samp, var_pop
    */
  var AggFunc: AggFunction
  
  /**
    * Specifies the column on the data set on which the aggregation function will be applied.
    */
  var Column: EnclosedInStringProperties
}
object AggregateOperation {
  
  inline def apply(AggFunc: AggFunction, Column: EnclosedInStringProperties): AggregateOperation = {
    val __obj = js.Dynamic.literal(AggFunc = AggFunc.asInstanceOf[js.Any], Column = Column.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateOperation]
  }
  
  extension [Self <: AggregateOperation](x: Self) {
    
    inline def setAggFunc(value: AggFunction): Self = StObject.set(x, "AggFunc", value.asInstanceOf[js.Any])
    
    inline def setColumn(value: EnclosedInStringProperties): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setColumnVarargs(value: EnclosedInStringProperty*): Self = StObject.set(x, "Column", js.Array(value*))
  }
}
