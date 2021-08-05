package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFieldLevelEncryptionProfileResult extends StObject {
  
  /**
    * The current version of the field level encryption profile. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * Return the field-level encryption profile information.
    */
  var FieldLevelEncryptionProfile: js.UndefOr[typings.awsSdk.cloudfrontMod.FieldLevelEncryptionProfile] = js.undefined
}
object GetFieldLevelEncryptionProfileResult {
  
  inline def apply(): GetFieldLevelEncryptionProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFieldLevelEncryptionProfileResult]
  }
  
  extension [Self <: GetFieldLevelEncryptionProfileResult](x: Self) {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setFieldLevelEncryptionProfile(value: FieldLevelEncryptionProfile): Self = StObject.set(x, "FieldLevelEncryptionProfile", value.asInstanceOf[js.Any])
    
    inline def setFieldLevelEncryptionProfileUndefined: Self = StObject.set(x, "FieldLevelEncryptionProfile", js.undefined)
  }
}
