package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDBSnapshotResult extends StObject {
  
  var DBSnapshot: js.UndefOr[typings.awsSdk.rdsMod.DBSnapshot] = js.native
}
object CreateDBSnapshotResult {
  
  @scala.inline
  def apply(): CreateDBSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBSnapshotResult]
  }
  
  @scala.inline
  implicit class CreateDBSnapshotResultMutableBuilder[Self <: CreateDBSnapshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSnapshot(value: DBSnapshot): Self = StObject.set(x, "DBSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSnapshotUndefined: Self = StObject.set(x, "DBSnapshot", js.undefined)
  }
}
