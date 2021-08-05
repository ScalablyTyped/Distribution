package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigSnapshotDeliveryProperties extends StObject {
  
  /**
    * The frequency with which AWS Config delivers configuration snapshots.
    */
  var deliveryFrequency: js.UndefOr[MaximumExecutionFrequency] = js.undefined
}
object ConfigSnapshotDeliveryProperties {
  
  inline def apply(): ConfigSnapshotDeliveryProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigSnapshotDeliveryProperties]
  }
  
  extension [Self <: ConfigSnapshotDeliveryProperties](x: Self) {
    
    inline def setDeliveryFrequency(value: MaximumExecutionFrequency): Self = StObject.set(x, "deliveryFrequency", value.asInstanceOf[js.Any])
    
    inline def setDeliveryFrequencyUndefined: Self = StObject.set(x, "deliveryFrequency", js.undefined)
  }
}
