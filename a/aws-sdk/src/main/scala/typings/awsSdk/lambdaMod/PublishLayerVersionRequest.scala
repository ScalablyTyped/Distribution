package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishLayerVersionRequest extends StObject {
  
  /**
    * A list of compatible function runtimes. Used for filtering with ListLayers and ListLayerVersions.
    */
  var CompatibleRuntimes: js.UndefOr[typings.awsSdk.lambdaMod.CompatibleRuntimes] = js.undefined
  
  /**
    * The function layer archive.
    */
  var Content: LayerVersionContentInput
  
  /**
    * The description of the version.
    */
  var Description: js.UndefOr[typings.awsSdk.lambdaMod.Description] = js.undefined
  
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typings.awsSdk.lambdaMod.LayerName
  
  /**
    * The layer's software license. It can be any of the following:   An SPDX license identifier. For example, MIT.   The URL of a license hosted on the internet. For example, https://opensource.org/licenses/MIT.   The full text of the license.  
    */
  var LicenseInfo: js.UndefOr[typings.awsSdk.lambdaMod.LicenseInfo] = js.undefined
}
object PublishLayerVersionRequest {
  
  inline def apply(Content: LayerVersionContentInput, LayerName: LayerName): PublishLayerVersionRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], LayerName = LayerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishLayerVersionRequest]
  }
  
  extension [Self <: PublishLayerVersionRequest](x: Self) {
    
    inline def setCompatibleRuntimes(value: CompatibleRuntimes): Self = StObject.set(x, "CompatibleRuntimes", value.asInstanceOf[js.Any])
    
    inline def setCompatibleRuntimesUndefined: Self = StObject.set(x, "CompatibleRuntimes", js.undefined)
    
    inline def setCompatibleRuntimesVarargs(value: Runtime*): Self = StObject.set(x, "CompatibleRuntimes", js.Array(value :_*))
    
    inline def setContent(value: LayerVersionContentInput): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLayerName(value: LayerName): Self = StObject.set(x, "LayerName", value.asInstanceOf[js.Any])
    
    inline def setLicenseInfo(value: LicenseInfo): Self = StObject.set(x, "LicenseInfo", value.asInstanceOf[js.Any])
    
    inline def setLicenseInfoUndefined: Self = StObject.set(x, "LicenseInfo", js.undefined)
  }
}
