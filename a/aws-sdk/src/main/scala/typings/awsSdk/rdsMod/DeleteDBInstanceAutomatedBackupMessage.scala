package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBInstanceAutomatedBackupMessage extends StObject {
  
  /**
    * The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
    */
  var DbiResourceId: String
}
object DeleteDBInstanceAutomatedBackupMessage {
  
  inline def apply(DbiResourceId: String): DeleteDBInstanceAutomatedBackupMessage = {
    val __obj = js.Dynamic.literal(DbiResourceId = DbiResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBInstanceAutomatedBackupMessage]
  }
  
  extension [Self <: DeleteDBInstanceAutomatedBackupMessage](x: Self) {
    
    inline def setDbiResourceId(value: String): Self = StObject.set(x, "DbiResourceId", value.asInstanceOf[js.Any])
  }
}
