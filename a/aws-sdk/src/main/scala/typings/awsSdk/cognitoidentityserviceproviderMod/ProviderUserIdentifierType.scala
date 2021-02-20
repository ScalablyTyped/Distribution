package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderUserIdentifierType extends StObject {
  
  /**
    * The name of the provider attribute to link to, for example, NameID.
    */
  var ProviderAttributeName: js.UndefOr[StringType] = js.native
  
  /**
    * The value of the provider attribute to link to, for example, xxxxx_account.
    */
  var ProviderAttributeValue: js.UndefOr[StringType] = js.native
  
  /**
    * The name of the provider, for example, Facebook, Google, or Login with Amazon.
    */
  var ProviderName: js.UndefOr[ProviderNameType] = js.native
}
object ProviderUserIdentifierType {
  
  @scala.inline
  def apply(): ProviderUserIdentifierType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderUserIdentifierType]
  }
  
  @scala.inline
  implicit class ProviderUserIdentifierTypeMutableBuilder[Self <: ProviderUserIdentifierType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProviderAttributeName(value: StringType): Self = StObject.set(x, "ProviderAttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderAttributeNameUndefined: Self = StObject.set(x, "ProviderAttributeName", js.undefined)
    
    @scala.inline
    def setProviderAttributeValue(value: StringType): Self = StObject.set(x, "ProviderAttributeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderAttributeValueUndefined: Self = StObject.set(x, "ProviderAttributeValue", js.undefined)
    
    @scala.inline
    def setProviderName(value: ProviderNameType): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderNameUndefined: Self = StObject.set(x, "ProviderName", js.undefined)
  }
}
