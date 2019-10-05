package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityConfigurationMod.CognitoIdentityConfiguration
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvableConfiguration
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesCreateIdentityPoolInputMod.CreateIdentityPoolInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesDeleteIdentitiesInputMod.DeleteIdentitiesInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesDeleteIdentityPoolInputMod.DeleteIdentityPoolInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesDescribeIdentityInputMod.DescribeIdentityInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesDescribeIdentityPoolInputMod.DescribeIdentityPoolInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetCredentialsForIdentityInputMod.GetCredentialsForIdentityInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetIdInputMod.GetIdInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetIdentityPoolRolesInputMod.GetIdentityPoolRolesInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetOpenIdTokenForDeveloperIdentityInputMod.GetOpenIdTokenForDeveloperIdentityInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetOpenIdTokenInputMod.GetOpenIdTokenInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesListIdentitiesInputMod.ListIdentitiesInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesListIdentityPoolsInputMod.ListIdentityPoolsInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesLookupDeveloperIdentityInputMod.LookupDeveloperIdentityInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesMergeDeveloperIdentitiesInputMod.MergeDeveloperIdentitiesInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesSetIdentityPoolRolesInputMod.SetIdentityPoolRolesInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnlinkDeveloperIdentityInputMod.UnlinkDeveloperIdentityInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnlinkIdentityInputMod.UnlinkIdentityInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUpdateIdentityPoolInputMod.UpdateIdentityPoolInput
import typings.atAwsDashSdkTypes.buildClientMod.ConfigurationDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser", JSImport.Namespace)
@js.native
object atAwsDashSdkClientDashCognitoDashIdentityDashBrowserMod extends js.Object {
  @js.native
  class CognitoIdentity ()
    extends typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityMod.CognitoIdentity
  
  @js.native
  class CognitoIdentityClient protected ()
    extends typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityClientMod.CognitoIdentityClient {
    def this(configuration: CognitoIdentityConfiguration) = this()
  }
  
  @js.native
  class CreateIdentityPoolCommand protected ()
    extends typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsCreateIdentityPoolCommandMod.CreateIdentityPoolCommand {
    def this(input: CreateIdentityPoolInput) = this()
  }
  
  @js.native
  class DeleteIdentitiesCommand protected ()
    extends typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsDeleteIdentitiesCommandMod.DeleteIdentitiesCommand {
    def this(input: DeleteIdentitiesInput) = this()
  }
  
  @js.native
  class DeleteIdentityPoolCommand protected ()
    extends typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsDeleteIdentityPoolCommandMod.DeleteIdentityPoolCommand {
    def this(input: DeleteIdentityPoolInput) = this()
  }
  
  @js.native
  class DescribeIdentityCommand protected ()
    extends typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsDescribeIdentityCommandMod.DescribeIdentityCommand {
    def this(input: DescribeIdentityInput) = this()
  }
  
  @js.native
  class DescribeIdentityPoolCommand protected ()
    extends typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsDescribeIdentityPoolCommandMod.DescribeIdentityPoolCommand {
    def this(input: DescribeIdentityPoolInput) = this()
  }
  
  @js.native
  class GetCredentialsForIdentityCommand protected ()
    extends typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsGetCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommand {
    def this(input: GetCredentialsForIdentityInput) = this()
  }
  
  @js.native
  class GetIdCommand protected ()
    extends typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsGetIdCommandMod.GetIdCommand {
    def this(input: GetIdInput) = this()
  }
  
  @js.native
  class GetIdentityPoolRolesCommand protected ()
    extends typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsGetIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommand {
    def this(input: GetIdentityPoolRolesInput) = this()
  }
  
  @js.native
  class GetOpenIdTokenCommand protected ()
    extends typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsGetOpenIdTokenCommandMod.GetOpenIdTokenCommand {
    def this(input: GetOpenIdTokenInput) = this()
  }
  
  @js.native
  class GetOpenIdTokenForDeveloperIdentityCommand protected ()
    extends typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsGetOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommand {
    def this(input: GetOpenIdTokenForDeveloperIdentityInput) = this()
  }
  
  @js.native
  class ListIdentitiesCommand protected ()
    extends typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsListIdentitiesCommandMod.ListIdentitiesCommand {
    def this(input: ListIdentitiesInput) = this()
  }
  
  @js.native
  class ListIdentityPoolsCommand protected ()
    extends typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsListIdentityPoolsCommandMod.ListIdentityPoolsCommand {
    def this(input: ListIdentityPoolsInput) = this()
  }
  
  @js.native
  class LookupDeveloperIdentityCommand protected ()
    extends typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsLookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommand {
    def this(input: LookupDeveloperIdentityInput) = this()
  }
  
  @js.native
  class MergeDeveloperIdentitiesCommand protected ()
    extends typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsMergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommand {
    def this(input: MergeDeveloperIdentitiesInput) = this()
  }
  
  @js.native
  class SetIdentityPoolRolesCommand protected ()
    extends typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsSetIdentityPoolRolesCommandMod.SetIdentityPoolRolesCommand {
    def this(input: SetIdentityPoolRolesInput) = this()
  }
  
  @js.native
  class UnlinkDeveloperIdentityCommand protected ()
    extends typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsUnlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommand {
    def this(input: UnlinkDeveloperIdentityInput) = this()
  }
  
  @js.native
  class UnlinkIdentityCommand protected ()
    extends typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsUnlinkIdentityCommandMod.UnlinkIdentityCommand {
    def this(input: UnlinkIdentityInput) = this()
  }
  
  @js.native
  class UpdateIdentityPoolCommand protected ()
    extends typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsUpdateIdentityPoolCommandMod.UpdateIdentityPoolCommand {
    def this(input: UpdateIdentityPoolInput) = this()
  }
  
  val configurationProperties: ConfigurationDefinition[CognitoIdentityResolvableConfiguration, CognitoIdentityResolvedConfiguration] = js.native
}

