package typings.awsSdk.cloudsearchdomainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldStats extends StObject {
  
  /**
    * The number of documents that contain a value in the specified field in the result set.
    */
  var count: js.UndefOr[Long] = js.undefined
  
  /**
    * The maximum value found in the specified field in the result set. If the field is numeric (int, int-array, double, or double-array), max is the string representation of a double-precision 64-bit floating point value. If the field is date or date-array, max is the string representation of a date with the format specified in IETF RFC3339: yyyy-mm-ddTHH:mm:ss.SSSZ.
    */
  var max: js.UndefOr[String] = js.undefined
  
  /**
    * The average of the values found in the specified field in the result set. If the field is numeric (int, int-array, double, or double-array), mean is the string representation of a double-precision 64-bit floating point value. If the field is date or date-array, mean is the string representation of a date with the format specified in IETF RFC3339: yyyy-mm-ddTHH:mm:ss.SSSZ.
    */
  var mean: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum value found in the specified field in the result set. If the field is numeric (int, int-array, double, or double-array), min is the string representation of a double-precision 64-bit floating point value. If the field is date or date-array, min is the string representation of a date with the format specified in IETF RFC3339: yyyy-mm-ddTHH:mm:ss.SSSZ.
    */
  var min: js.UndefOr[String] = js.undefined
  
  /**
    * The number of documents that do not contain a value in the specified field in the result set.
    */
  var missing: js.UndefOr[Long] = js.undefined
  
  /**
    * The standard deviation of the values in the specified field in the result set.
    */
  var stddev: js.UndefOr[Double] = js.undefined
  
  /**
    * The sum of the field values across the documents in the result set. null for date fields.
    */
  var sum: js.UndefOr[Double] = js.undefined
  
  /**
    * The sum of all field values in the result set squared.
    */
  var sumOfSquares: js.UndefOr[Double] = js.undefined
}
object FieldStats {
  
  @scala.inline
  def apply(): FieldStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldStats]
  }
  
  @scala.inline
  implicit class FieldStatsMutableBuilder[Self <: FieldStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMean(value: String): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
    
    @scala.inline
    def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMissing(value: Long): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    @scala.inline
    def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStddevUndefined: Self = StObject.set(x, "stddev", js.undefined)
    
    @scala.inline
    def setSum(value: Double): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumOfSquares(value: Double): Self = StObject.set(x, "sumOfSquares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumOfSquaresUndefined: Self = StObject.set(x, "sumOfSquares", js.undefined)
    
    @scala.inline
    def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
  }
}
