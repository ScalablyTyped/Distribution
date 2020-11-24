package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolInputMod.CreateIdentityPoolInput
import typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesInputMod.DeleteIdentitiesInput
import typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolInputMod.DeleteIdentityPoolInput
import typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityInputMod.DescribeIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolInputMod.DescribeIdentityPoolInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityInputMod.GetCredentialsForIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetIdInputMod.GetIdInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesInputMod.GetIdentityPoolRolesInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityInputMod.GetOpenIdTokenForDeveloperIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenInputMod.GetOpenIdTokenInput
import typings.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesInputMod.ListIdentitiesInput
import typings.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsInputMod.ListIdentityPoolsInput
import typings.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityInputMod.LookupDeveloperIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesInputMod.MergeDeveloperIdentitiesInput
import typings.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesInputMod.SetIdentityPoolRolesInput
import typings.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityInputMod.UnlinkDeveloperIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityInputMod.UnlinkIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolInputMod.UpdateIdentityPoolInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity-browser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val configurationProperties: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ConfigurationDefinition<CognitoIdentityResolvableConfiguration, CognitoIdentityResolvedConfiguration> */ js.Any = js.native
  
  @js.native
  class CognitoIdentity ()
    extends typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityMod.CognitoIdentity
  
  @js.native
  class CognitoIdentityClient protected ()
    extends typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityClientMod.CognitoIdentityClient {
    def this(configuration: CognitoIdentityConfiguration) = this()
  }
  
  @js.native
  class CreateIdentityPoolCommand protected ()
    extends typings.awsSdkClientCognitoIdentityBrowser.createIdentityPoolCommandMod.CreateIdentityPoolCommand {
    def this(input: CreateIdentityPoolInput) = this()
  }
  
  @js.native
  class DeleteIdentitiesCommand protected ()
    extends typings.awsSdkClientCognitoIdentityBrowser.deleteIdentitiesCommandMod.DeleteIdentitiesCommand {
    def this(input: DeleteIdentitiesInput) = this()
  }
  
  @js.native
  class DeleteIdentityPoolCommand protected ()
    extends typings.awsSdkClientCognitoIdentityBrowser.deleteIdentityPoolCommandMod.DeleteIdentityPoolCommand {
    def this(input: DeleteIdentityPoolInput) = this()
  }
  
  @js.native
  class DescribeIdentityCommand protected ()
    extends typings.awsSdkClientCognitoIdentityBrowser.describeIdentityCommandMod.DescribeIdentityCommand {
    def this(input: DescribeIdentityInput) = this()
  }
  
  @js.native
  class DescribeIdentityPoolCommand protected ()
    extends typings.awsSdkClientCognitoIdentityBrowser.describeIdentityPoolCommandMod.DescribeIdentityPoolCommand {
    def this(input: DescribeIdentityPoolInput) = this()
  }
  
  @js.native
  class GetCredentialsForIdentityCommand protected ()
    extends typings.awsSdkClientCognitoIdentityBrowser.getCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommand {
    def this(input: GetCredentialsForIdentityInput) = this()
  }
  
  @js.native
  class GetIdCommand protected ()
    extends typings.awsSdkClientCognitoIdentityBrowser.getIdCommandMod.GetIdCommand {
    def this(input: GetIdInput) = this()
  }
  
  @js.native
  class GetIdentityPoolRolesCommand protected ()
    extends typings.awsSdkClientCognitoIdentityBrowser.getIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommand {
    def this(input: GetIdentityPoolRolesInput) = this()
  }
  
  @js.native
  class GetOpenIdTokenCommand protected ()
    extends typings.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenCommandMod.GetOpenIdTokenCommand {
    def this(input: GetOpenIdTokenInput) = this()
  }
  
  @js.native
  class GetOpenIdTokenForDeveloperIdentityCommand protected ()
    extends typings.awsSdkClientCognitoIdentityBrowser.getOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommand {
    def this(input: GetOpenIdTokenForDeveloperIdentityInput) = this()
  }
  
  @js.native
  class ListIdentitiesCommand protected ()
    extends typings.awsSdkClientCognitoIdentityBrowser.listIdentitiesCommandMod.ListIdentitiesCommand {
    def this(input: ListIdentitiesInput) = this()
  }
  
  @js.native
  class ListIdentityPoolsCommand protected ()
    extends typings.awsSdkClientCognitoIdentityBrowser.listIdentityPoolsCommandMod.ListIdentityPoolsCommand {
    def this(input: ListIdentityPoolsInput) = this()
  }
  
  @js.native
  class LookupDeveloperIdentityCommand protected ()
    extends typings.awsSdkClientCognitoIdentityBrowser.lookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommand {
    def this(input: LookupDeveloperIdentityInput) = this()
  }
  
  @js.native
  class MergeDeveloperIdentitiesCommand protected ()
    extends typings.awsSdkClientCognitoIdentityBrowser.mergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommand {
    def this(input: MergeDeveloperIdentitiesInput) = this()
  }
  
  @js.native
  class SetIdentityPoolRolesCommand protected ()
    extends typings.awsSdkClientCognitoIdentityBrowser.setIdentityPoolRolesCommandMod.SetIdentityPoolRolesCommand {
    def this(input: SetIdentityPoolRolesInput) = this()
  }
  
  @js.native
  class UnlinkDeveloperIdentityCommand protected ()
    extends typings.awsSdkClientCognitoIdentityBrowser.unlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommand {
    def this(input: UnlinkDeveloperIdentityInput) = this()
  }
  
  @js.native
  class UnlinkIdentityCommand protected ()
    extends typings.awsSdkClientCognitoIdentityBrowser.unlinkIdentityCommandMod.UnlinkIdentityCommand {
    def this(input: UnlinkIdentityInput) = this()
  }
  
  @js.native
  class UpdateIdentityPoolCommand protected ()
    extends typings.awsSdkClientCognitoIdentityBrowser.updateIdentityPoolCommandMod.UpdateIdentityPoolCommand {
    def this(input: UpdateIdentityPoolInput) = this()
  }
}
