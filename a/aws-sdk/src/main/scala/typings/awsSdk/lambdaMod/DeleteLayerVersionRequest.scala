package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLayerVersionRequest extends StObject {
  
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typings.awsSdk.lambdaMod.LayerName
  
  /**
    * The version number.
    */
  var VersionNumber: LayerVersionNumber
}
object DeleteLayerVersionRequest {
  
  @scala.inline
  def apply(LayerName: LayerName, VersionNumber: LayerVersionNumber): DeleteLayerVersionRequest = {
    val __obj = js.Dynamic.literal(LayerName = LayerName.asInstanceOf[js.Any], VersionNumber = VersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLayerVersionRequest]
  }
  
  @scala.inline
  implicit class DeleteLayerVersionRequestMutableBuilder[Self <: DeleteLayerVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayerName(value: LayerName): Self = StObject.set(x, "LayerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumber(value: LayerVersionNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
  }
}
