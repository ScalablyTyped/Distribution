package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotCopyGrantResult extends StObject {
  
  var SnapshotCopyGrant: js.UndefOr[typings.awsSdk.redshiftMod.SnapshotCopyGrant] = js.undefined
}
object CreateSnapshotCopyGrantResult {
  
  @scala.inline
  def apply(): CreateSnapshotCopyGrantResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotCopyGrantResult]
  }
  
  @scala.inline
  implicit class CreateSnapshotCopyGrantResultMutableBuilder[Self <: CreateSnapshotCopyGrantResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotCopyGrant(value: SnapshotCopyGrant): Self = StObject.set(x, "SnapshotCopyGrant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotCopyGrantUndefined: Self = StObject.set(x, "SnapshotCopyGrant", js.undefined)
  }
}
