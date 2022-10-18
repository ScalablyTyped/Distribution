package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosClientBrandingAttributes extends StObject {
  
  /**
    * The forgotten password link. This is the web address that users can go to if they forget the password for their WorkSpace.
    */
  var ForgotPasswordLink: js.UndefOr[ClientUrl] = js.undefined
  
  /**
    * The login message. Specified as a key value pair, in which the key is a locale and the value is the localized message for that locale. The only key supported is en_US. The HTML tags supported include the following: a, b, blockquote, br, cite, code, dd, dl, dt, div, em, i, li, ol, p, pre, q, small, span, strike, strong, sub, sup, u, ul.
    */
  var LoginMessage: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.LoginMessage] = js.undefined
  
  /**
    * The @2x version of the logo. This is the higher resolution display that offers a scale factor of 2.0 (or @2x). The only image format accepted is a binary data object that is converted from a .png file.   For more information about iOS image size and resolution, see Image Size and Resolution  in the Apple Human Interface Guidelines. 
    */
  var Logo2xUrl: js.UndefOr[ClientUrl] = js.undefined
  
  /**
    * The @3x version of the logo. This is the higher resolution display that offers a scale factor of 3.0 (or @3x).The only image format accepted is a binary data object that is converted from a .png file.   For more information about iOS image size and resolution, see Image Size and Resolution  in the Apple Human Interface Guidelines. 
    */
  var Logo3xUrl: js.UndefOr[ClientUrl] = js.undefined
  
  /**
    * The logo. This is the standard-resolution display that has a 1:1 pixel density (or @1x), where one pixel is equal to one point. The only image format accepted is a binary data object that is converted from a .png file.
    */
  var LogoUrl: js.UndefOr[ClientUrl] = js.undefined
  
  /**
    * The support email. The company's customer support email address.    In each platform type, the SupportEmail and SupportLink parameters are mutually exclusive. You can specify one parameter for each platform type, but not both.   The default email is workspaces-feedback@amazon.com.   
    */
  var SupportEmail: js.UndefOr[ClientEmail] = js.undefined
  
  /**
    * The support link. The link for the company's customer support page for their WorkSpace.    In each platform type, the SupportEmail and SupportLink parameters are mutually exclusive. You can specify one parameter for each platform type, but not both.   The default support link is workspaces-feedback@amazon.com.   
    */
  var SupportLink: js.UndefOr[ClientUrl] = js.undefined
}
object IosClientBrandingAttributes {
  
  inline def apply(): IosClientBrandingAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosClientBrandingAttributes]
  }
  
  extension [Self <: IosClientBrandingAttributes](x: Self) {
    
    inline def setForgotPasswordLink(value: ClientUrl): Self = StObject.set(x, "ForgotPasswordLink", value.asInstanceOf[js.Any])
    
    inline def setForgotPasswordLinkUndefined: Self = StObject.set(x, "ForgotPasswordLink", js.undefined)
    
    inline def setLoginMessage(value: LoginMessage): Self = StObject.set(x, "LoginMessage", value.asInstanceOf[js.Any])
    
    inline def setLoginMessageUndefined: Self = StObject.set(x, "LoginMessage", js.undefined)
    
    inline def setLogo2xUrl(value: ClientUrl): Self = StObject.set(x, "Logo2xUrl", value.asInstanceOf[js.Any])
    
    inline def setLogo2xUrlUndefined: Self = StObject.set(x, "Logo2xUrl", js.undefined)
    
    inline def setLogo3xUrl(value: ClientUrl): Self = StObject.set(x, "Logo3xUrl", value.asInstanceOf[js.Any])
    
    inline def setLogo3xUrlUndefined: Self = StObject.set(x, "Logo3xUrl", js.undefined)
    
    inline def setLogoUrl(value: ClientUrl): Self = StObject.set(x, "LogoUrl", value.asInstanceOf[js.Any])
    
    inline def setLogoUrlUndefined: Self = StObject.set(x, "LogoUrl", js.undefined)
    
    inline def setSupportEmail(value: ClientEmail): Self = StObject.set(x, "SupportEmail", value.asInstanceOf[js.Any])
    
    inline def setSupportEmailUndefined: Self = StObject.set(x, "SupportEmail", js.undefined)
    
    inline def setSupportLink(value: ClientUrl): Self = StObject.set(x, "SupportLink", value.asInstanceOf[js.Any])
    
    inline def setSupportLinkUndefined: Self = StObject.set(x, "SupportLink", js.undefined)
  }
}
