package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssetModelRequest extends StObject {
  
  /**
    * The ID of the asset model.
    */
  var assetModelId: ID
}
object DescribeAssetModelRequest {
  
  @scala.inline
  def apply(assetModelId: ID): DescribeAssetModelRequest = {
    val __obj = js.Dynamic.literal(assetModelId = assetModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssetModelRequest]
  }
  
  @scala.inline
  implicit class DescribeAssetModelRequestMutableBuilder[Self <: DescribeAssetModelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetModelId(value: ID): Self = StObject.set(x, "assetModelId", value.asInstanceOf[js.Any])
  }
}
