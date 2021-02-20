package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportAssetToSignedUrlResponseDetails extends StObject {
  
  /**
    * The unique identifier for the asset associated with this export job.
    */
  var AssetId: Id = js.native
  
  /**
    * The unique identifier for the data set associated with this export job.
    */
  var DataSetId: Id = js.native
  
  /**
    * The unique identifier for the revision associated with this export response.
    */
  var RevisionId: Id = js.native
  
  /**
    * The signed URL for the export request.
    */
  var SignedUrl: js.UndefOr[string] = js.native
  
  /**
    * The date and time that the signed URL expires, in ISO 8601 format.
    */
  var SignedUrlExpiresAt: js.UndefOr[Timestamp] = js.native
}
object ExportAssetToSignedUrlResponseDetails {
  
  @scala.inline
  def apply(AssetId: Id, DataSetId: Id, RevisionId: Id): ExportAssetToSignedUrlResponseDetails = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAssetToSignedUrlResponseDetails]
  }
  
  @scala.inline
  implicit class ExportAssetToSignedUrlResponseDetailsMutableBuilder[Self <: ExportAssetToSignedUrlResponseDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetId(value: Id): Self = StObject.set(x, "AssetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedUrl(value: string): Self = StObject.set(x, "SignedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedUrlExpiresAt(value: Timestamp): Self = StObject.set(x, "SignedUrlExpiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedUrlExpiresAtUndefined: Self = StObject.set(x, "SignedUrlExpiresAt", js.undefined)
    
    @scala.inline
    def setSignedUrlUndefined: Self = StObject.set(x, "SignedUrl", js.undefined)
  }
}
