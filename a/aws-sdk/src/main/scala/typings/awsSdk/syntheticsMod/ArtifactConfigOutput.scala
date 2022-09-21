package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactConfigOutput extends StObject {
  
  /**
    * A structure that contains the configuration of encryption settings for canary artifacts that are stored in Amazon S3. 
    */
  var S3Encryption: js.UndefOr[S3EncryptionConfig] = js.undefined
}
object ArtifactConfigOutput {
  
  inline def apply(): ArtifactConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactConfigOutput]
  }
  
  extension [Self <: ArtifactConfigOutput](x: Self) {
    
    inline def setS3Encryption(value: S3EncryptionConfig): Self = StObject.set(x, "S3Encryption", value.asInstanceOf[js.Any])
    
    inline def setS3EncryptionUndefined: Self = StObject.set(x, "S3Encryption", js.undefined)
  }
}
