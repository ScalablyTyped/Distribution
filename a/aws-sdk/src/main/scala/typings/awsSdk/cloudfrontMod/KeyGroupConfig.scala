package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyGroupConfig extends js.Object {
  
  /**
    * A comment to describe the key group.
    */
  var Comment: js.UndefOr[String] = js.native
  
  /**
    * A list of the identifiers of the public keys in the key group.
    */
  var Items: PublicKeyIdList = js.native
  
  /**
    * A name to identify the key group.
    */
  var Name: String = js.native
}
object KeyGroupConfig {
  
  @scala.inline
  def apply(Items: PublicKeyIdList, Name: String): KeyGroupConfig = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyGroupConfig]
  }
  
  @scala.inline
  implicit class KeyGroupConfigOps[Self <: KeyGroupConfig] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: String*): Self = this.set("Items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: PublicKeyIdList): Self = this.set("Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
  }
}
