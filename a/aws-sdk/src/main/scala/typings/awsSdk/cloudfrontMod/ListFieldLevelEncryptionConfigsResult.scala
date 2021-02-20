package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFieldLevelEncryptionConfigsResult extends StObject {
  
  /**
    * Returns a list of all field-level encryption configurations that have been created in CloudFront for this account.
    */
  var FieldLevelEncryptionList: js.UndefOr[typings.awsSdk.cloudfrontMod.FieldLevelEncryptionList] = js.native
}
object ListFieldLevelEncryptionConfigsResult {
  
  @scala.inline
  def apply(): ListFieldLevelEncryptionConfigsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFieldLevelEncryptionConfigsResult]
  }
  
  @scala.inline
  implicit class ListFieldLevelEncryptionConfigsResultMutableBuilder[Self <: ListFieldLevelEncryptionConfigsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldLevelEncryptionList(value: FieldLevelEncryptionList): Self = StObject.set(x, "FieldLevelEncryptionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldLevelEncryptionListUndefined: Self = StObject.set(x, "FieldLevelEncryptionList", js.undefined)
  }
}
