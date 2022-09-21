package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactConfigInput extends StObject {
  
  /**
    * A structure that contains the configuration of the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. Artifact encryption functionality is available only for canaries that use Synthetics runtime version syn-nodejs-puppeteer-3.3 or later. For more information, see Encrypting canary artifacts 
    */
  var S3Encryption: js.UndefOr[S3EncryptionConfig] = js.undefined
}
object ArtifactConfigInput {
  
  inline def apply(): ArtifactConfigInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactConfigInput]
  }
  
  extension [Self <: ArtifactConfigInput](x: Self) {
    
    inline def setS3Encryption(value: S3EncryptionConfig): Self = StObject.set(x, "S3Encryption", value.asInstanceOf[js.Any])
    
    inline def setS3EncryptionUndefined: Self = StObject.set(x, "S3Encryption", js.undefined)
  }
}
