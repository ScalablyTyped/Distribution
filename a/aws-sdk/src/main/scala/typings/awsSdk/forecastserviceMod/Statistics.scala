package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Statistics extends js.Object {
  
  /**
    * For a numeric field, the average value in the field.
    */
  var Avg: js.UndefOr[Double] = js.native
  
  /**
    * The number of values in the field.
    */
  var Count: js.UndefOr[Integer] = js.native
  
  /**
    * The number of distinct values in the field.
    */
  var CountDistinct: js.UndefOr[Integer] = js.native
  
  /**
    * The number of NAN (not a number) values in the field.
    */
  var CountNan: js.UndefOr[Integer] = js.native
  
  /**
    * The number of null values in the field.
    */
  var CountNull: js.UndefOr[Integer] = js.native
  
  /**
    * For a numeric field, the maximum value in the field.
    */
  var Max: js.UndefOr[String] = js.native
  
  /**
    * For a numeric field, the minimum value in the field.
    */
  var Min: js.UndefOr[String] = js.native
  
  /**
    * For a numeric field, the standard deviation.
    */
  var Stddev: js.UndefOr[Double] = js.native
}
object Statistics {
  
  @scala.inline
  def apply(): Statistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Statistics]
  }
  
  @scala.inline
  implicit class StatisticsOps[Self <: Statistics] (val x: Self) extends AnyVal {
    
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
    def setAvg(value: Double): Self = this.set("Avg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvg: Self = this.set("Avg", js.undefined)
    
    @scala.inline
    def setCount(value: Integer): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
    
    @scala.inline
    def setCountDistinct(value: Integer): Self = this.set("CountDistinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountDistinct: Self = this.set("CountDistinct", js.undefined)
    
    @scala.inline
    def setCountNan(value: Integer): Self = this.set("CountNan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountNan: Self = this.set("CountNan", js.undefined)
    
    @scala.inline
    def setCountNull(value: Integer): Self = this.set("CountNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountNull: Self = this.set("CountNull", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = this.set("Max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("Max", js.undefined)
    
    @scala.inline
    def setMin(value: String): Self = this.set("Min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("Min", js.undefined)
    
    @scala.inline
    def setStddev(value: Double): Self = this.set("Stddev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStddev: Self = this.set("Stddev", js.undefined)
  }
}
