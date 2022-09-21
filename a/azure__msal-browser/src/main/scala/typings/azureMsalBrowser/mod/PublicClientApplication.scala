package typings.azureMsalBrowser.mod

import typings.azureMsalBrowser.configurationMod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-browser", "PublicClientApplication")
@js.native
open class PublicClientApplication protected ()
  extends typings.azureMsalBrowser.publicClientApplicationMod.PublicClientApplication {
  /**
    * @constructor
    * Constructor for the PublicClientApplication used to instantiate the PublicClientApplication object
    *
    * Important attributes in the Configuration object for auth are:
    * - clientID: the application ID of your application. You can obtain one by registering your application with our Application registration portal : https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/RegisteredAppsPreview
    * - authority: the authority URL for your application.
    * - redirect_uri: the uri of your application registered in the portal.
    *
    * In Azure AD, authority is a URL indicating the Azure active directory that MSAL uses to obtain tokens.
    * It is of the form https://login.microsoftonline.com/{Enter_the_Tenant_Info_Here}
    * If your application supports Accounts in one organizational directory, replace "Enter_the_Tenant_Info_Here" value with the Tenant Id or Tenant name (for example, contoso.microsoft.com).
    * If your application supports Accounts in any organizational directory, replace "Enter_the_Tenant_Info_Here" value with organizations.
    * If your application supports Accounts in any organizational directory and personal Microsoft accounts, replace "Enter_the_Tenant_Info_Here" value with common.
    * To restrict support to Personal Microsoft accounts only, replace "Enter_the_Tenant_Info_Here" value with consumers.
    *
    * In Azure B2C, authority is of the form https://{instance}/tfp/{tenant}/{policyName}/
    * Full B2C functionality will be available in this library in future versions.
    *
    * @param configuration object for the MSAL PublicClientApplication instance
    */
  def this(configuration: Configuration) = this()
}
