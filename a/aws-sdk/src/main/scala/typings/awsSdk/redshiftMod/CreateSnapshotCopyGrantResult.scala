package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotCopyGrantResult extends StObject {
  
  var SnapshotCopyGrant: js.UndefOr[typings.awsSdk.redshiftMod.SnapshotCopyGrant] = js.undefined
}
object CreateSnapshotCopyGrantResult {
  
  inline def apply(): CreateSnapshotCopyGrantResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotCopyGrantResult]
  }
  
  extension [Self <: CreateSnapshotCopyGrantResult](x: Self) {
    
    inline def setSnapshotCopyGrant(value: SnapshotCopyGrant): Self = StObject.set(x, "SnapshotCopyGrant", value.asInstanceOf[js.Any])
    
    inline def setSnapshotCopyGrantUndefined: Self = StObject.set(x, "SnapshotCopyGrant", js.undefined)
  }
}
