package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelationalDatabaseMasterUserPasswordResult extends StObject {
  
  /**
    * The timestamp when the specified version of the master user password was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The master user password for the password version specified.
    */
  var masterUserPassword: js.UndefOr[SensitiveString] = js.undefined
}
object GetRelationalDatabaseMasterUserPasswordResult {
  
  inline def apply(): GetRelationalDatabaseMasterUserPasswordResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseMasterUserPasswordResult]
  }
  
  extension [Self <: GetRelationalDatabaseMasterUserPasswordResult](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setMasterUserPassword(value: SensitiveString): Self = StObject.set(x, "masterUserPassword", value.asInstanceOf[js.Any])
    
    inline def setMasterUserPasswordUndefined: Self = StObject.set(x, "masterUserPassword", js.undefined)
  }
}
