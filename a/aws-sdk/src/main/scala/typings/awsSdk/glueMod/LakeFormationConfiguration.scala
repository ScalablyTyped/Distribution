package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LakeFormationConfiguration extends StObject {
  
  /**
    * Required for cross account crawls. For same account crawls as the target data, this can be left as null.
    */
  var AccountId: js.UndefOr[typings.awsSdk.glueMod.AccountId] = js.undefined
  
  /**
    * Specifies whether to use Lake Formation credentials for the crawler instead of the IAM role credentials.
    */
  var UseLakeFormationCredentials: js.UndefOr[NullableBoolean] = js.undefined
}
object LakeFormationConfiguration {
  
  inline def apply(): LakeFormationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LakeFormationConfiguration]
  }
  
  extension [Self <: LakeFormationConfiguration](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setUseLakeFormationCredentials(value: NullableBoolean): Self = StObject.set(x, "UseLakeFormationCredentials", value.asInstanceOf[js.Any])
    
    inline def setUseLakeFormationCredentialsUndefined: Self = StObject.set(x, "UseLakeFormationCredentials", js.undefined)
  }
}
