package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLOutputDataConfig extends StObject {
  
  /**
    * The AWS KMS encryption key ID.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.sagemakerMod.KmsKeyId] = js.undefined
  
  /**
    * The Amazon S3 output path. Must be 128 characters or less.
    */
  var S3OutputPath: S3Uri
}
object AutoMLOutputDataConfig {
  
  @scala.inline
  def apply(S3OutputPath: S3Uri): AutoMLOutputDataConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLOutputDataConfig]
  }
  
  @scala.inline
  implicit class AutoMLOutputDataConfigMutableBuilder[Self <: AutoMLOutputDataConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setS3OutputPath(value: S3Uri): Self = StObject.set(x, "S3OutputPath", value.asInstanceOf[js.Any])
  }
}
