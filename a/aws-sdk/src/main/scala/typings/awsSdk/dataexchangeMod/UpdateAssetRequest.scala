package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAssetRequest extends StObject {
  
  /**
    * The unique identifier for an asset.
    */
  var AssetId: string = js.native
  
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: string = js.native
  
  /**
    * The name of the asset. When importing from Amazon S3, the S3 object key is used as the asset name. When exporting to Amazon S3, the asset name is used as default target S3 object key.
    */
  var Name: AssetName = js.native
  
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: string = js.native
}
object UpdateAssetRequest {
  
  @scala.inline
  def apply(AssetId: string, DataSetId: string, Name: AssetName, RevisionId: string): UpdateAssetRequest = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssetRequest]
  }
  
  @scala.inline
  implicit class UpdateAssetRequestMutableBuilder[Self <: UpdateAssetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetId(value: string): Self = StObject.set(x, "AssetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetId(value: string): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: AssetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: string): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
