package typings.awsSdk.mobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProjectResult extends StObject {
  
  /**
    *  Resources which were deleted. 
    */
  var deletedResources: js.UndefOr[Resources] = js.undefined
  
  /**
    *  Resources which were not deleted, due to a risk of losing potentially important data or files. 
    */
  var orphanedResources: js.UndefOr[Resources] = js.undefined
}
object DeleteProjectResult {
  
  inline def apply(): DeleteProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProjectResult]
  }
  
  extension [Self <: DeleteProjectResult](x: Self) {
    
    inline def setDeletedResources(value: Resources): Self = StObject.set(x, "deletedResources", value.asInstanceOf[js.Any])
    
    inline def setDeletedResourcesUndefined: Self = StObject.set(x, "deletedResources", js.undefined)
    
    inline def setDeletedResourcesVarargs(value: Resource*): Self = StObject.set(x, "deletedResources", js.Array(value :_*))
    
    inline def setOrphanedResources(value: Resources): Self = StObject.set(x, "orphanedResources", value.asInstanceOf[js.Any])
    
    inline def setOrphanedResourcesUndefined: Self = StObject.set(x, "orphanedResources", js.undefined)
    
    inline def setOrphanedResourcesVarargs(value: Resource*): Self = StObject.set(x, "orphanedResources", js.Array(value :_*))
  }
}
