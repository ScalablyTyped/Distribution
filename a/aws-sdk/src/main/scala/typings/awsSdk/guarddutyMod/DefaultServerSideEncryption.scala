package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultServerSideEncryption extends StObject {
  
  /**
    * The type of encryption used for objects within the S3 bucket.
    */
  var EncryptionType: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the KMS encryption key. Only available if the bucket EncryptionType is aws:kms.
    */
  var KmsMasterKeyArn: js.UndefOr[String] = js.native
}
object DefaultServerSideEncryption {
  
  @scala.inline
  def apply(): DefaultServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultServerSideEncryption]
  }
  
  @scala.inline
  implicit class DefaultServerSideEncryptionMutableBuilder[Self <: DefaultServerSideEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionType(value: String): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
    
    @scala.inline
    def setKmsMasterKeyArn(value: String): Self = StObject.set(x, "KmsMasterKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsMasterKeyArnUndefined: Self = StObject.set(x, "KmsMasterKeyArn", js.undefined)
  }
}
