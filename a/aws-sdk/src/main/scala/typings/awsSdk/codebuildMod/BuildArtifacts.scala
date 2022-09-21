package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildArtifacts extends StObject {
  
  /**
    *  An identifier for this artifact definition. 
    */
  var artifactIdentifier: js.UndefOr[String] = js.undefined
  
  var bucketOwnerAccess: js.UndefOr[BucketOwnerAccess] = js.undefined
  
  /**
    *  Information that tells you if encryption for build artifacts is disabled. 
    */
  var encryptionDisabled: js.UndefOr[WrapperBoolean] = js.undefined
  
  /**
    * Information about the location of the build artifacts.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The MD5 hash of the build artifact. You can use this hash along with a checksum tool to confirm file integrity and authenticity.  This value is available only if the build project's packaging value is set to ZIP. 
    */
  var md5sum: js.UndefOr[String] = js.undefined
  
  /**
    *  If this flag is set, a name specified in the buildspec file overrides the artifact name. The name specified in a buildspec file is calculated at build time and uses the Shell Command Language. For example, you can append a date and time to your artifact name so that it is always unique. 
    */
  var overrideArtifactName: js.UndefOr[WrapperBoolean] = js.undefined
  
  /**
    * The SHA-256 hash of the build artifact. You can use this hash along with a checksum tool to confirm file integrity and authenticity.  This value is available only if the build project's packaging value is set to ZIP. 
    */
  var sha256sum: js.UndefOr[String] = js.undefined
}
object BuildArtifacts {
  
  inline def apply(): BuildArtifacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildArtifacts]
  }
  
  extension [Self <: BuildArtifacts](x: Self) {
    
    inline def setArtifactIdentifier(value: String): Self = StObject.set(x, "artifactIdentifier", value.asInstanceOf[js.Any])
    
    inline def setArtifactIdentifierUndefined: Self = StObject.set(x, "artifactIdentifier", js.undefined)
    
    inline def setBucketOwnerAccess(value: BucketOwnerAccess): Self = StObject.set(x, "bucketOwnerAccess", value.asInstanceOf[js.Any])
    
    inline def setBucketOwnerAccessUndefined: Self = StObject.set(x, "bucketOwnerAccess", js.undefined)
    
    inline def setEncryptionDisabled(value: WrapperBoolean): Self = StObject.set(x, "encryptionDisabled", value.asInstanceOf[js.Any])
    
    inline def setEncryptionDisabledUndefined: Self = StObject.set(x, "encryptionDisabled", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMd5sum(value: String): Self = StObject.set(x, "md5sum", value.asInstanceOf[js.Any])
    
    inline def setMd5sumUndefined: Self = StObject.set(x, "md5sum", js.undefined)
    
    inline def setOverrideArtifactName(value: WrapperBoolean): Self = StObject.set(x, "overrideArtifactName", value.asInstanceOf[js.Any])
    
    inline def setOverrideArtifactNameUndefined: Self = StObject.set(x, "overrideArtifactName", js.undefined)
    
    inline def setSha256sum(value: String): Self = StObject.set(x, "sha256sum", value.asInstanceOf[js.Any])
    
    inline def setSha256sumUndefined: Self = StObject.set(x, "sha256sum", js.undefined)
  }
}
