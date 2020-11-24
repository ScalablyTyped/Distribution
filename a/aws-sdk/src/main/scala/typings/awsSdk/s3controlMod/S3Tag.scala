package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Tag extends js.Object {
  
  /**
    * 
    */
  var Key: TagKeyString = js.native
  
  /**
    * 
    */
  var Value: TagValueString = js.native
}
object S3Tag {
  
  @scala.inline
  def apply(Key: TagKeyString, Value: TagValueString): S3Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Tag]
  }
  
  @scala.inline
  implicit class S3TagOps[Self <: S3Tag] (val x: Self) extends AnyVal {
    
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
    def setKey(value: TagKeyString): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TagValueString): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
