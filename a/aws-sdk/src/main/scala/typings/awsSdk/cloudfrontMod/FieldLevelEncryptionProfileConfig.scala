package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldLevelEncryptionProfileConfig extends StObject {
  
  /**
    * A unique number that ensures that the request can't be replayed.
    */
  var CallerReference: String = js.native
  
  /**
    * An optional comment for the field-level encryption profile.
    */
  var Comment: js.UndefOr[String] = js.native
  
  /**
    * A complex data type of encryption entities for the field-level encryption profile that include the public key ID, provider, and field patterns for specifying which fields to encrypt with this key.
    */
  var EncryptionEntities: typings.awsSdk.cloudfrontMod.EncryptionEntities = js.native
  
  /**
    * Profile name for the field-level encryption profile.
    */
  var Name: String = js.native
}
object FieldLevelEncryptionProfileConfig {
  
  @scala.inline
  def apply(CallerReference: String, EncryptionEntities: EncryptionEntities, Name: String): FieldLevelEncryptionProfileConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], EncryptionEntities = EncryptionEntities.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionProfileConfig]
  }
  
  @scala.inline
  implicit class FieldLevelEncryptionProfileConfigMutableBuilder[Self <: FieldLevelEncryptionProfileConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallerReference(value: String): Self = StObject.set(x, "CallerReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setEncryptionEntities(value: EncryptionEntities): Self = StObject.set(x, "EncryptionEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
