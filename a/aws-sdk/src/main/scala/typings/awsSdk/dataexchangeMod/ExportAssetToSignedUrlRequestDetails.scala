package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportAssetToSignedUrlRequestDetails extends StObject {
  
  /**
    * The unique identifier for the asset that is exported to a signed URL.
    */
  var AssetId: Id
  
  /**
    * The unique identifier for the data set associated with this export job.
    */
  var DataSetId: Id
  
  /**
    * The unique identifier for the revision associated with this export request.
    */
  var RevisionId: Id
}
object ExportAssetToSignedUrlRequestDetails {
  
  @scala.inline
  def apply(AssetId: Id, DataSetId: Id, RevisionId: Id): ExportAssetToSignedUrlRequestDetails = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAssetToSignedUrlRequestDetails]
  }
  
  @scala.inline
  implicit class ExportAssetToSignedUrlRequestDetailsMutableBuilder[Self <: ExportAssetToSignedUrlRequestDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetId(value: Id): Self = StObject.set(x, "AssetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
