package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectSharedDirectoryResult extends StObject {
  
  /**
    * Identifier of the shared directory in the directory consumer account.
    */
  var SharedDirectoryId: js.UndefOr[DirectoryId] = js.native
}
object RejectSharedDirectoryResult {
  
  @scala.inline
  def apply(): RejectSharedDirectoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectSharedDirectoryResult]
  }
  
  @scala.inline
  implicit class RejectSharedDirectoryResultMutableBuilder[Self <: RejectSharedDirectoryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSharedDirectoryId(value: DirectoryId): Self = StObject.set(x, "SharedDirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedDirectoryIdUndefined: Self = StObject.set(x, "SharedDirectoryId", js.undefined)
  }
}
