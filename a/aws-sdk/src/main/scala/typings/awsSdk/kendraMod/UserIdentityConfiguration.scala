package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserIdentityConfiguration extends StObject {
  
  /**
    * The Amazon Web Services SSO field name that contains the identifiers of your users, such as their emails. This is used for user context filtering and for granting access to your Amazon Kendra experience. You must set up Amazon Web Services SSO with Amazon Kendra. You must include your users and groups in your Access Control List when you ingest documents into your index. For more information, see Getting started with an Amazon Web Services SSO identity source.
    */
  var IdentityAttributeName: js.UndefOr[typings.awsSdk.kendraMod.IdentityAttributeName] = js.undefined
}
object UserIdentityConfiguration {
  
  inline def apply(): UserIdentityConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserIdentityConfiguration]
  }
  
  extension [Self <: UserIdentityConfiguration](x: Self) {
    
    inline def setIdentityAttributeName(value: IdentityAttributeName): Self = StObject.set(x, "IdentityAttributeName", value.asInstanceOf[js.Any])
    
    inline def setIdentityAttributeNameUndefined: Self = StObject.set(x, "IdentityAttributeName", js.undefined)
  }
}
