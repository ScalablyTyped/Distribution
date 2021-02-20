package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerSideEncryptionConfiguration extends StObject {
  
  /**
    * The identifier of the AWS KMS customer master key (CMK). Amazon Kendra doesn't support asymmetric CMKs.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.kendraMod.KmsKeyId] = js.native
}
object ServerSideEncryptionConfiguration {
  
  @scala.inline
  def apply(): ServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerSideEncryptionConfiguration]
  }
  
  @scala.inline
  implicit class ServerSideEncryptionConfigurationMutableBuilder[Self <: ServerSideEncryptionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
  }
}
