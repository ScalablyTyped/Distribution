package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportAssetsToS3RequestDetails extends StObject {
  
  /**
    * The destination for the asset.
    */
  var AssetDestinations: ListOfAssetDestinationEntry = js.native
  
  /**
    * The unique identifier for the data set associated with this export job.
    */
  var DataSetId: Id = js.native
  
  /**
    * Encryption configuration for the export job.
    */
  var Encryption: js.UndefOr[ExportServerSideEncryption] = js.native
  
  /**
    * The unique identifier for the revision associated with this export request.
    */
  var RevisionId: Id = js.native
}
object ExportAssetsToS3RequestDetails {
  
  @scala.inline
  def apply(AssetDestinations: ListOfAssetDestinationEntry, DataSetId: Id, RevisionId: Id): ExportAssetsToS3RequestDetails = {
    val __obj = js.Dynamic.literal(AssetDestinations = AssetDestinations.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAssetsToS3RequestDetails]
  }
  
  @scala.inline
  implicit class ExportAssetsToS3RequestDetailsMutableBuilder[Self <: ExportAssetsToS3RequestDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetDestinations(value: ListOfAssetDestinationEntry): Self = StObject.set(x, "AssetDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetDestinationsVarargs(value: AssetDestinationEntry*): Self = StObject.set(x, "AssetDestinations", js.Array(value :_*))
    
    @scala.inline
    def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryption(value: ExportServerSideEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    @scala.inline
    def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
