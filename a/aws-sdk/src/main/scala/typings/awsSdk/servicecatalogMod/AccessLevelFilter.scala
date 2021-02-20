package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessLevelFilter extends StObject {
  
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
  implicit class AccessLevelFilterMutableBuilder[Self <: AccessLevelFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: AccessLevelFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setValue(value: AccessLevelFilterValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
