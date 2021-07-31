package typings.awsSdk.mobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectRequest extends StObject {
  
  /**
    *  ZIP or YAML file which contains configuration settings to be used when creating the project. This may be the contents of the file downloaded from the URL provided in an export project operation. 
    */
  var contents: js.UndefOr[Contents] = js.undefined
  
  /**
    *  Name of the project. 
    */
  var name: js.UndefOr[ProjectName] = js.undefined
  
  /**
    *  Default region where project resources should be created. 
    */
  var region: js.UndefOr[ProjectRegion] = js.undefined
  
  /**
    *  Unique identifier for an exported snapshot of project configuration. This snapshot identifier is included in the share URL when a project is exported. 
    */
  var snapshotId: js.UndefOr[SnapshotId] = js.undefined
}
object CreateProjectRequest {
  
  @scala.inline
  def apply(): CreateProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProjectRequest]
  }
  
  @scala.inline
  implicit class CreateProjectRequestMutableBuilder[Self <: CreateProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: Contents): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    @scala.inline
    def setName(value: ProjectName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRegion(value: ProjectRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
  }
}
