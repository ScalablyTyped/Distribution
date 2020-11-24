package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttackVolumeStatistics extends js.Object {
  
  /**
    * The maximum attack volume observed for the given unit.
    */
  var Max: Double = js.native
}
object AttackVolumeStatistics {
  
  @scala.inline
  def apply(Max: Double): AttackVolumeStatistics = {
    val __obj = js.Dynamic.literal(Max = Max.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttackVolumeStatistics]
  }
  
  @scala.inline
  implicit class AttackVolumeStatisticsOps[Self <: AttackVolumeStatistics] (val x: Self) extends AnyVal {
    
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
    def setMax(value: Double): Self = this.set("Max", value.asInstanceOf[js.Any])
  }
}
