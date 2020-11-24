package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyConfig extends js.Object {
  
  /**
    * A string included in the request to help make sure that the request can’t be replayed.
    */
  var CallerReference: String = js.native
  
  /**
    * A comment to describe the public key.
    */
  var Comment: js.UndefOr[String] = js.native
  
  /**
    * The public key that you can use with signed URLs and signed cookies, or with field-level encryption.
    */
  var EncodedKey: String = js.native
  
  /**
    * A name to help identify the public key.
    */
  var Name: String = js.native
}
object PublicKeyConfig {
  
  @scala.inline
  def apply(CallerReference: String, EncodedKey: String, Name: String): PublicKeyConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], EncodedKey = EncodedKey.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyConfig]
  }
  
  @scala.inline
  implicit class PublicKeyConfigOps[Self <: PublicKeyConfig] (val x: Self) extends AnyVal {
    
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
    def setCallerReference(value: String): Self = this.set("CallerReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedKey(value: String): Self = this.set("EncodedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
  }
}
