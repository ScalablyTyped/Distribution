package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableSnapshotCopyResult extends StObject {
  
  var Cluster: js.UndefOr[typings.awsSdk.redshiftMod.Cluster] = js.undefined
}
object DisableSnapshotCopyResult {
  
  @scala.inline
  def apply(): DisableSnapshotCopyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableSnapshotCopyResult]
  }
  
  @scala.inline
  implicit class DisableSnapshotCopyResultMutableBuilder[Self <: DisableSnapshotCopyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
