package typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolOutputMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesCognitoIdentityProviderMod.UnmarshalledCognitoIdentityProvider
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeIdentityPoolOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>TRUE if the identity pool supports unauthenticated logins.</p>
    */
  var AllowUnauthenticatedIdentities: Boolean = js.native
  
  /**
    * <p>A list representing an Amazon Cognito Identity User Pool and its client ID.</p>
    */
  var CognitoIdentityProviders: js.UndefOr[js.Array[UnmarshalledCognitoIdentityProvider]] = js.native
  
  /**
    * <p>The "domain" by which Cognito will refer to your users.</p>
    */
  var DeveloperProviderName: js.UndefOr[String] = js.native
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: String = js.native
  
  /**
    * <p>A string that you provide.</p>
    */
  var IdentityPoolName: String = js.native
  
  /**
    * <p>A list of OpendID Connect provider ARNs.</p>
    */
  var OpenIdConnectProviderARNs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * <p>An array of Amazon Resource Names (ARNs) of the SAML provider for your identity pool.</p>
    */
  var SamlProviderARNs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * <p>Optional key:value pairs mapping provider names to provider app IDs.</p>
    */
  var SupportedLoginProviders: js.UndefOr[StringDictionary[String]] = js.native
}
object DescribeIdentityPoolOutput {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    AllowUnauthenticatedIdentities: Boolean,
    IdentityPoolId: String,
    IdentityPoolName: String
  ): DescribeIdentityPoolOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], IdentityPoolName = IdentityPoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIdentityPoolOutput]
  }
  
  @scala.inline
  implicit class DescribeIdentityPoolOutputOps[Self <: DescribeIdentityPoolOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnauthenticatedIdentities(value: Boolean): Self = this.set("AllowUnauthenticatedIdentities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolId(value: String): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolName(value: String): Self = this.set("IdentityPoolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoIdentityProvidersVarargs(value: UnmarshalledCognitoIdentityProvider*): Self = this.set("CognitoIdentityProviders", js.Array(value :_*))
    
    @scala.inline
    def setCognitoIdentityProviders(value: js.Array[UnmarshalledCognitoIdentityProvider]): Self = this.set("CognitoIdentityProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCognitoIdentityProviders: Self = this.set("CognitoIdentityProviders", js.undefined)
    
    @scala.inline
    def setDeveloperProviderName(value: String): Self = this.set("DeveloperProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeveloperProviderName: Self = this.set("DeveloperProviderName", js.undefined)
    
    @scala.inline
    def setOpenIdConnectProviderARNsVarargs(value: String*): Self = this.set("OpenIdConnectProviderARNs", js.Array(value :_*))
    
    @scala.inline
    def setOpenIdConnectProviderARNs(value: js.Array[String]): Self = this.set("OpenIdConnectProviderARNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenIdConnectProviderARNs: Self = this.set("OpenIdConnectProviderARNs", js.undefined)
    
    @scala.inline
    def setSamlProviderARNsVarargs(value: String*): Self = this.set("SamlProviderARNs", js.Array(value :_*))
    
    @scala.inline
    def setSamlProviderARNs(value: js.Array[String]): Self = this.set("SamlProviderARNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamlProviderARNs: Self = this.set("SamlProviderARNs", js.undefined)
    
    @scala.inline
    def setSupportedLoginProviders(value: StringDictionary[String]): Self = this.set("SupportedLoginProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedLoginProviders: Self = this.set("SupportedLoginProviders", js.undefined)
  }
}
