package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAssetPropertyRequest extends StObject {
  
  /**
    * The ID of the asset.
    */
  var assetId: ID = js.native
  
  /**
    * The ID of the asset property.
    */
  var propertyId: ID = js.native
}
object DescribeAssetPropertyRequest {
  
  @scala.inline
  def apply(assetId: ID, propertyId: ID): DescribeAssetPropertyRequest = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], propertyId = propertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssetPropertyRequest]
  }
  
  @scala.inline
  implicit class DescribeAssetPropertyRequestMutableBuilder[Self <: DescribeAssetPropertyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyId(value: ID): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
  }
}
