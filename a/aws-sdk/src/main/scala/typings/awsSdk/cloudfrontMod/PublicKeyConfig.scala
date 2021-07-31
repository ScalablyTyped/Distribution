package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyConfig extends StObject {
  
  /**
    * A string included in the request to help make sure that the request can’t be replayed.
    */
  var CallerReference: String
  
  /**
    * A comment to describe the public key.
    */
  var Comment: js.UndefOr[String] = js.undefined
  
  /**
    * The public key that you can use with signed URLs and signed cookies, or with field-level encryption.
    */
  var EncodedKey: String
  
  /**
    * A name to help identify the public key.
    */
  var Name: String
}
object PublicKeyConfig {
  
  @scala.inline
  def apply(CallerReference: String, EncodedKey: String, Name: String): PublicKeyConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], EncodedKey = EncodedKey.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyConfig]
  }
  
  @scala.inline
  implicit class PublicKeyConfigMutableBuilder[Self <: PublicKeyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallerReference(value: String): Self = StObject.set(x, "CallerReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setEncodedKey(value: String): Self = StObject.set(x, "EncodedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
