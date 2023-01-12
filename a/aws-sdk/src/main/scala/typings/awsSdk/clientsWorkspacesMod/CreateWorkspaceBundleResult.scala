package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkspaceBundleResult extends StObject {
  
  var WorkspaceBundle: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.WorkspaceBundle] = js.undefined
}
object CreateWorkspaceBundleResult {
  
  inline def apply(): CreateWorkspaceBundleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkspaceBundleResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWorkspaceBundleResult] (val x: Self) extends AnyVal {
    
    inline def setWorkspaceBundle(value: WorkspaceBundle): Self = StObject.set(x, "WorkspaceBundle", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceBundleUndefined: Self = StObject.set(x, "WorkspaceBundle", js.undefined)
  }
}
