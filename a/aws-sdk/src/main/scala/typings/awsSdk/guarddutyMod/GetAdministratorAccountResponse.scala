package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAdministratorAccountResponse extends StObject {
  
  /**
    * The administrator account details.
    */
  var Administrator: typings.awsSdk.guarddutyMod.Administrator
}
object GetAdministratorAccountResponse {
  
  inline def apply(Administrator: Administrator): GetAdministratorAccountResponse = {
    val __obj = js.Dynamic.literal(Administrator = Administrator.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAdministratorAccountResponse]
  }
  
  extension [Self <: GetAdministratorAccountResponse](x: Self) {
    
    inline def setAdministrator(value: Administrator): Self = StObject.set(x, "Administrator", value.asInstanceOf[js.Any])
  }
}
