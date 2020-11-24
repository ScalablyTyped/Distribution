package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformEncryption extends js.Object {
  
  /**
    * An MLUserDataEncryption object containing the encryption mode and customer-provided KMS key ID.
    */
  var MlUserDataEncryption: js.UndefOr[MLUserDataEncryption] = js.native
  
  /**
    * The name of the security configuration.
    */
  var TaskRunSecurityConfigurationName: js.UndefOr[NameString] = js.native
}
object TransformEncryption {
  
  @scala.inline
  def apply(): TransformEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformEncryption]
  }
  
  @scala.inline
  implicit class TransformEncryptionOps[Self <: TransformEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMlUserDataEncryption(value: MLUserDataEncryption): Self = this.set("MlUserDataEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMlUserDataEncryption: Self = this.set("MlUserDataEncryption", js.undefined)
    
    @scala.inline
    def setTaskRunSecurityConfigurationName(value: NameString): Self = this.set("TaskRunSecurityConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskRunSecurityConfigurationName: Self = this.set("TaskRunSecurityConfigurationName", js.undefined)
  }
}
