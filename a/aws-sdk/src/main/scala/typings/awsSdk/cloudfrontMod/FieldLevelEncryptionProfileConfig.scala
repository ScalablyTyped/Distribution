package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldLevelEncryptionProfileConfig extends StObject {
  
  /**
    * A unique number that ensures that the request can't be replayed.
    */
  var CallerReference: String
  
  /**
    * An optional comment for the field-level encryption profile. The comment cannot be longer than 128 characters.
    */
  var Comment: js.UndefOr[String] = js.undefined
  
  /**
    * A complex data type of encryption entities for the field-level encryption profile that include the public key ID, provider, and field patterns for specifying which fields to encrypt with this key.
    */
  var EncryptionEntities: typings.awsSdk.cloudfrontMod.EncryptionEntities
  
  /**
    * Profile name for the field-level encryption profile.
    */
  var Name: String
}
object FieldLevelEncryptionProfileConfig {
  
  inline def apply(CallerReference: String, EncryptionEntities: EncryptionEntities, Name: String): FieldLevelEncryptionProfileConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], EncryptionEntities = EncryptionEntities.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionProfileConfig]
  }
  
  extension [Self <: FieldLevelEncryptionProfileConfig](x: Self) {
    
    inline def setCallerReference(value: String): Self = StObject.set(x, "CallerReference", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setEncryptionEntities(value: EncryptionEntities): Self = StObject.set(x, "EncryptionEntities", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
