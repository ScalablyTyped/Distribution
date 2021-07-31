package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttackStatisticsDataItem extends StObject {
  
  /**
    * The number of attacks detected during the time period. This is always present, but might be zero. 
    */
  var AttackCount: Long
  
  /**
    * Information about the volume of attacks during the time period. If the accompanying AttackCount is zero, this setting might be empty.
    */
  var AttackVolume: js.UndefOr[typings.awsSdk.shieldMod.AttackVolume] = js.undefined
}
object AttackStatisticsDataItem {
  
  @scala.inline
  def apply(AttackCount: Long): AttackStatisticsDataItem = {
    val __obj = js.Dynamic.literal(AttackCount = AttackCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttackStatisticsDataItem]
  }
  
  @scala.inline
  implicit class AttackStatisticsDataItemMutableBuilder[Self <: AttackStatisticsDataItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttackCount(value: Long): Self = StObject.set(x, "AttackCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttackVolume(value: AttackVolume): Self = StObject.set(x, "AttackVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttackVolumeUndefined: Self = StObject.set(x, "AttackVolume", js.undefined)
  }
}
