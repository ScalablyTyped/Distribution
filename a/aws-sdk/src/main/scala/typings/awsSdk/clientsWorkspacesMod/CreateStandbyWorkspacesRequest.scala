package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStandbyWorkspacesRequest extends StObject {
  
  /**
    * The Region of the primary WorkSpace.
    */
  var PrimaryRegion: Region
  
  /**
    * Information about the standby WorkSpace to be created.
    */
  var StandbyWorkspaces: StandbyWorkspacesList
}
object CreateStandbyWorkspacesRequest {
  
  inline def apply(PrimaryRegion: Region, StandbyWorkspaces: StandbyWorkspacesList): CreateStandbyWorkspacesRequest = {
    val __obj = js.Dynamic.literal(PrimaryRegion = PrimaryRegion.asInstanceOf[js.Any], StandbyWorkspaces = StandbyWorkspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStandbyWorkspacesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateStandbyWorkspacesRequest] (val x: Self) extends AnyVal {
    
    inline def setPrimaryRegion(value: Region): Self = StObject.set(x, "PrimaryRegion", value.asInstanceOf[js.Any])
    
    inline def setStandbyWorkspaces(value: StandbyWorkspacesList): Self = StObject.set(x, "StandbyWorkspaces", value.asInstanceOf[js.Any])
    
    inline def setStandbyWorkspacesVarargs(value: StandbyWorkspace*): Self = StObject.set(x, "StandbyWorkspaces", js.Array(value*))
  }
}
