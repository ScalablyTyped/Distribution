package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFieldLevelEncryptionConfigsResult extends js.Object {
  
  /**
    * Returns a list of all field-level encryption configurations that have been created in CloudFront for this account.
    */
  var FieldLevelEncryptionList: js.UndefOr[typings.awsSdk.cloudfrontMod.FieldLevelEncryptionList] = js.native
}
object ListFieldLevelEncryptionConfigsResult {
  
  @scala.inline
  def apply(): ListFieldLevelEncryptionConfigsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFieldLevelEncryptionConfigsResult]
  }
  
  @scala.inline
  implicit class ListFieldLevelEncryptionConfigsResultOps[Self <: ListFieldLevelEncryptionConfigsResult] (val x: Self) extends AnyVal {
    
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
    def setFieldLevelEncryptionList(value: FieldLevelEncryptionList): Self = this.set("FieldLevelEncryptionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldLevelEncryptionList: Self = this.set("FieldLevelEncryptionList", js.undefined)
  }
}
