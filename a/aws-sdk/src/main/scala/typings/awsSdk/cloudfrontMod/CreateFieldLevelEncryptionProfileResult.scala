package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFieldLevelEncryptionProfileResult extends js.Object {
  
  /**
    * The current version of the field level encryption profile. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * Returned when you create a new field-level encryption profile.
    */
  var FieldLevelEncryptionProfile: js.UndefOr[typings.awsSdk.cloudfrontMod.FieldLevelEncryptionProfile] = js.native
  
  /**
    * The fully qualified URI of the new profile resource just created.
    */
  var Location: js.UndefOr[String] = js.native
}
object CreateFieldLevelEncryptionProfileResult {
  
  @scala.inline
  def apply(): CreateFieldLevelEncryptionProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFieldLevelEncryptionProfileResult]
  }
  
  @scala.inline
  implicit class CreateFieldLevelEncryptionProfileResultOps[Self <: CreateFieldLevelEncryptionProfileResult] (val x: Self) extends AnyVal {
    
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
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    
    @scala.inline
    def setFieldLevelEncryptionProfile(value: FieldLevelEncryptionProfile): Self = this.set("FieldLevelEncryptionProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldLevelEncryptionProfile: Self = this.set("FieldLevelEncryptionProfile", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
  }
}
