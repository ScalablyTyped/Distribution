package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedWorkspaceProperties extends StObject {
  
  /**
    * The Region of the related WorkSpace.
    */
  var Region: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.Region] = js.undefined
  
  /**
    * Indicates the state of the WorkSpace.
    */
  var State: js.UndefOr[WorkspaceState] = js.undefined
  
  /**
    * Indicates the type of WorkSpace.
    */
  var Type: js.UndefOr[StandbyWorkspaceRelationshipType] = js.undefined
  
  /**
    * The identifier of the related WorkSpace.
    */
  var WorkspaceId: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.WorkspaceId] = js.undefined
}
object RelatedWorkspaceProperties {
  
  inline def apply(): RelatedWorkspaceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedWorkspaceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelatedWorkspaceProperties] (val x: Self) extends AnyVal {
    
    inline def setRegion(value: Region): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setState(value: WorkspaceState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setType(value: StandbyWorkspaceRelationshipType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "WorkspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceIdUndefined: Self = StObject.set(x, "WorkspaceId", js.undefined)
  }
}
