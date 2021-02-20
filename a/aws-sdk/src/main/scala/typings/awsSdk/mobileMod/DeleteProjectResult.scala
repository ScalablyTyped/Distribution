package typings.awsSdk.mobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteProjectResult extends StObject {
  
  /**
    *  Resources which were deleted. 
    */
  var deletedResources: js.UndefOr[Resources] = js.native
  
  /**
    *  Resources which were not deleted, due to a risk of losing potentially important data or files. 
    */
  var orphanedResources: js.UndefOr[Resources] = js.native
}
object DeleteProjectResult {
  
  @scala.inline
  def apply(): DeleteProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProjectResult]
  }
  
  @scala.inline
  implicit class DeleteProjectResultMutableBuilder[Self <: DeleteProjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletedResources(value: Resources): Self = StObject.set(x, "deletedResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedResourcesUndefined: Self = StObject.set(x, "deletedResources", js.undefined)
    
    @scala.inline
    def setDeletedResourcesVarargs(value: Resource*): Self = StObject.set(x, "deletedResources", js.Array(value :_*))
    
    @scala.inline
    def setOrphanedResources(value: Resources): Self = StObject.set(x, "orphanedResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrphanedResourcesUndefined: Self = StObject.set(x, "orphanedResources", js.undefined)
    
    @scala.inline
    def setOrphanedResourcesVarargs(value: Resource*): Self = StObject.set(x, "orphanedResources", js.Array(value :_*))
  }
}
