package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateServiceRoleFromAccountResponse extends StObject {
  
  /**
    * The time when the service role was disassociated from IoT Greengrass for your Amazon Web Services account in this Amazon Web Services Region.
    */
  var disassociatedAt: js.UndefOr[String] = js.undefined
}
object DisassociateServiceRoleFromAccountResponse {
  
  inline def apply(): DisassociateServiceRoleFromAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateServiceRoleFromAccountResponse]
  }
  
  extension [Self <: DisassociateServiceRoleFromAccountResponse](x: Self) {
    
    inline def setDisassociatedAt(value: String): Self = StObject.set(x, "disassociatedAt", value.asInstanceOf[js.Any])
    
    inline def setDisassociatedAtUndefined: Self = StObject.set(x, "disassociatedAt", js.undefined)
  }
}
