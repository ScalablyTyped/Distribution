package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptionAtRestOptions extends StObject {
  
  /**
    * Specifies the option to enable Encryption At Rest.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    *  Specifies the KMS Key ID for Encryption At Rest options.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.esMod.KmsKeyId] = js.native
}
object EncryptionAtRestOptions {
  
  @scala.inline
  def apply(): EncryptionAtRestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionAtRestOptions]
  }
  
  @scala.inline
  implicit class EncryptionAtRestOptionsMutableBuilder[Self <: EncryptionAtRestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
  }
}
