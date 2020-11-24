package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessLevelFilter extends js.Object {
  
  /**
    * The access level.    Account - Filter results based on the account.    Role - Filter results based on the federated role of the specified user.    User - Filter results based on the specified user.  
    */
  var Key: js.UndefOr[AccessLevelFilterKey] = js.native
  
  /**
    * The user to which the access level applies. The only supported value is Self.
    */
  var Value: js.UndefOr[AccessLevelFilterValue] = js.native
}
object AccessLevelFilter {
  
  @scala.inline
  def apply(): AccessLevelFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessLevelFilter]
  }
  
  @scala.inline
  implicit class AccessLevelFilterOps[Self <: AccessLevelFilter] (val x: Self) extends AnyVal {
    
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
    def setKey(value: AccessLevelFilterKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    
    @scala.inline
    def setValue(value: AccessLevelFilterValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
