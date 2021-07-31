package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityInfo extends StObject {
  
  /**
    * The address or domain of the identity.
    */
  var IdentityName: js.UndefOr[Identity] = js.undefined
  
  /**
    * The email identity type. The identity type can be one of the following:    EMAIL_ADDRESS – The identity is an email address.    DOMAIN – The identity is a domain.    MANAGED_DOMAIN – The identity is a domain that is managed by AWS.  
    */
  var IdentityType: js.UndefOr[typings.awsSdk.sesv2Mod.IdentityType] = js.undefined
  
  /**
    * Indicates whether or not you can send email from the identity. An identity is an email address or domain that you send email from. Before you can send email from an identity, you have to demostrate that you own the identity, and that you authorize Amazon SES to send email from that identity.
    */
  var SendingEnabled: js.UndefOr[Enabled] = js.undefined
}
object IdentityInfo {
  
  @scala.inline
  def apply(): IdentityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityInfo]
  }
  
  @scala.inline
  implicit class IdentityInfoMutableBuilder[Self <: IdentityInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityName(value: Identity): Self = StObject.set(x, "IdentityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityNameUndefined: Self = StObject.set(x, "IdentityName", js.undefined)
    
    @scala.inline
    def setIdentityType(value: IdentityType): Self = StObject.set(x, "IdentityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityTypeUndefined: Self = StObject.set(x, "IdentityType", js.undefined)
    
    @scala.inline
    def setSendingEnabled(value: Enabled): Self = StObject.set(x, "SendingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendingEnabledUndefined: Self = StObject.set(x, "SendingEnabled", js.undefined)
  }
}
