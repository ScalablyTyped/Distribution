package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssetRequest extends StObject {
  
  /**
    * The ID of the asset.
    */
  var assetId: ID
}
object DescribeAssetRequest {
  
  @scala.inline
  def apply(assetId: ID): DescribeAssetRequest = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssetRequest]
  }
  
  @scala.inline
  implicit class DescribeAssetRequestMutableBuilder[Self <: DescribeAssetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
  }
}
