package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataBinInfo extends StObject {
  
  /* An array of all the pushpins that are in the data bin. */
  var containedPushpins: js.Array[Pushpin]
  
  /* A set of calculated metric values determined using the aggregationProperty value of all the pushpins contained in the data bin. */
  var metrics: IDataBinMetrics
}
object IDataBinInfo {
  
  inline def apply(containedPushpins: js.Array[Pushpin], metrics: IDataBinMetrics): IDataBinInfo = {
    val __obj = js.Dynamic.literal(containedPushpins = containedPushpins.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataBinInfo]
  }
  
  extension [Self <: IDataBinInfo](x: Self) {
    
    inline def setContainedPushpins(value: js.Array[Pushpin]): Self = StObject.set(x, "containedPushpins", value.asInstanceOf[js.Any])
    
    inline def setContainedPushpinsVarargs(value: Pushpin*): Self = StObject.set(x, "containedPushpins", js.Array(value :_*))
    
    inline def setMetrics(value: IDataBinMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
  }
}
