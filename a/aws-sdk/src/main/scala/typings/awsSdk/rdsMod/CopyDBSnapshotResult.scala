package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyDBSnapshotResult extends StObject {
  
  var DBSnapshot: js.UndefOr[typings.awsSdk.rdsMod.DBSnapshot] = js.native
}
object CopyDBSnapshotResult {
  
  @scala.inline
  def apply(): CopyDBSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyDBSnapshotResult]
  }
  
  @scala.inline
  implicit class CopyDBSnapshotResultMutableBuilder[Self <: CopyDBSnapshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSnapshot(value: DBSnapshot): Self = StObject.set(x, "DBSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSnapshotUndefined: Self = StObject.set(x, "DBSnapshot", js.undefined)
  }
}
