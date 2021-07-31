package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DestinationSettings extends StObject {
  
  /**
    * Optional. Have MediaConvert automatically apply Amazon S3 access control for the outputs in this output group. When you don't use this setting, S3 automatically applies the default access control list PRIVATE.
    */
  var AccessControl: js.UndefOr[S3DestinationAccessControl] = js.undefined
  
  /**
    * Settings for how your job outputs are encrypted as they are uploaded to Amazon S3.
    */
  var Encryption: js.UndefOr[S3EncryptionSettings] = js.undefined
}
object S3DestinationSettings {
  
  @scala.inline
  def apply(): S3DestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3DestinationSettings]
  }
  
  @scala.inline
  implicit class S3DestinationSettingsMutableBuilder[Self <: S3DestinationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControl(value: S3DestinationAccessControl): Self = StObject.set(x, "AccessControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessControlUndefined: Self = StObject.set(x, "AccessControl", js.undefined)
    
    @scala.inline
    def setEncryption(value: S3EncryptionSettings): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
  }
}
