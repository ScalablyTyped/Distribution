package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttackVolume extends js.Object {
  
  /**
    * A statistics object that uses bits per second as the unit. This is included for network level attacks. 
    */
  var BitsPerSecond: js.UndefOr[AttackVolumeStatistics] = js.native
  
  /**
    * A statistics object that uses packets per second as the unit. This is included for network level attacks. 
    */
  var PacketsPerSecond: js.UndefOr[AttackVolumeStatistics] = js.native
  
  /**
    * A statistics object that uses requests per second as the unit. This is included for application level attacks, and is only available for accounts that are subscribed to Shield Advanced.
    */
  var RequestsPerSecond: js.UndefOr[AttackVolumeStatistics] = js.native
}
object AttackVolume {
  
  @scala.inline
  def apply(): AttackVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttackVolume]
  }
  
  @scala.inline
  implicit class AttackVolumeOps[Self <: AttackVolume] (val x: Self) extends AnyVal {
    
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
    def setBitsPerSecond(value: AttackVolumeStatistics): Self = this.set("BitsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitsPerSecond: Self = this.set("BitsPerSecond", js.undefined)
    
    @scala.inline
    def setPacketsPerSecond(value: AttackVolumeStatistics): Self = this.set("PacketsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePacketsPerSecond: Self = this.set("PacketsPerSecond", js.undefined)
    
    @scala.inline
    def setRequestsPerSecond(value: AttackVolumeStatistics): Self = this.set("RequestsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestsPerSecond: Self = this.set("RequestsPerSecond", js.undefined)
  }
}
