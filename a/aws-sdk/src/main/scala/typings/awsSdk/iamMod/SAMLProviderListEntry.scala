package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SAMLProviderListEntry extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the SAML provider.
    */
  var Arn: js.UndefOr[arnType] = js.undefined
  
  /**
    * The date and time when the SAML provider was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.undefined
  
  /**
    * The expiration date and time for the SAML provider.
    */
  var ValidUntil: js.UndefOr[dateType] = js.undefined
}
object SAMLProviderListEntry {
  
  inline def apply(): SAMLProviderListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SAMLProviderListEntry]
  }
  
  extension [Self <: SAMLProviderListEntry](x: Self) {
    
    inline def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreateDate(value: dateType): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setValidUntil(value: dateType): Self = StObject.set(x, "ValidUntil", value.asInstanceOf[js.Any])
    
    inline def setValidUntilUndefined: Self = StObject.set(x, "ValidUntil", js.undefined)
  }
}
