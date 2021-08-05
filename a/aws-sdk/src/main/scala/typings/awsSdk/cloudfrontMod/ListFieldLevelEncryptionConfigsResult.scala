package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFieldLevelEncryptionConfigsResult extends StObject {
  
  /**
    * Returns a list of all field-level encryption configurations that have been created in CloudFront for this account.
    */
  var FieldLevelEncryptionList: js.UndefOr[typings.awsSdk.cloudfrontMod.FieldLevelEncryptionList] = js.undefined
}
object ListFieldLevelEncryptionConfigsResult {
  
  inline def apply(): ListFieldLevelEncryptionConfigsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFieldLevelEncryptionConfigsResult]
  }
  
  extension [Self <: ListFieldLevelEncryptionConfigsResult](x: Self) {
    
    inline def setFieldLevelEncryptionList(value: FieldLevelEncryptionList): Self = StObject.set(x, "FieldLevelEncryptionList", value.asInstanceOf[js.Any])
    
    inline def setFieldLevelEncryptionListUndefined: Self = StObject.set(x, "FieldLevelEncryptionList", js.undefined)
  }
}
