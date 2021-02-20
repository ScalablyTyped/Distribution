package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRelationalDatabaseSnapshotResult extends StObject {
  
  /**
    * An object describing the specified database snapshot.
    */
  var relationalDatabaseSnapshot: js.UndefOr[RelationalDatabaseSnapshot] = js.native
}
object GetRelationalDatabaseSnapshotResult {
  
  @scala.inline
  def apply(): GetRelationalDatabaseSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseSnapshotResult]
  }
  
  @scala.inline
  implicit class GetRelationalDatabaseSnapshotResultMutableBuilder[Self <: GetRelationalDatabaseSnapshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelationalDatabaseSnapshot(value: RelationalDatabaseSnapshot): Self = StObject.set(x, "relationalDatabaseSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalDatabaseSnapshotUndefined: Self = StObject.set(x, "relationalDatabaseSnapshot", js.undefined)
  }
}
