package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldLevelEncryptionProfileSummary extends StObject {
  
  /**
    * An optional comment for the field-level encryption profile summary.
    */
  var Comment: js.UndefOr[String] = js.native
  
  /**
    * A complex data type of encryption entities for the field-level encryption profile that include the public key ID, provider, and field patterns for specifying which fields to encrypt with this key.
    */
  var EncryptionEntities: typings.awsSdk.cloudfrontMod.EncryptionEntities = js.native
  
  /**
    * ID for the field-level encryption profile summary.
    */
  var Id: String = js.native
  
  /**
    * The time when the the field-level encryption profile summary was last updated.
    */
  var LastModifiedTime: timestamp = js.native
  
  /**
    * Name for the field-level encryption profile summary.
    */
  var Name: String = js.native
}
object FieldLevelEncryptionProfileSummary {
  
  @scala.inline
  def apply(EncryptionEntities: EncryptionEntities, Id: String, LastModifiedTime: timestamp, Name: String): FieldLevelEncryptionProfileSummary = {
    val __obj = js.Dynamic.literal(EncryptionEntities = EncryptionEntities.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionProfileSummary]
  }
  
  @scala.inline
  implicit class FieldLevelEncryptionProfileSummaryMutableBuilder[Self <: FieldLevelEncryptionProfileSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setEncryptionEntities(value: EncryptionEntities): Self = StObject.set(x, "EncryptionEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
