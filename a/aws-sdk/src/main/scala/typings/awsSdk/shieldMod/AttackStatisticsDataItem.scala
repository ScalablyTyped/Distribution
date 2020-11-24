package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttackStatisticsDataItem extends js.Object {
  
  /**
    * The number of attacks detected during the time period. This is always present, but might be zero. 
    */
  var AttackCount: Long = js.native
  
  /**
    * Information about the volume of attacks during the time period. If the accompanying AttackCount is zero, this setting might be empty.
    */
  var AttackVolume: js.UndefOr[typings.awsSdk.shieldMod.AttackVolume] = js.native
}
object AttackStatisticsDataItem {
  
  @scala.inline
  def apply(AttackCount: Long): AttackStatisticsDataItem = {
    val __obj = js.Dynamic.literal(AttackCount = AttackCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttackStatisticsDataItem]
  }
  
  @scala.inline
  implicit class AttackStatisticsDataItemOps[Self <: AttackStatisticsDataItem] (val x: Self) extends AnyVal {
    
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
    def setAttackCount(value: Long): Self = this.set("AttackCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttackVolume(value: AttackVolume): Self = this.set("AttackVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttackVolume: Self = this.set("AttackVolume", js.undefined)
  }
}
