package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportDestination extends js.Object {
  
  /**
    * An object that contains the action of the import job towards a contact list.
    */
  var ContactListDestination: js.UndefOr[typings.awsSdk.sesv2Mod.ContactListDestination] = js.native
  
  /**
    * An object that contains the action of the import job towards suppression list.
    */
  var SuppressionListDestination: js.UndefOr[typings.awsSdk.sesv2Mod.SuppressionListDestination] = js.native
}
object ImportDestination {
  
  @scala.inline
  def apply(): ImportDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportDestination]
  }
  
  @scala.inline
  implicit class ImportDestinationOps[Self <: ImportDestination] (val x: Self) extends AnyVal {
    
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
    def setContactListDestination(value: ContactListDestination): Self = this.set("ContactListDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactListDestination: Self = this.set("ContactListDestination", js.undefined)
    
    @scala.inline
    def setSuppressionListDestination(value: SuppressionListDestination): Self = this.set("SuppressionListDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressionListDestination: Self = this.set("SuppressionListDestination", js.undefined)
  }
}
