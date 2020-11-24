package typings.contentfulManagement.usageMod

import org.scalablytyped.runtime.StringDictionary
import typings.contentfulManagement.anon.EndAt
import typings.contentfulManagement.anon.MetaSysPropsorganizations
import typings.contentfulManagement.commonTypesMod.DefaultElements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Usage
  extends UsageProps
     with DefaultElements[UsageProps]
object Usage {
  
  @scala.inline
  def apply(
    dateRange: EndAt,
    metric: UsageMetricEnum,
    sys: MetaSysPropsorganizations,
    toPlainObject: () => UsageProps,
    unitOfMeasure: String,
    usage: Double,
    usagePerDay: StringDictionary[Double]
  ): Usage = {
    val __obj = js.Dynamic.literal(dateRange = dateRange.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), unitOfMeasure = unitOfMeasure.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any], usagePerDay = usagePerDay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Usage]
  }
}
