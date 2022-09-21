package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkspaceBundleResult extends StObject {
  
  var WorkspaceBundle: js.UndefOr[typings.awsSdk.workspacesMod.WorkspaceBundle] = js.undefined
}
object CreateWorkspaceBundleResult {
  
  inline def apply(): CreateWorkspaceBundleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkspaceBundleResult]
  }
  
  extension [Self <: CreateWorkspaceBundleResult](x: Self) {
    
    inline def setWorkspaceBundle(value: WorkspaceBundle): Self = StObject.set(x, "WorkspaceBundle", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceBundleUndefined: Self = StObject.set(x, "WorkspaceBundle", js.undefined)
  }
}
