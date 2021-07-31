package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFieldLevelEncryptionConfigResult extends StObject {
  
  /**
    * The value of the ETag header that you received when updating the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * Return the results of updating the configuration.
    */
  var FieldLevelEncryption: js.UndefOr[typings.awsSdk.cloudfrontMod.FieldLevelEncryption] = js.undefined
}
object UpdateFieldLevelEncryptionConfigResult {
  
  @scala.inline
  def apply(): UpdateFieldLevelEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFieldLevelEncryptionConfigResult]
  }
  
  @scala.inline
  implicit class UpdateFieldLevelEncryptionConfigResultMutableBuilder[Self <: UpdateFieldLevelEncryptionConfigResult] (val x: Self) extends AnyVal {
    
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
