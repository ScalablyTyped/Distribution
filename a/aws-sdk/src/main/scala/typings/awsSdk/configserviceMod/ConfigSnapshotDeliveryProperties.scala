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
  
  @scala.inline
  def apply(): ConfigSnapshotDeliveryProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigSnapshotDeliveryProperties]
  }
  
  @scala.inline
  implicit class ConfigSnapshotDeliveryPropertiesMutableBuilder[Self <: ConfigSnapshotDeliveryProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryFrequency(value: MaximumExecutionFrequency): Self = StObject.set(x, "deliveryFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryFrequencyUndefined: Self = StObject.set(x, "deliveryFrequency", js.undefined)
  }
}
