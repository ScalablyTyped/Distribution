package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformEncryption extends StObject {
  
  /**
    * An MLUserDataEncryption object containing the encryption mode and customer-provided KMS key ID.
    */
  var MlUserDataEncryption: js.UndefOr[MLUserDataEncryption] = js.undefined
  
  /**
    * The name of the security configuration.
    */
  var TaskRunSecurityConfigurationName: js.UndefOr[NameString] = js.undefined
}
object TransformEncryption {
  
  @scala.inline
  def apply(): TransformEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformEncryption]
  }
  
  @scala.inline
  implicit class TransformEncryptionMutableBuilder[Self <: TransformEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMlUserDataEncryption(value: MLUserDataEncryption): Self = StObject.set(x, "MlUserDataEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMlUserDataEncryptionUndefined: Self = StObject.set(x, "MlUserDataEncryption", js.undefined)
    
    @scala.inline
    def setTaskRunSecurityConfigurationName(value: NameString): Self = StObject.set(x, "TaskRunSecurityConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskRunSecurityConfigurationNameUndefined: Self = StObject.set(x, "TaskRunSecurityConfigurationName", js.undefined)
  }
}
