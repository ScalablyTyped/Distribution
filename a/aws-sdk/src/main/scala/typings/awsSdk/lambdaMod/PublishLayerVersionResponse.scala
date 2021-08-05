package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishLayerVersionResponse extends StObject {
  
  /**
    * The layer's compatible runtimes.
    */
  var CompatibleRuntimes: js.UndefOr[typings.awsSdk.lambdaMod.CompatibleRuntimes] = js.undefined
  
  /**
    * Details about the layer version.
    */
  var Content: js.UndefOr[LayerVersionContentOutput] = js.undefined
  
  /**
    * The date that the layer version was created, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
    */
  var CreatedDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The description of the version.
    */
  var Description: js.UndefOr[typings.awsSdk.lambdaMod.Description] = js.undefined
  
  /**
    * The ARN of the layer.
    */
  var LayerArn: js.UndefOr[typings.awsSdk.lambdaMod.LayerArn] = js.undefined
  
  /**
    * The ARN of the layer version.
    */
  var LayerVersionArn: js.UndefOr[typings.awsSdk.lambdaMod.LayerVersionArn] = js.undefined
  
  /**
    * The layer's software license.
    */
  var LicenseInfo: js.UndefOr[typings.awsSdk.lambdaMod.LicenseInfo] = js.undefined
  
  /**
    * The version number.
    */
  var Version: js.UndefOr[LayerVersionNumber] = js.undefined
}
object PublishLayerVersionResponse {
  
  inline def apply(): PublishLayerVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishLayerVersionResponse]
  }
  
  extension [Self <: PublishLayerVersionResponse](x: Self) {
    
    inline def setCompatibleRuntimes(value: CompatibleRuntimes): Self = StObject.set(x, "CompatibleRuntimes", value.asInstanceOf[js.Any])
    
    inline def setCompatibleRuntimesUndefined: Self = StObject.set(x, "CompatibleRuntimes", js.undefined)
    
    inline def setCompatibleRuntimesVarargs(value: Runtime*): Self = StObject.set(x, "CompatibleRuntimes", js.Array(value :_*))
    
    inline def setContent(value: LayerVersionContentOutput): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setCreatedDate(value: Timestamp): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLayerArn(value: LayerArn): Self = StObject.set(x, "LayerArn", value.asInstanceOf[js.Any])
    
    inline def setLayerArnUndefined: Self = StObject.set(x, "LayerArn", js.undefined)
    
    inline def setLayerVersionArn(value: LayerVersionArn): Self = StObject.set(x, "LayerVersionArn", value.asInstanceOf[js.Any])
    
    inline def setLayerVersionArnUndefined: Self = StObject.set(x, "LayerVersionArn", js.undefined)
    
    inline def setLicenseInfo(value: LicenseInfo): Self = StObject.set(x, "LicenseInfo", value.asInstanceOf[js.Any])
    
    inline def setLicenseInfoUndefined: Self = StObject.set(x, "LicenseInfo", js.undefined)
    
    inline def setVersion(value: LayerVersionNumber): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
