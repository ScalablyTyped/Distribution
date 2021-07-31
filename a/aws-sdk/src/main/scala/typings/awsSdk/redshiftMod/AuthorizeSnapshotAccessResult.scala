package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeSnapshotAccessResult extends StObject {
  
  var Snapshot: js.UndefOr[typings.awsSdk.redshiftMod.Snapshot] = js.undefined
}
object AuthorizeSnapshotAccessResult {
  
  @scala.inline
  def apply(): AuthorizeSnapshotAccessResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeSnapshotAccessResult]
  }
  
  @scala.inline
  implicit class AuthorizeSnapshotAccessResultMutableBuilder[Self <: AuthorizeSnapshotAccessResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshot(value: Snapshot): Self = StObject.set(x, "Snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotUndefined: Self = StObject.set(x, "Snapshot", js.undefined)
  }
}
