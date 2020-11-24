package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigSnapshotDeliveryProperties extends js.Object {
  
  /**
    * The frequency with which AWS Config delivers configuration snapshots.
    */
  var deliveryFrequency: js.UndefOr[MaximumExecutionFrequency] = js.native
}
object ConfigSnapshotDeliveryProperties {
  
  @scala.inline
  def apply(): ConfigSnapshotDeliveryProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigSnapshotDeliveryProperties]
  }
  
  @scala.inline
  implicit class ConfigSnapshotDeliveryPropertiesOps[Self <: ConfigSnapshotDeliveryProperties] (val x: Self) extends AnyVal {
    
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
    def setDeliveryFrequency(value: MaximumExecutionFrequency): Self = this.set("deliveryFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryFrequency: Self = this.set("deliveryFrequency", js.undefined)
  }
}
