package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataBinInfo extends StObject {
  
  /* An array of all the pushpins that are in the data bin. */
  var containedPushpins: js.Array[Pushpin] = js.native
  
  /* A set of calculated metric values determined using the aggregationProperty value of all the pushpins contained in the data bin. */
  var metrics: IDataBinMetrics = js.native
}
object IDataBinInfo {
  
  @scala.inline
  def apply(containedPushpins: js.Array[Pushpin], metrics: IDataBinMetrics): IDataBinInfo = {
    val __obj = js.Dynamic.literal(containedPushpins = containedPushpins.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataBinInfo]
  }
  
  @scala.inline
  implicit class IDataBinInfoMutableBuilder[Self <: IDataBinInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainedPushpins(value: js.Array[Pushpin]): Self = StObject.set(x, "containedPushpins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainedPushpinsVarargs(value: Pushpin*): Self = StObject.set(x, "containedPushpins", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: IDataBinMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
  }
}
