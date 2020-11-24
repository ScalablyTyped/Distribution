package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleLastUsed extends js.Object {
  
  /**
    * The date and time, in ISO 8601 date-time format that the role was last used. This field is null if the role has not been used within the IAM tracking period. For more information about the tracking period, see Regions Where Data Is Tracked in the IAM User Guide. 
    */
  var LastUsedDate: js.UndefOr[dateType] = js.native
  
  /**
    * The name of the AWS Region in which the role was last used.
    */
  var Region: js.UndefOr[stringType] = js.native
}
object RoleLastUsed {
  
  @scala.inline
  def apply(): RoleLastUsed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleLastUsed]
  }
  
  @scala.inline
  implicit class RoleLastUsedOps[Self <: RoleLastUsed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLastUsedDate(value: dateType): Self = this.set("LastUsedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUsedDate: Self = this.set("LastUsedDate", js.undefined)
    
    @scala.inline
    def setRegion(value: stringType): Self = this.set("Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
  }
}
