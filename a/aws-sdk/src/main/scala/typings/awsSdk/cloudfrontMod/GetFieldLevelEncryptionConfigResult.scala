package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFieldLevelEncryptionConfigResult extends StObject {
  
  /**
    * The current version of the field level encryption configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * Return the field-level encryption configuration information.
    */
  var FieldLevelEncryptionConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.FieldLevelEncryptionConfig] = js.native
}
object GetFieldLevelEncryptionConfigResult {
  
  @scala.inline
  def apply(): GetFieldLevelEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFieldLevelEncryptionConfigResult]
  }
  
  @scala.inline
  implicit class GetFieldLevelEncryptionConfigResultMutableBuilder[Self <: GetFieldLevelEncryptionConfigResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setFieldLevelEncryptionConfig(value: FieldLevelEncryptionConfig): Self = StObject.set(x, "FieldLevelEncryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldLevelEncryptionConfigUndefined: Self = StObject.set(x, "FieldLevelEncryptionConfig", js.undefined)
  }
}
