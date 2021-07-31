package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSigningPlatformResponse extends StObject {
  
  /**
    * The category type of the target signing platform.
    */
  var category: js.UndefOr[Category] = js.undefined
  
  /**
    * The display name of the target signing platform.
    */
  var displayName: js.UndefOr[DisplayName] = js.undefined
  
  /**
    * The maximum size (in MB) of the payload that can be signed by the target platform.
    */
  var maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.undefined
  
  /**
    * A list of partner entities that use the target signing platform.
    */
  var partner: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the target signing platform.
    */
  var platformId: js.UndefOr[PlatformId] = js.undefined
  
  /**
    * A list of configurations applied to the target platform at signing.
    */
  var signingConfiguration: js.UndefOr[SigningConfiguration] = js.undefined
  
  /**
    * The format of the target platform's signing image.
    */
  var signingImageFormat: js.UndefOr[SigningImageFormat] = js.undefined
  
  /**
    * The validation template that is used by the target signing platform.
    */
  var target: js.UndefOr[String] = js.undefined
}
object GetSigningPlatformResponse {
  
  @scala.inline
  def apply(): GetSigningPlatformResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSigningPlatformResponse]
  }
  
  @scala.inline
  implicit class GetSigningPlatformResponseMutableBuilder[Self <: GetSigningPlatformResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: Category): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setMaxSizeInMB(value: MaxSizeInMB): Self = StObject.set(x, "maxSizeInMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeInMBUndefined: Self = StObject.set(x, "maxSizeInMB", js.undefined)
    
    @scala.inline
    def setPartner(value: String): Self = StObject.set(x, "partner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerUndefined: Self = StObject.set(x, "partner", js.undefined)
    
    @scala.inline
    def setPlatformId(value: PlatformId): Self = StObject.set(x, "platformId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformIdUndefined: Self = StObject.set(x, "platformId", js.undefined)
    
    @scala.inline
    def setSigningConfiguration(value: SigningConfiguration): Self = StObject.set(x, "signingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningConfigurationUndefined: Self = StObject.set(x, "signingConfiguration", js.undefined)
    
    @scala.inline
    def setSigningImageFormat(value: SigningImageFormat): Self = StObject.set(x, "signingImageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningImageFormatUndefined: Self = StObject.set(x, "signingImageFormat", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
