package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFieldLevelEncryptionProfilesResult extends StObject {
  
  /**
    * Returns a list of the field-level encryption profiles that have been created in CloudFront for this account.
    */
  var FieldLevelEncryptionProfileList: js.UndefOr[typings.awsSdk.cloudfrontMod.FieldLevelEncryptionProfileList] = js.native
}
object ListFieldLevelEncryptionProfilesResult {
  
  @scala.inline
  def apply(): ListFieldLevelEncryptionProfilesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFieldLevelEncryptionProfilesResult]
  }
  
  @scala.inline
  implicit class ListFieldLevelEncryptionProfilesResultMutableBuilder[Self <: ListFieldLevelEncryptionProfilesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldLevelEncryptionProfileList(value: FieldLevelEncryptionProfileList): Self = StObject.set(x, "FieldLevelEncryptionProfileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldLevelEncryptionProfileListUndefined: Self = StObject.set(x, "FieldLevelEncryptionProfileList", js.undefined)
  }
}
