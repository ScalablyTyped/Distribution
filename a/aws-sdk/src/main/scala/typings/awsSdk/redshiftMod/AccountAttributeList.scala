package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountAttributeList extends StObject {
  
  /**
    * A list of attributes assigned to an account.
    */
  var AccountAttributes: js.UndefOr[AttributeList] = js.native
}
object AccountAttributeList {
  
  @scala.inline
  def apply(): AccountAttributeList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAttributeList]
  }
  
  @scala.inline
  implicit class AccountAttributeListMutableBuilder[Self <: AccountAttributeList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountAttributes(value: AttributeList): Self = StObject.set(x, "AccountAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountAttributesUndefined: Self = StObject.set(x, "AccountAttributes", js.undefined)
    
    @scala.inline
    def setAccountAttributesVarargs(value: AccountAttribute*): Self = StObject.set(x, "AccountAttributes", js.Array(value :_*))
  }
}
