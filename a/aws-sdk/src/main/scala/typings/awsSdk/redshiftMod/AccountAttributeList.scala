package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountAttributeList extends StObject {
  
  /**
    * A list of attributes assigned to an account.
    */
  var AccountAttributes: js.UndefOr[AttributeList] = js.undefined
}
object AccountAttributeList {
  
  inline def apply(): AccountAttributeList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAttributeList]
  }
  
  extension [Self <: AccountAttributeList](x: Self) {
    
    inline def setAccountAttributes(value: AttributeList): Self = StObject.set(x, "AccountAttributes", value.asInstanceOf[js.Any])
    
    inline def setAccountAttributesUndefined: Self = StObject.set(x, "AccountAttributes", js.undefined)
    
    inline def setAccountAttributesVarargs(value: AccountAttribute*): Self = StObject.set(x, "AccountAttributes", js.Array(value :_*))
  }
}
