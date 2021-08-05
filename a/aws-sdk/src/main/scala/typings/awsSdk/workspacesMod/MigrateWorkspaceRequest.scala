package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrateWorkspaceRequest extends StObject {
  
  /**
    * The identifier of the target bundle type to migrate the WorkSpace to.
    */
  var BundleId: typings.awsSdk.workspacesMod.BundleId
  
  /**
    * The identifier of the WorkSpace to migrate from.
    */
  var SourceWorkspaceId: WorkspaceId
}
object MigrateWorkspaceRequest {
  
  inline def apply(BundleId: BundleId, SourceWorkspaceId: WorkspaceId): MigrateWorkspaceRequest = {
    val __obj = js.Dynamic.literal(BundleId = BundleId.asInstanceOf[js.Any], SourceWorkspaceId = SourceWorkspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrateWorkspaceRequest]
  }
  
  extension [Self <: MigrateWorkspaceRequest](x: Self) {
    
    inline def setBundleId(value: BundleId): Self = StObject.set(x, "BundleId", value.asInstanceOf[js.Any])
    
    inline def setSourceWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "SourceWorkspaceId", value.asInstanceOf[js.Any])
  }
}
