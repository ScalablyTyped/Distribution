package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportServerSideEncryption extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the the AWS KMS key you want to use to encrypt the Amazon S3 objects. This parameter is required if you choose aws:kms as an encryption type.
    */
  var KmsKeyArn: js.UndefOr[string] = js.native
  
  /**
    * The type of server side encryption used for encrypting the objects in Amazon S3.
    */
  var Type: ServerSideEncryptionTypes = js.native
}
object ExportServerSideEncryption {
  
  @scala.inline
  def apply(Type: ServerSideEncryptionTypes): ExportServerSideEncryption = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportServerSideEncryption]
  }
  
  @scala.inline
  implicit class ExportServerSideEncryptionMutableBuilder[Self <: ExportServerSideEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyArn(value: string): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
    
    @scala.inline
    def setType(value: ServerSideEncryptionTypes): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
