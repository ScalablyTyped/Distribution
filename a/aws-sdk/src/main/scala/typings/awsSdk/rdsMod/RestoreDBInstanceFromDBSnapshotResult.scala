package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreDBInstanceFromDBSnapshotResult extends StObject {
  
  var DBInstance: js.UndefOr[typings.awsSdk.rdsMod.DBInstance] = js.undefined
}
object RestoreDBInstanceFromDBSnapshotResult {
  
  @scala.inline
  def apply(): RestoreDBInstanceFromDBSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDBInstanceFromDBSnapshotResult]
  }
  
  @scala.inline
  implicit class RestoreDBInstanceFromDBSnapshotResultMutableBuilder[Self <: RestoreDBInstanceFromDBSnapshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
