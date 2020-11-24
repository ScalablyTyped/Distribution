package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Account extends js.Object {
  
  /**
    * Display information for the account
    */
  var displayInfo: AccountDisplayInfo = js.native
  
  /**
    * Indicates if the account needs refreshing
    */
  var isStale: Boolean = js.native
  
  /**
    * The key that identifies the account
    */
  var key: AccountKey = js.native
  
  /**
    * Custom properties stored with the account
    */
  var properties: js.Any = js.native
}
object Account {
  
  @scala.inline
  def apply(displayInfo: AccountDisplayInfo, isStale: Boolean, key: AccountKey, properties: js.Any): Account = {
    val __obj = js.Dynamic.literal(displayInfo = displayInfo.asInstanceOf[js.Any], isStale = isStale.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    
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
    def setDisplayInfo(value: AccountDisplayInfo): Self = this.set("displayInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStale(value: Boolean): Self = this.set("isStale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: AccountKey): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
}
