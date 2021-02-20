package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAssetRequest extends StObject {
  
  /**
    * The unique identifier for an asset.
    */
  var AssetId: string = js.native
  
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: string = js.native
  
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: string = js.native
}
object GetAssetRequest {
  
  @scala.inline
  def apply(AssetId: string, DataSetId: string, RevisionId: string): GetAssetRequest = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssetRequest]
  }
  
  @scala.inline
  implicit class GetAssetRequestMutableBuilder[Self <: GetAssetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetId(value: string): Self = StObject.set(x, "AssetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetId(value: string): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: string): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
