package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeySummary extends StObject {
  
  /**
    * A comment to describe the public key.
    */
  var Comment: js.UndefOr[String] = js.native
  
  /**
    * The date and time when the public key was uploaded.
    */
  var CreatedTime: timestamp = js.native
  
  /**
    * The public key.
    */
  var EncodedKey: String = js.native
  
  /**
    * The identifier of the public key.
    */
  var Id: String = js.native
  
  /**
    * A name to help identify the public key.
    */
  var Name: String = js.native
}
object PublicKeySummary {
  
  @scala.inline
  def apply(CreatedTime: timestamp, EncodedKey: String, Id: String, Name: String): PublicKeySummary = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime.asInstanceOf[js.Any], EncodedKey = EncodedKey.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeySummary]
  }
  
  @scala.inline
  implicit class PublicKeySummaryMutableBuilder[Self <: PublicKeySummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: timestamp): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedKey(value: String): Self = StObject.set(x, "EncodedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
