package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectSharedDirectoryRequest extends StObject {
  
  /**
    * Identifier of the shared directory in the directory consumer account. This identifier is different for each directory owner account.
    */
  var SharedDirectoryId: DirectoryId = js.native
}
object RejectSharedDirectoryRequest {
  
  @scala.inline
  def apply(SharedDirectoryId: DirectoryId): RejectSharedDirectoryRequest = {
    val __obj = js.Dynamic.literal(SharedDirectoryId = SharedDirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectSharedDirectoryRequest]
  }
  
  @scala.inline
  implicit class RejectSharedDirectoryRequestMutableBuilder[Self <: RejectSharedDirectoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSharedDirectoryId(value: DirectoryId): Self = StObject.set(x, "SharedDirectoryId", value.asInstanceOf[js.Any])
  }
}
