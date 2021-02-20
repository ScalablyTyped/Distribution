package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharingSettings extends StObject {
  
  /**
    * Whether to include the notebook cell output when sharing the notebook. The default is Disabled.
    */
  var NotebookOutputOption: js.UndefOr[typings.awsSdk.sagemakerMod.NotebookOutputOption] = js.native
  
  /**
    * When NotebookOutputOption is Allowed, the AWS Key Management Service (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
    */
  var S3KmsKeyId: js.UndefOr[KmsKeyId] = js.native
  
  /**
    * When NotebookOutputOption is Allowed, the Amazon S3 bucket used to save the notebook cell output.
    */
  var S3OutputPath: js.UndefOr[S3Uri] = js.native
}
object SharingSettings {
  
  @scala.inline
  def apply(): SharingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharingSettings]
  }
  
  @scala.inline
  implicit class SharingSettingsMutableBuilder[Self <: SharingSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebookOutputOption(value: NotebookOutputOption): Self = StObject.set(x, "NotebookOutputOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookOutputOptionUndefined: Self = StObject.set(x, "NotebookOutputOption", js.undefined)
    
    @scala.inline
    def setS3KmsKeyId(value: KmsKeyId): Self = StObject.set(x, "S3KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KmsKeyIdUndefined: Self = StObject.set(x, "S3KmsKeyId", js.undefined)
    
    @scala.inline
    def setS3OutputPath(value: S3Uri): Self = StObject.set(x, "S3OutputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3OutputPathUndefined: Self = StObject.set(x, "S3OutputPath", js.undefined)
  }
}
