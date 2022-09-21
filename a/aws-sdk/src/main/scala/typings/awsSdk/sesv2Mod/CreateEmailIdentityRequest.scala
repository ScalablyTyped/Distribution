package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEmailIdentityRequest extends StObject {
  
  /**
    * The configuration set to use by default when sending from this identity. Note that any configuration set defined in the email sending request takes precedence. 
    */
  var ConfigurationSetName: js.UndefOr[typings.awsSdk.sesv2Mod.ConfigurationSetName] = js.undefined
  
  /**
    * If your request includes this object, Amazon SES configures the identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, or, configures the key length to be used for Easy DKIM. You can only specify this object if the email identity is a domain, as opposed to an address.
    */
  var DkimSigningAttributes: js.UndefOr[typings.awsSdk.sesv2Mod.DkimSigningAttributes] = js.undefined
  
  /**
    * The email address or domain to verify.
    */
  var EmailIdentity: Identity
  
  /**
    * An array of objects that define the tags (keys and values) to associate with the email identity.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateEmailIdentityRequest {
  
  inline def apply(EmailIdentity: Identity): CreateEmailIdentityRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEmailIdentityRequest]
  }
  
  extension [Self <: CreateEmailIdentityRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    inline def setDkimSigningAttributes(value: DkimSigningAttributes): Self = StObject.set(x, "DkimSigningAttributes", value.asInstanceOf[js.Any])
    
    inline def setDkimSigningAttributesUndefined: Self = StObject.set(x, "DkimSigningAttributes", js.undefined)
    
    inline def setEmailIdentity(value: Identity): Self = StObject.set(x, "EmailIdentity", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
