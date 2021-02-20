package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeployablePatchSnapshotForInstanceResult extends StObject {
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ssmMod.InstanceId] = js.native
  
  /**
    * Returns the specific operating system (for example Windows Server 2012 or Amazon Linux 2015.09) on the instance for the specified patch snapshot.
    */
  var Product: js.UndefOr[typings.awsSdk.ssmMod.Product] = js.native
  
  /**
    * A pre-signed Amazon S3 URL that can be used to download the patch snapshot.
    */
  var SnapshotDownloadUrl: js.UndefOr[typings.awsSdk.ssmMod.SnapshotDownloadUrl] = js.native
  
  /**
    * The user-defined snapshot ID.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.ssmMod.SnapshotId] = js.native
}
object GetDeployablePatchSnapshotForInstanceResult {
  
  @scala.inline
  def apply(): GetDeployablePatchSnapshotForInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeployablePatchSnapshotForInstanceResult]
  }
  
  @scala.inline
  implicit class GetDeployablePatchSnapshotForInstanceResultMutableBuilder[Self <: GetDeployablePatchSnapshotForInstanceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setProduct(value: Product): Self = StObject.set(x, "Product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "Product", js.undefined)
    
    @scala.inline
    def setSnapshotDownloadUrl(value: SnapshotDownloadUrl): Self = StObject.set(x, "SnapshotDownloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotDownloadUrlUndefined: Self = StObject.set(x, "SnapshotDownloadUrl", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
  }
}
