package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDirectoryResult extends StObject {
  
  /**
    * The directory identifier.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.undefined
}
object DeleteDirectoryResult {
  
  @scala.inline
  def apply(): DeleteDirectoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDirectoryResult]
  }
  
  @scala.inline
  implicit class DeleteDirectoryResultMutableBuilder[Self <: DeleteDirectoryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
  }
}
