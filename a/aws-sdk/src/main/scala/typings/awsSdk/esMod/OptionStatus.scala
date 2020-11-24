package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionStatus extends js.Object {
  
  /**
    * Timestamp which tells the creation date for the entity.
    */
  var CreationDate: UpdateTimestamp = js.native
  
  /**
    * Indicates whether the Elasticsearch domain is being deleted.
    */
  var PendingDeletion: js.UndefOr[Boolean] = js.native
  
  /**
    * Provides the OptionState for the Elasticsearch domain.
    */
  var State: OptionState = js.native
  
  /**
    * Timestamp which tells the last updated time for the entity.
    */
  var UpdateDate: UpdateTimestamp = js.native
  
  /**
    * Specifies the latest version for the entity.
    */
  var UpdateVersion: js.UndefOr[UIntValue] = js.native
}
object OptionStatus {
  
  @scala.inline
  def apply(CreationDate: UpdateTimestamp, State: OptionState, UpdateDate: UpdateTimestamp): OptionStatus = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], UpdateDate = UpdateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionStatus]
  }
  
  @scala.inline
  implicit class OptionStatusOps[Self <: OptionStatus] (val x: Self) extends AnyVal {
    
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
    def setCreationDate(value: UpdateTimestamp): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: OptionState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDate(value: UpdateTimestamp): Self = this.set("UpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingDeletion(value: Boolean): Self = this.set("PendingDeletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingDeletion: Self = this.set("PendingDeletion", js.undefined)
    
    @scala.inline
    def setUpdateVersion(value: UIntValue): Self = this.set("UpdateVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateVersion: Self = this.set("UpdateVersion", js.undefined)
  }
}
