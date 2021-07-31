package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareDirectoryResult extends StObject {
  
  /**
    * Identifier of the directory that is stored in the directory consumer account that is shared from the specified directory (DirectoryId).
    */
  var SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined
}
object ShareDirectoryResult {
  
  @scala.inline
  def apply(): ShareDirectoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareDirectoryResult]
  }
  
  @scala.inline
  implicit class ShareDirectoryResultMutableBuilder[Self <: ShareDirectoryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSharedDirectoryId(value: DirectoryId): Self = StObject.set(x, "SharedDirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedDirectoryIdUndefined: Self = StObject.set(x, "SharedDirectoryId", js.undefined)
  }
}
