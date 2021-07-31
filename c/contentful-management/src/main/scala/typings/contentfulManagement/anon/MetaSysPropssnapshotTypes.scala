package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined contentful-management.contentful-management/dist/typings/common-types.MetaSysProps & {  snapshotType :string,   snapshotEntityType :string} */
trait MetaSysPropssnapshotTypes extends StObject {
  
  var archivedVersion: js.UndefOr[Double] = js.undefined
  
  var createdAt: String
  
  var createdBy: js.UndefOr[Sys] = js.undefined
  
  var id: String
  
  var publishedVersion: js.UndefOr[Double] = js.undefined
  
  var snapshotEntityType: String
  
  var snapshotType: String
  
  var space: js.UndefOr[Sys] = js.undefined
  
  var status: js.UndefOr[Sys] = js.undefined
  
  var `type`: String
  
  var updatedAt: String
  
  var updatedBy: js.UndefOr[Sys] = js.undefined
  
  var version: Double
}
object MetaSysPropssnapshotTypes {
  
  @scala.inline
  def apply(
    createdAt: String,
    id: String,
    snapshotEntityType: String,
    snapshotType: String,
    `type`: String,
    updatedAt: String,
    version: Double
  ): MetaSysPropssnapshotTypes = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], snapshotEntityType = snapshotEntityType.asInstanceOf[js.Any], snapshotType = snapshotType.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaSysPropssnapshotTypes]
  }
  
  @scala.inline
  implicit class MetaSysPropssnapshotTypesMutableBuilder[Self <: MetaSysPropssnapshotTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchivedVersion(value: Double): Self = StObject.set(x, "archivedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedVersionUndefined: Self = StObject.set(x, "archivedVersion", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBy(value: Sys): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedVersion(value: Double): Self = StObject.set(x, "publishedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedVersionUndefined: Self = StObject.set(x, "publishedVersion", js.undefined)
    
    @scala.inline
    def setSnapshotEntityType(value: String): Self = StObject.set(x, "snapshotEntityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotType(value: String): Self = StObject.set(x, "snapshotType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpace(value: Sys): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    @scala.inline
    def setStatus(value: Sys): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedBy(value: Sys): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedByUndefined: Self = StObject.set(x, "updatedBy", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
