package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteObjectOutput extends StObject {
  
  /**
    * Specifies whether the versioned object that was permanently deleted was (true) or was not (false) a delete marker.
    */
  var DeleteMarker: js.UndefOr[typings.awsSdk.s3Mod.DeleteMarker] = js.native
  
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.native
  
  /**
    * Returns the version ID of the delete marker created as a result of the DELETE operation.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}
object DeleteObjectOutput {
  
  @scala.inline
  def apply(): DeleteObjectOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteObjectOutput]
  }
  
  @scala.inline
  implicit class DeleteObjectOutputMutableBuilder[Self <: DeleteObjectOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteMarker(value: DeleteMarker): Self = StObject.set(x, "DeleteMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteMarkerUndefined: Self = StObject.set(x, "DeleteMarker", js.undefined)
    
    @scala.inline
    def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
    
    @scala.inline
    def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
