package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AliasListEntry extends js.Object {
  
  /**
    * String that contains the key ARN.
    */
  var AliasArn: js.UndefOr[ArnType] = js.native
  
  /**
    * String that contains the alias. This value begins with alias/.
    */
  var AliasName: js.UndefOr[AliasNameType] = js.native
  
  /**
    * String that contains the key identifier referred to by the alias.
    */
  var TargetKeyId: js.UndefOr[KeyIdType] = js.native
}
object AliasListEntry {
  
  @scala.inline
  def apply(): AliasListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasListEntry]
  }
  
  @scala.inline
  implicit class AliasListEntryOps[Self <: AliasListEntry] (val x: Self) extends AnyVal {
    
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
    def setAliasArn(value: ArnType): Self = this.set("AliasArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasArn: Self = this.set("AliasArn", js.undefined)
    
    @scala.inline
    def setAliasName(value: AliasNameType): Self = this.set("AliasName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasName: Self = this.set("AliasName", js.undefined)
    
    @scala.inline
    def setTargetKeyId(value: KeyIdType): Self = this.set("TargetKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetKeyId: Self = this.set("TargetKeyId", js.undefined)
  }
}
