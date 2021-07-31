package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnshareDirectoryResult extends StObject {
  
  /**
    * Identifier of the directory stored in the directory consumer account that is to be unshared from the specified directory (DirectoryId).
    */
  var SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined
}
object UnshareDirectoryResult {
  
  @scala.inline
  def apply(): UnshareDirectoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnshareDirectoryResult]
  }
  
  @scala.inline
  implicit class UnshareDirectoryResultMutableBuilder[Self <: UnshareDirectoryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSharedDirectoryId(value: DirectoryId): Self = StObject.set(x, "SharedDirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedDirectoryIdUndefined: Self = StObject.set(x, "SharedDirectoryId", js.undefined)
  }
}
