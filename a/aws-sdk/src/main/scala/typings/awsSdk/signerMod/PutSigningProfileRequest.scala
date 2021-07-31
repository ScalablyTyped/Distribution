package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSigningProfileRequest extends StObject {
  
  /**
    * A subfield of platform. This specifies any different configuration options that you want to apply to the chosen platform (such as a different hash-algorithm or signing-algorithm).
    */
  var overrides: js.UndefOr[SigningPlatformOverrides] = js.undefined
  
  /**
    * The ID of the signing platform to be created.
    */
  var platformId: PlatformId
  
  /**
    * The name of the signing profile to be created.
    */
  var profileName: ProfileName
  
  /**
    * The AWS Certificate Manager certificate that will be used to sign code with the new signing profile.
    */
  var signingMaterial: SigningMaterial
  
  /**
    * Map of key-value pairs for signing. These can include any information that you want to use during signing.
    */
  var signingParameters: js.UndefOr[SigningParameters] = js.undefined
  
  /**
    * Tags to be associated with the signing profile that is being created.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object PutSigningProfileRequest {
  
  @scala.inline
  def apply(platformId: PlatformId, profileName: ProfileName, signingMaterial: SigningMaterial): PutSigningProfileRequest = {
    val __obj = js.Dynamic.literal(platformId = platformId.asInstanceOf[js.Any], profileName = profileName.asInstanceOf[js.Any], signingMaterial = signingMaterial.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSigningProfileRequest]
  }
  
  @scala.inline
  implicit class PutSigningProfileRequestMutableBuilder[Self <: PutSigningProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverrides(value: SigningPlatformOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setPlatformId(value: PlatformId): Self = StObject.set(x, "platformId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileName(value: ProfileName): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningMaterial(value: SigningMaterial): Self = StObject.set(x, "signingMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningParameters(value: SigningParameters): Self = StObject.set(x, "signingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningParametersUndefined: Self = StObject.set(x, "signingParameters", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
