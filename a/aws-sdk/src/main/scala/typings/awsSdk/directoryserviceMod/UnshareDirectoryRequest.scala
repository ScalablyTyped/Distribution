package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnshareDirectoryRequest extends StObject {
  
  /**
    * The identifier of the AWS Managed Microsoft AD directory that you want to stop sharing.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId
  
  /**
    * Identifier for the directory consumer account with whom the directory has to be unshared.
    */
  var UnshareTarget: typings.awsSdk.directoryserviceMod.UnshareTarget
}
object UnshareDirectoryRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId, UnshareTarget: UnshareTarget): UnshareDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], UnshareTarget = UnshareTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnshareDirectoryRequest]
  }
  
  @scala.inline
  implicit class UnshareDirectoryRequestMutableBuilder[Self <: UnshareDirectoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnshareTarget(value: UnshareTarget): Self = StObject.set(x, "UnshareTarget", value.asInstanceOf[js.Any])
  }
}
