package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigningProfile extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the signing profile.
    */
  var arn: js.UndefOr[java.lang.String] = js.native
  
  /**
    * The ID of a platform that is available for use by a signing profile.
    */
  var platformId: js.UndefOr[PlatformId] = js.native
  
  /**
    * The name of the signing profile.
    */
  var profileName: js.UndefOr[ProfileName] = js.native
  
  /**
    * The ACM certificate that is available for use by a signing profile.
    */
  var signingMaterial: js.UndefOr[SigningMaterial] = js.native
  
  /**
    * The parameters that are available for use by a code signing user.
    */
  var signingParameters: js.UndefOr[SigningParameters] = js.native
  
  /**
    * The status of a code signing profile.
    */
  var status: js.UndefOr[SigningProfileStatus] = js.native
  
  /**
    * A list of tags associated with the signing profile.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object SigningProfile {
  
  @scala.inline
  def apply(): SigningProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningProfile]
  }
  
  @scala.inline
  implicit class SigningProfileMutableBuilder[Self <: SigningProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: java.lang.String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
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
