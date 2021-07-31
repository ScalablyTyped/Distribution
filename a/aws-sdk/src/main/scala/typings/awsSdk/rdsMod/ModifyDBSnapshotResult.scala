package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBSnapshotResult extends StObject {
  
  var DBSnapshot: js.UndefOr[typings.awsSdk.rdsMod.DBSnapshot] = js.undefined
}
object ModifyDBSnapshotResult {
  
  @scala.inline
  def apply(): ModifyDBSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBSnapshotResult]
  }
  
  @scala.inline
  implicit class ModifyDBSnapshotResultMutableBuilder[Self <: ModifyDBSnapshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSnapshot(value: DBSnapshot): Self = StObject.set(x, "DBSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSnapshotUndefined: Self = StObject.set(x, "DBSnapshot", js.undefined)
  }
}
