package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TumblingWindow extends StObject {
  
  /**
    * The time interval for the tumbling window. The interval time must be between 1 minute and 1 week. IoT SiteWise computes the 1w interval the end of Sunday at midnight each week (UTC), the 1d interval at the end of each day at midnight (UTC), the 1h interval at the end of each hour, and so on.  When IoT SiteWise aggregates data points for metric computations, the start of each interval is exclusive and the end of each interval is inclusive. IoT SiteWise places the computed data point at the end of the interval.
    */
  var interval: Interval
  
  /**
    * The offset for the tumbling window. The offset parameter accepts the following:   The offset time. For example, if you specify 18h for offset and 1d for interval, IoT SiteWise aggregates data in one of the following ways:   If you create the metric before or at 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) on the day when you create the metric.   If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) the next day.     The ISO 8601 format. For example, if you specify PT18H for offset and 1d for interval, IoT SiteWise aggregates data in one of the following ways:   If you create the metric before or at 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) on the day when you create the metric.   If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) the next day.     The 24-hour clock. For example, if you specify 00:03:00 for offset, 5m for interval, and you create the metric at 2 PM (UTC), you get the first aggregation result at 2:03 PM (UTC). You get the second aggregation result at 2:08 PM (UTC).    The offset time zone. For example, if you specify 2021-07-23T18:00-08 for offset and 1d for interval, IoT SiteWise aggregates data in one of the following ways:   If you create the metric before or at 6 PM (PST), you get the first aggregation result at 6 PM (PST) on the day when you create the metric.   If you create the metric after 6 PM (PST), you get the first aggregation result at 6 PM (PST) the next day.    
    */
  var offset: js.UndefOr[Offset] = js.undefined
}
object TumblingWindow {
  
  inline def apply(interval: Interval): TumblingWindow = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[TumblingWindow]
  }
  
  extension [Self <: TumblingWindow](x: Self) {
    
    inline def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
