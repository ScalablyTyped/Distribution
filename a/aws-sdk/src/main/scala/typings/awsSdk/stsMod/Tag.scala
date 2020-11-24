package typings.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tag extends js.Object {
  
  /**
    * The key for a session tag. You can pass up to 50 session tags. The plain text session tag keys can’t exceed 128 characters. For these and additional limits, see IAM and STS Character Limits in the IAM User Guide.
    */
  var Key: tagKeyType = js.native
  
  /**
    * The value for a session tag. You can pass up to 50 session tags. The plain text session tag values can’t exceed 256 characters. For these and additional limits, see IAM and STS Character Limits in the IAM User Guide.
    */
  var Value: tagValueType = js.native
}
object Tag {
  
  @scala.inline
  def apply(Key: tagKeyType, Value: tagValueType): Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  implicit class TagOps[Self <: Tag] (val x: Self) extends AnyVal {
    
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
    def setKey(value: tagKeyType): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: tagValueType): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
