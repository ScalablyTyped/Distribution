package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrateWorkspaceResult extends StObject {
  
  /**
    * The original identifier of the WorkSpace that is being migrated.
    */
  var SourceWorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
  
  /**
    * The new identifier of the WorkSpace that is being migrated. If the migration does not succeed, the target WorkSpace ID will not be used, and the WorkSpace will still have the original WorkSpace ID.
    */
  var TargetWorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
}
object MigrateWorkspaceResult {
  
  inline def apply(): MigrateWorkspaceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrateWorkspaceResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MigrateWorkspaceResult] (val x: Self) extends AnyVal {
    
    inline def setSourceWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "SourceWorkspaceId", value.asInstanceOf[js.Any])
    
    inline def setSourceWorkspaceIdUndefined: Self = StObject.set(x, "SourceWorkspaceId", js.undefined)
    
    inline def setTargetWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "TargetWorkspaceId", value.asInstanceOf[js.Any])
    
    inline def setTargetWorkspaceIdUndefined: Self = StObject.set(x, "TargetWorkspaceId", js.undefined)
  }
}
