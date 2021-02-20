package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSigningProfileResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the signing profile.
    */
  var arn: js.UndefOr[java.lang.String] = js.native
  
  /**
    * A list of overrides applied by the target signing profile for signing operations.
    */
  var overrides: js.UndefOr[SigningPlatformOverrides] = js.native
  
  /**
    * The ID of the platform that is used by the target signing profile.
    */
  var platformId: js.UndefOr[PlatformId] = js.native
  
  /**
    * The name of the target signing profile.
    */
  var profileName: js.UndefOr[ProfileName] = js.native
  
  /**
    * The ARN of the certificate that the target profile uses for signing operations.
    */
  var signingMaterial: js.UndefOr[SigningMaterial] = js.native
  
  /**
    * A map of key-value pairs for signing operations that is attached to the target signing profile.
    */
  var signingParameters: js.UndefOr[SigningParameters] = js.native
  
  /**
    * The status of the target signing profile.
    */
  var status: js.UndefOr[SigningProfileStatus] = js.native
  
  /**
    * A list of tags associated with the signing profile.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object GetSigningProfileResponse {
  
  @scala.inline
  def apply(): GetSigningProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSigningProfileResponse]
  }
  
  @scala.inline
  implicit class GetSigningProfileResponseMutableBuilder[Self <: GetSigningProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: java.lang.String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setOverrides(value: SigningPlatformOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setPlatformId(value: PlatformId): Self = StObject.set(x, "platformId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformIdUndefined: Self = StObject.set(x, "platformId", js.undefined)
    
    @scala.inline
    def setProfileName(value: ProfileName): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileNameUndefined: Self = StObject.set(x, "profileName", js.undefined)
    
    @scala.inline
    def setSigningMaterial(value: SigningMaterial): Self = StObject.set(x, "signingMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningMaterialUndefined: Self = StObject.set(x, "signingMaterial", js.undefined)
    
    @scala.inline
    def setSigningParameters(value: SigningParameters): Self = StObject.set(x, "signingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningParametersUndefined: Self = StObject.set(x, "signingParameters", js.undefined)
    
    @scala.inline
    def setStatus(value: SigningProfileStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
