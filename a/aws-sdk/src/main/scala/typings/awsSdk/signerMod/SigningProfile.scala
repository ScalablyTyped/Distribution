package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigningProfile extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the signing profile.
    */
  var arn: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * The ID of a platform that is available for use by a signing profile.
    */
  var platformId: js.UndefOr[PlatformId] = js.undefined
  
  /**
    * The name of the signing profile.
    */
  var profileName: js.UndefOr[ProfileName] = js.undefined
  
  /**
    * The ACM certificate that is available for use by a signing profile.
    */
  var signingMaterial: js.UndefOr[SigningMaterial] = js.undefined
  
  /**
    * The parameters that are available for use by a code signing user.
    */
  var signingParameters: js.UndefOr[SigningParameters] = js.undefined
  
  /**
    * The status of a code signing profile.
    */
  var status: js.UndefOr[SigningProfileStatus] = js.undefined
  
  /**
    * A list of tags associated with the signing profile.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object SigningProfile {
  
  inline def apply(): SigningProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningProfile]
  }
  
  extension [Self <: SigningProfile](x: Self) {
    
    inline def setArn(value: java.lang.String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setPlatformId(value: PlatformId): Self = StObject.set(x, "platformId", value.asInstanceOf[js.Any])
    
    inline def setPlatformIdUndefined: Self = StObject.set(x, "platformId", js.undefined)
    
    inline def setProfileName(value: ProfileName): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    inline def setProfileNameUndefined: Self = StObject.set(x, "profileName", js.undefined)
    
    inline def setSigningMaterial(value: SigningMaterial): Self = StObject.set(x, "signingMaterial", value.asInstanceOf[js.Any])
    
    inline def setSigningMaterialUndefined: Self = StObject.set(x, "signingMaterial", js.undefined)
    
    inline def setSigningParameters(value: SigningParameters): Self = StObject.set(x, "signingParameters", value.asInstanceOf[js.Any])
    
    inline def setSigningParametersUndefined: Self = StObject.set(x, "signingParameters", js.undefined)
    
    inline def setStatus(value: SigningProfileStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
