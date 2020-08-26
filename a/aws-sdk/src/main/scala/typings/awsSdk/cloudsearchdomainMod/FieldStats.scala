package typings.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldStats extends js.Object {
  /**
    * The number of documents that contain a value in the specified field in the result set.
    */
  var count: js.UndefOr[Long] = js.native
  /**
    * The maximum value found in the specified field in the result set. If the field is numeric (int, int-array, double, or double-array), max is the string representation of a double-precision 64-bit floating point value. If the field is date or date-array, max is the string representation of a date with the format specified in IETF RFC3339: yyyy-mm-ddTHH:mm:ss.SSSZ.
    */
  var max: js.UndefOr[String] = js.native
  /**
    * The average of the values found in the specified field in the result set. If the field is numeric (int, int-array, double, or double-array), mean is the string representation of a double-precision 64-bit floating point value. If the field is date or date-array, mean is the string representation of a date with the format specified in IETF RFC3339: yyyy-mm-ddTHH:mm:ss.SSSZ.
    */
  var mean: js.UndefOr[String] = js.native
  /**
    * The minimum value found in the specified field in the result set. If the field is numeric (int, int-array, double, or double-array), min is the string representation of a double-precision 64-bit floating point value. If the field is date or date-array, min is the string representation of a date with the format specified in IETF RFC3339: yyyy-mm-ddTHH:mm:ss.SSSZ.
    */
  var min: js.UndefOr[String] = js.native
  /**
    * The number of documents that do not contain a value in the specified field in the result set.
    */
  var missing: js.UndefOr[Long] = js.native
  /**
    * The standard deviation of the values in the specified field in the result set.
    */
  var stddev: js.UndefOr[Double] = js.native
  /**
    * The sum of the field values across the documents in the result set. null for date fields.
    */
  var sum: js.UndefOr[Double] = js.native
  /**
    * The sum of all field values in the result set squared.
    */
  var sumOfSquares: js.UndefOr[Double] = js.native
}

object FieldStats {
  @scala.inline
  def apply(): FieldStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldStats]
  }
  @scala.inline
  implicit class FieldStatsOps[Self <: FieldStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: Long): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMean(value: String): Self = this.set("mean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMean: Self = this.set("mean", js.undefined)
    @scala.inline
    def setMin(value: String): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMissing(value: Long): Self = this.set("missing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissing: Self = this.set("missing", js.undefined)
    @scala.inline
    def setStddev(value: Double): Self = this.set("stddev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStddev: Self = this.set("stddev", js.undefined)
    @scala.inline
    def setSum(value: Double): Self = this.set("sum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSum: Self = this.set("sum", js.undefined)
    @scala.inline
    def setSumOfSquares(value: Double): Self = this.set("sumOfSquares", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSumOfSquares: Self = this.set("sumOfSquares", js.undefined)
  }
  
}

