package typings.awsSdkClientSts

import typings.awsSdkClientSts.assumeRoleCommandMod.AssumeRoleCommandInput
import typings.awsSdkClientSts.assumeRoleWithSAMLCommandMod.AssumeRoleWithSAMLCommandInput
import typings.awsSdkClientSts.assumeRoleWithWebIdentityCommandMod.AssumeRoleWithWebIdentityCommandInput
import typings.awsSdkClientSts.decodeAuthorizationMessageCommandMod.DecodeAuthorizationMessageCommandInput
import typings.awsSdkClientSts.getAccessKeyInfoCommandMod.GetAccessKeyInfoCommandInput
import typings.awsSdkClientSts.getCallerIdentityCommandMod.GetCallerIdentityCommandInput
import typings.awsSdkClientSts.getFederationTokenCommandMod.GetFederationTokenCommandInput
import typings.awsSdkClientSts.getSessionTokenCommandMod.GetSessionTokenCommandInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands", "AssumeRoleCommand")
  @js.native
  open class AssumeRoleCommand protected ()
    extends typings.awsSdkClientSts.assumeRoleCommandMod.AssumeRoleCommand {
    def this(input: AssumeRoleCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands", "AssumeRoleWithSAMLCommand")
  @js.native
  open class AssumeRoleWithSAMLCommand protected ()
    extends typings.awsSdkClientSts.assumeRoleWithSAMLCommandMod.AssumeRoleWithSAMLCommand {
    def this(input: AssumeRoleWithSAMLCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands", "AssumeRoleWithWebIdentityCommand")
  @js.native
  open class AssumeRoleWithWebIdentityCommand protected ()
    extends typings.awsSdkClientSts.assumeRoleWithWebIdentityCommandMod.AssumeRoleWithWebIdentityCommand {
    def this(input: AssumeRoleWithWebIdentityCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands", "DecodeAuthorizationMessageCommand")
  @js.native
  open class DecodeAuthorizationMessageCommand protected ()
    extends typings.awsSdkClientSts.decodeAuthorizationMessageCommandMod.DecodeAuthorizationMessageCommand {
    def this(input: DecodeAuthorizationMessageCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands", "GetAccessKeyInfoCommand")
  @js.native
  open class GetAccessKeyInfoCommand protected ()
    extends typings.awsSdkClientSts.getAccessKeyInfoCommandMod.GetAccessKeyInfoCommand {
    def this(input: GetAccessKeyInfoCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands", "GetCallerIdentityCommand")
  @js.native
  open class GetCallerIdentityCommand protected ()
    extends typings.awsSdkClientSts.getCallerIdentityCommandMod.GetCallerIdentityCommand {
    def this(input: GetCallerIdentityCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands", "GetFederationTokenCommand")
  @js.native
  open class GetFederationTokenCommand protected ()
    extends typings.awsSdkClientSts.getFederationTokenCommandMod.GetFederationTokenCommand {
    def this(input: GetFederationTokenCommandInput) = this()
  }
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands", "GetSessionTokenCommand")
  @js.native
  open class GetSessionTokenCommand protected ()
    extends typings.awsSdkClientSts.getSessionTokenCommandMod.GetSessionTokenCommand {
    def this(input: GetSessionTokenCommandInput) = this()
  }
}
