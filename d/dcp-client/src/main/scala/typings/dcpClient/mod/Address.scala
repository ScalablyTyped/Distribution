package typings.dcpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var account: String
}
object Address {
  
  inline def apply(account: String): Address = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
  }
}
