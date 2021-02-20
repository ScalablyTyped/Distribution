package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAssetPropertyResponse extends StObject {
  
  /**
    * The ID of the asset.
    */
  var assetId: ID = js.native
  
  /**
    * The ID of the asset model.
    */
  var assetModelId: ID = js.native
  
  /**
    * The name of the asset.
    */
  var assetName: Name = js.native
  
  /**
    * The asset property's definition, alias, and notification state.
    */
  var assetProperty: Property = js.native
}
object DescribeAssetPropertyResponse {
  
  @scala.inline
  def apply(assetId: ID, assetModelId: ID, assetName: Name, assetProperty: Property): DescribeAssetPropertyResponse = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], assetModelId = assetModelId.asInstanceOf[js.Any], assetName = assetName.asInstanceOf[js.Any], assetProperty = assetProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssetPropertyResponse]
  }
  
  @scala.inline
  implicit class DescribeAssetPropertyResponseMutableBuilder[Self <: DescribeAssetPropertyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetModelId(value: ID): Self = StObject.set(x, "assetModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetName(value: Name): Self = StObject.set(x, "assetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetProperty(value: Property): Self = StObject.set(x, "assetProperty", value.asInstanceOf[js.Any])
  }
}
