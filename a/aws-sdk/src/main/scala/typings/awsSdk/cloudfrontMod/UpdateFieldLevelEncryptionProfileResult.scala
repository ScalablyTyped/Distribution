package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFieldLevelEncryptionProfileResult extends StObject {
  
  /**
    * The result of the field-level encryption profile request. 
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * Return the results of updating the profile.
    */
  var FieldLevelEncryptionProfile: js.UndefOr[typings.awsSdk.cloudfrontMod.FieldLevelEncryptionProfile] = js.undefined
}
object UpdateFieldLevelEncryptionProfileResult {
  
  @scala.inline
  def apply(): UpdateFieldLevelEncryptionProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFieldLevelEncryptionProfileResult]
  }
  
  @scala.inline
  implicit class UpdateFieldLevelEncryptionProfileResultMutableBuilder[Self <: UpdateFieldLevelEncryptionProfileResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setFieldLevelEncryptionProfile(value: FieldLevelEncryptionProfile): Self = StObject.set(x, "FieldLevelEncryptionProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldLevelEncryptionProfileUndefined: Self = StObject.set(x, "FieldLevelEncryptionProfile", js.undefined)
  }
}
