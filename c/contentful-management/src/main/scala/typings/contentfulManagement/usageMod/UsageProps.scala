package typings.contentfulManagement.usageMod

import org.scalablytyped.runtime.StringDictionary
import typings.contentfulManagement.anon.EndAt
import typings.contentfulManagement.anon.MetaSysPropsorganizations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageProps extends js.Object {
  
  /**
    * Range of usage
    */
  var dateRange: EndAt = js.native
  
  /**
    * Type of usage
    */
  var metric: UsageMetricEnum = js.native
  
  /**
    * System metadata
    */
  var sys: MetaSysPropsorganizations = js.native
  
  /**
    * Unit of usage metric
    */
  var unitOfMeasure: String = js.native
  
  /**
    * Value of the usage
    */
  var usage: Double = js.native
  
  /**
    * Usage per day
    */
  var usagePerDay: StringDictionary[Double] = js.native
}
object UsageProps {
  
  @scala.inline
  def apply(
    dateRange: EndAt,
    metric: UsageMetricEnum,
    sys: MetaSysPropsorganizations,
    unitOfMeasure: String,
    usage: Double,
    usagePerDay: StringDictionary[Double]
  ): UsageProps = {
    val __obj = js.Dynamic.literal(dateRange = dateRange.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], unitOfMeasure = unitOfMeasure.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any], usagePerDay = usagePerDay.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageProps]
  }
  
  @scala.inline
  implicit class UsagePropsOps[Self <: UsageProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDateRange(value: EndAt): Self = this.set("dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetric(value: UsageMetricEnum): Self = this.set("metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSys(value: MetaSysPropsorganizations): Self = this.set("sys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitOfMeasure(value: String): Self = this.set("unitOfMeasure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsage(value: Double): Self = this.set("usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsagePerDay(value: StringDictionary[Double]): Self = this.set("usagePerDay", value.asInstanceOf[js.Any])
  }
}
