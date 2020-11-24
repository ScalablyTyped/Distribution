package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3DestinationSettings extends js.Object {
  
  /**
    * Optional. Have MediaConvert automatically apply Amazon S3 access control for the outputs in this output group. When you don't use this setting, S3 automatically applies the default access control list PRIVATE.
    */
  var AccessControl: js.UndefOr[S3DestinationAccessControl] = js.native
  
  /**
    * Settings for how your job outputs are encrypted as they are uploaded to Amazon S3.
    */
  var Encryption: js.UndefOr[S3EncryptionSettings] = js.native
}
object S3DestinationSettings {
  
  @scala.inline
  def apply(): S3DestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3DestinationSettings]
  }
  
  @scala.inline
  implicit class S3DestinationSettingsOps[Self <: S3DestinationSettings] (val x: Self) extends AnyVal {
    
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
    def setAccessControl(value: S3DestinationAccessControl): Self = this.set("AccessControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessControl: Self = this.set("AccessControl", js.undefined)
    
    @scala.inline
    def setEncryption(value: S3EncryptionSettings): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
  }
}
