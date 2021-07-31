package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptSharedDirectoryRequest extends StObject {
  
  /**
    * Identifier of the shared directory in the directory consumer account. This identifier is different for each directory owner account. 
    */
  var SharedDirectoryId: DirectoryId
}
object AcceptSharedDirectoryRequest {
  
  @scala.inline
  def apply(SharedDirectoryId: DirectoryId): AcceptSharedDirectoryRequest = {
    val __obj = js.Dynamic.literal(SharedDirectoryId = SharedDirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptSharedDirectoryRequest]
  }
  
  @scala.inline
  implicit class AcceptSharedDirectoryRequestMutableBuilder[Self <: AcceptSharedDirectoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSharedDirectoryId(value: DirectoryId): Self = StObject.set(x, "SharedDirectoryId", value.asInstanceOf[js.Any])
  }
}
