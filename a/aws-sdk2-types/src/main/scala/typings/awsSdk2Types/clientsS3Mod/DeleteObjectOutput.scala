package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteObjectOutput extends StObject {
  
  /**
    * Specifies whether the versioned object that was permanently deleted was (true) or was not (false) a delete marker.
    */
  var DeleteMarker: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.DeleteMarker] = js.undefined
  
  var RequestCharged: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.RequestCharged] = js.undefined
  
  /**
    * Returns the version ID of the delete marker created as a result of the DELETE operation.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}
object DeleteObjectOutput {
  
  inline def apply(): DeleteObjectOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteObjectOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteObjectOutput] (val x: Self) extends AnyVal {
    
    inline def setDeleteMarker(value: DeleteMarker): Self = StObject.set(x, "DeleteMarker", value.asInstanceOf[js.Any])
    
    inline def setDeleteMarkerUndefined: Self = StObject.set(x, "DeleteMarker", js.undefined)
    
    inline def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
    
    inline def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
