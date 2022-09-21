package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBInstanceAutomatedBackupsReplication extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the replicated automated backups.
    */
  var DBInstanceAutomatedBackupsArn: js.UndefOr[String] = js.undefined
}
object DBInstanceAutomatedBackupsReplication {
  
  inline def apply(): DBInstanceAutomatedBackupsReplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBInstanceAutomatedBackupsReplication]
  }
  
  extension [Self <: DBInstanceAutomatedBackupsReplication](x: Self) {
    
    inline def setDBInstanceAutomatedBackupsArn(value: String): Self = StObject.set(x, "DBInstanceAutomatedBackupsArn", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceAutomatedBackupsArnUndefined: Self = StObject.set(x, "DBInstanceAutomatedBackupsArn", js.undefined)
  }
}
