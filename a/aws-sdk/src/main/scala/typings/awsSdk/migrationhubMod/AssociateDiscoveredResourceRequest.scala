package typings.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateDiscoveredResourceRequest extends StObject {
  
  /**
    * Object representing a Resource.
    */
  var DiscoveredResource: typings.awsSdk.migrationhubMod.DiscoveredResource = js.native
  
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typings.awsSdk.migrationhubMod.DryRun] = js.native
  
  /**
    * The identifier given to the MigrationTask. Do not store personal data in this field. 
    */
  var MigrationTaskName: typings.awsSdk.migrationhubMod.MigrationTaskName = js.native
  
  /**
    * The name of the ProgressUpdateStream.
    */
  var ProgressUpdateStream: typings.awsSdk.migrationhubMod.ProgressUpdateStream = js.native
}
object AssociateDiscoveredResourceRequest {
  
  @scala.inline
  def apply(
    DiscoveredResource: DiscoveredResource,
    MigrationTaskName: MigrationTaskName,
    ProgressUpdateStream: ProgressUpdateStream
  ): AssociateDiscoveredResourceRequest = {
    val __obj = js.Dynamic.literal(DiscoveredResource = DiscoveredResource.asInstanceOf[js.Any], MigrationTaskName = MigrationTaskName.asInstanceOf[js.Any], ProgressUpdateStream = ProgressUpdateStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDiscoveredResourceRequest]
  }
  
  @scala.inline
  implicit class AssociateDiscoveredResourceRequestMutableBuilder[Self <: AssociateDiscoveredResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiscoveredResource(value: DiscoveredResource): Self = StObject.set(x, "DiscoveredResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: DryRun): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setMigrationTaskName(value: MigrationTaskName): Self = StObject.set(x, "MigrationTaskName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUpdateStream(value: ProgressUpdateStream): Self = StObject.set(x, "ProgressUpdateStream", value.asInstanceOf[js.Any])
  }
}
