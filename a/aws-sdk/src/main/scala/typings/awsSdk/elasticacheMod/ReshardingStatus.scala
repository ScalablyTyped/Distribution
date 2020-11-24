package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReshardingStatus extends js.Object {
  
  /**
    * Represents the progress of an online resharding operation.
    */
  var SlotMigration: js.UndefOr[typings.awsSdk.elasticacheMod.SlotMigration] = js.native
}
object ReshardingStatus {
  
  @scala.inline
  def apply(): ReshardingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReshardingStatus]
  }
  
  @scala.inline
  implicit class ReshardingStatusOps[Self <: ReshardingStatus] (val x: Self) extends AnyVal {
    
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
    def setSlotMigration(value: SlotMigration): Self = this.set("SlotMigration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotMigration: Self = this.set("SlotMigration", js.undefined)
  }
}
