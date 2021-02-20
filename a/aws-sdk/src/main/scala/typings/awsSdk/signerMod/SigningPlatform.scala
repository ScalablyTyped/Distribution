package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigningPlatform extends StObject {
  
  /**
    * The category of a code signing platform.
    */
  var category: js.UndefOr[Category] = js.native
  
  /**
    * The display name of a code signing platform.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The maximum size (in MB) of code that can be signed by a code signing platform.
    */
  var maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.native
  
  /**
    * Any partner entities linked to a code signing platform.
    */
  var partner: js.UndefOr[String] = js.native
  
  /**
    * The ID of a code signing; platform.
    */
  var platformId: js.UndefOr[String] = js.native
  
  /**
    * The configuration of a code signing platform. This includes the designated hash algorithm and encryption algorithm of a signing platform.
    */
  var signingConfiguration: js.UndefOr[SigningConfiguration] = js.native
  
  var signingImageFormat: js.UndefOr[SigningImageFormat] = js.native
  
  /**
    * The types of targets that can be signed by a code signing platform.
    */
  var target: js.UndefOr[String] = js.native
}
object SigningPlatform {
  
  @scala.inline
  def apply(): SigningPlatform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningPlatform]
  }
  
  @scala.inline
  implicit class SigningPlatformMutableBuilder[Self <: SigningPlatform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: Category): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
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
    def setPlatformId(value: String): Self = StObject.set(x, "platformId", value.asInstanceOf[js.Any])
    
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
