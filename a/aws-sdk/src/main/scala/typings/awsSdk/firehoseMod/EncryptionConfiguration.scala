package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptionConfiguration extends js.Object {
  
  /**
    * The encryption key.
    */
  var KMSEncryptionConfig: js.UndefOr[typings.awsSdk.firehoseMod.KMSEncryptionConfig] = js.native
  
  /**
    * Specifically override existing encryption information to ensure that no encryption is used.
    */
  var NoEncryptionConfig: js.UndefOr[typings.awsSdk.firehoseMod.NoEncryptionConfig] = js.native
}
object EncryptionConfiguration {
  
  @scala.inline
  def apply(): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionConfiguration]
  }
  
  @scala.inline
  implicit class EncryptionConfigurationOps[Self <: EncryptionConfiguration] (val x: Self) extends AnyVal {
    
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
    def setKMSEncryptionConfig(value: KMSEncryptionConfig): Self = this.set("KMSEncryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKMSEncryptionConfig: Self = this.set("KMSEncryptionConfig", js.undefined)
    
    @scala.inline
    def setNoEncryptionConfig(value: NoEncryptionConfig): Self = this.set("NoEncryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoEncryptionConfig: Self = this.set("NoEncryptionConfig", js.undefined)
  }
}
