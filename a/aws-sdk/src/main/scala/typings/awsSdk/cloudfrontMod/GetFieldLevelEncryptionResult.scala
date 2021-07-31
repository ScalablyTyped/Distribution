package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFieldLevelEncryptionResult extends StObject {
  
  /**
    * The current version of the field level encryption configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * Return the field-level encryption configuration information.
    */
  var FieldLevelEncryption: js.UndefOr[typings.awsSdk.cloudfrontMod.FieldLevelEncryption] = js.undefined
}
object GetFieldLevelEncryptionResult {
  
  @scala.inline
  def apply(): GetFieldLevelEncryptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFieldLevelEncryptionResult]
  }
  
  @scala.inline
  implicit class GetFieldLevelEncryptionResultMutableBuilder[Self <: GetFieldLevelEncryptionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setFieldLevelEncryption(value: FieldLevelEncryption): Self = StObject.set(x, "FieldLevelEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldLevelEncryptionUndefined: Self = StObject.set(x, "FieldLevelEncryption", js.undefined)
  }
}
