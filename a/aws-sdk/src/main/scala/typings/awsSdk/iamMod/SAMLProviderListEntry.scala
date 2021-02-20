package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SAMLProviderListEntry extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the SAML provider.
    */
  var Arn: js.UndefOr[arnType] = js.native
  
  /**
    * The date and time when the SAML provider was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.native
  
  /**
    * The expiration date and time for the SAML provider.
    */
  var ValidUntil: js.UndefOr[dateType] = js.native
}
object SAMLProviderListEntry {
  
  @scala.inline
  def apply(): SAMLProviderListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SAMLProviderListEntry]
  }
  
  @scala.inline
  implicit class SAMLProviderListEntryMutableBuilder[Self <: SAMLProviderListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreateDate(value: dateType): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setValidUntil(value: dateType): Self = StObject.set(x, "ValidUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUntilUndefined: Self = StObject.set(x, "ValidUntil", js.undefined)
  }
}
