package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDBInstanceMessage extends StObject {
  
  /**
    *  The user-supplied instance identifier. 
    */
  var DBInstanceIdentifier: String
  
  /**
    *  The user-supplied instance identifier of the DB Snapshot created immediately before the DB instance is stopped. 
    */
  var DBSnapshotIdentifier: js.UndefOr[String] = js.undefined
}
object StopDBInstanceMessage {
  
  inline def apply(DBInstanceIdentifier: String): StopDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDBInstanceMessage]
  }
  
  extension [Self <: StopDBInstanceMessage](x: Self) {
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBSnapshotIdentifier(value: String): Self = StObject.set(x, "DBSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBSnapshotIdentifierUndefined: Self = StObject.set(x, "DBSnapshotIdentifier", js.undefined)
  }
}
