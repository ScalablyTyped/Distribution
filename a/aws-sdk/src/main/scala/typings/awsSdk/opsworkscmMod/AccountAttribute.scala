package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountAttribute extends StObject {
  
  /**
    *  The maximum allowed value. 
    */
  var Maximum: js.UndefOr[Integer] = js.native
  
  /**
    *  The attribute name. The following are supported attribute names.     ServerLimit: The number of current servers/maximum number of servers allowed. By default, you can have a maximum of 10 servers.     ManualBackupLimit: The number of current manual backups/maximum number of backups allowed. By default, you can have a maximum of 50 manual backups saved.   
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    *  The current usage, such as the current number of servers that are associated with the account. 
    */
  var Used: js.UndefOr[Integer] = js.native
}
object AccountAttribute {
  
  @scala.inline
  def apply(): AccountAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAttribute]
  }
  
  @scala.inline
  implicit class AccountAttributeMutableBuilder[Self <: AccountAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximum(value: Integer): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumUndefined: Self = StObject.set(x, "Maximum", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setUsed(value: Integer): Self = StObject.set(x, "Used", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedUndefined: Self = StObject.set(x, "Used", js.undefined)
  }
}
