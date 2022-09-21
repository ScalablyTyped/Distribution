package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a set of changes that happen in project
  */
trait ProjectChanges extends StObject {
  
  /**
    * List of added files
    */
  var added: Array[FileWithProjectReferenceRedirectInfo | String]
  
  /**
    * List of removed files
    */
  var removed: Array[FileWithProjectReferenceRedirectInfo | String]
  
  /**
    * List of updated files
    */
  var updated: Array[FileWithProjectReferenceRedirectInfo | String]
  
  /**
    * List of files that have had their project reference redirect status updated
    * Only provided when the synchronizeProjectList request has includeProjectReferenceRedirectInfo set to true
    */
  var updatedRedirects: js.UndefOr[Array[FileWithProjectReferenceRedirectInfo]] = js.undefined
}
object ProjectChanges {
  
  inline def apply(
    added: Array[FileWithProjectReferenceRedirectInfo | String],
    removed: Array[FileWithProjectReferenceRedirectInfo | String],
    updated: Array[FileWithProjectReferenceRedirectInfo | String]
  ): ProjectChanges = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectChanges]
  }
  
  extension [Self <: ProjectChanges](x: Self) {
    
    inline def setAdded(value: Array[FileWithProjectReferenceRedirectInfo | String]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setRemoved(value: Array[FileWithProjectReferenceRedirectInfo | String]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: Array[FileWithProjectReferenceRedirectInfo | String]): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedRedirects(value: Array[FileWithProjectReferenceRedirectInfo]): Self = StObject.set(x, "updatedRedirects", value.asInstanceOf[js.Any])
    
    inline def setUpdatedRedirectsUndefined: Self = StObject.set(x, "updatedRedirects", js.undefined)
  }
}
