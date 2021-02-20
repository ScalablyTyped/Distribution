package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSnapshotLimitsRequest extends StObject {
  
  /**
    * Contains the identifier of the directory to obtain the limits for.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
}
object GetSnapshotLimitsRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId): GetSnapshotLimitsRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotLimitsRequest]
  }
  
  @scala.inline
  implicit class GetSnapshotLimitsRequestMutableBuilder[Self <: GetSnapshotLimitsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
  }
}
