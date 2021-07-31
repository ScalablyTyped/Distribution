package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobBookmarksEncryption extends StObject {
  
  /**
    * The encryption mode to use for job bookmarks data.
    */
  var JobBookmarksEncryptionMode: js.UndefOr[typings.awsSdk.glueMod.JobBookmarksEncryptionMode] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var KmsKeyArn: js.UndefOr[typings.awsSdk.glueMod.KmsKeyArn] = js.undefined
}
object JobBookmarksEncryption {
  
  @scala.inline
  def apply(): JobBookmarksEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobBookmarksEncryption]
  }
  
  @scala.inline
  implicit class JobBookmarksEncryptionMutableBuilder[Self <: JobBookmarksEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobBookmarksEncryptionMode(value: JobBookmarksEncryptionMode): Self = StObject.set(x, "JobBookmarksEncryptionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobBookmarksEncryptionModeUndefined: Self = StObject.set(x, "JobBookmarksEncryptionMode", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
  }
}
