package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLayerVersionResponse extends StObject {
  
  /**
    * The layer's compatible runtimes.
    */
  var CompatibleRuntimes: js.UndefOr[typings.awsSdk.lambdaMod.CompatibleRuntimes] = js.native
  
  /**
    * Details about the layer version.
    */
  var Content: js.UndefOr[LayerVersionContentOutput] = js.native
  
  /**
    * The date that the layer version was created, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
    */
  var CreatedDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description of the version.
    */
  var Description: js.UndefOr[typings.awsSdk.lambdaMod.Description] = js.native
  
  /**
    * The ARN of the layer.
    */
  var LayerArn: js.UndefOr[typings.awsSdk.lambdaMod.LayerArn] = js.native
  
  /**
    * The ARN of the layer version.
    */
  var LayerVersionArn: js.UndefOr[typings.awsSdk.lambdaMod.LayerVersionArn] = js.native
  
  /**
    * The layer's software license.
    */
  var LicenseInfo: js.UndefOr[typings.awsSdk.lambdaMod.LicenseInfo] = js.native
  
  /**
    * The version number.
    */
  var Version: js.UndefOr[LayerVersionNumber] = js.native
}
object GetLayerVersionResponse {
  
  @scala.inline
  def apply(): GetLayerVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLayerVersionResponse]
  }
  
  @scala.inline
  implicit class GetLayerVersionResponseMutableBuilder[Self <: GetLayerVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompatibleRuntimes(value: CompatibleRuntimes): Self = StObject.set(x, "CompatibleRuntimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibleRuntimesUndefined: Self = StObject.set(x, "CompatibleRuntimes", js.undefined)
    
    @scala.inline
    def setCompatibleRuntimesVarargs(value: Runtime*): Self = StObject.set(x, "CompatibleRuntimes", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: LayerVersionContentOutput): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLayerArn(value: LayerArn): Self = StObject.set(x, "LayerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerArnUndefined: Self = StObject.set(x, "LayerArn", js.undefined)
    
    @scala.inline
    def setLayerVersionArn(value: LayerVersionArn): Self = StObject.set(x, "LayerVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerVersionArnUndefined: Self = StObject.set(x, "LayerVersionArn", js.undefined)
    
    @scala.inline
    def setLicenseInfo(value: LicenseInfo): Self = StObject.set(x, "LicenseInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseInfoUndefined: Self = StObject.set(x, "LicenseInfo", js.undefined)
    
    @scala.inline
    def setVersion(value: LayerVersionNumber): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
