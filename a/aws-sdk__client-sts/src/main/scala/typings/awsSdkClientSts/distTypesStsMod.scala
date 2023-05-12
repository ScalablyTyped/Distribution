package typings.awsSdkClientSts

import typings.awsSdkClientSts.distTypesCommandsAssumeRoleCommandMod.AssumeRoleCommandInput
import typings.awsSdkClientSts.distTypesCommandsAssumeRoleCommandMod.AssumeRoleCommandOutput
import typings.awsSdkClientSts.distTypesCommandsAssumeRoleWithSAMLCommandMod.AssumeRoleWithSAMLCommandInput
import typings.awsSdkClientSts.distTypesCommandsAssumeRoleWithSAMLCommandMod.AssumeRoleWithSAMLCommandOutput
import typings.awsSdkClientSts.distTypesCommandsAssumeRoleWithWebIdentityCommandMod.AssumeRoleWithWebIdentityCommandInput
import typings.awsSdkClientSts.distTypesCommandsAssumeRoleWithWebIdentityCommandMod.AssumeRoleWithWebIdentityCommandOutput
import typings.awsSdkClientSts.distTypesCommandsDecodeAuthorizationMessageCommandMod.DecodeAuthorizationMessageCommandInput
import typings.awsSdkClientSts.distTypesCommandsDecodeAuthorizationMessageCommandMod.DecodeAuthorizationMessageCommandOutput
import typings.awsSdkClientSts.distTypesCommandsGetAccessKeyInfoCommandMod.GetAccessKeyInfoCommandInput
import typings.awsSdkClientSts.distTypesCommandsGetAccessKeyInfoCommandMod.GetAccessKeyInfoCommandOutput
import typings.awsSdkClientSts.distTypesCommandsGetCallerIdentityCommandMod.GetCallerIdentityCommandInput
import typings.awsSdkClientSts.distTypesCommandsGetCallerIdentityCommandMod.GetCallerIdentityCommandOutput
import typings.awsSdkClientSts.distTypesCommandsGetFederationTokenCommandMod.GetFederationTokenCommandInput
import typings.awsSdkClientSts.distTypesCommandsGetFederationTokenCommandMod.GetFederationTokenCommandOutput
import typings.awsSdkClientSts.distTypesCommandsGetSessionTokenCommandMod.GetSessionTokenCommandInput
import typings.awsSdkClientSts.distTypesCommandsGetSessionTokenCommandMod.GetSessionTokenCommandOutput
import typings.awsSdkClientSts.distTypesStsclientMod.STSClient
import typings.awsSdkClientSts.distTypesStsclientMod.STSClientConfig
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStsMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/STS", "STS")
  @js.native
  open class STS protected () extends STSClient {
    def this(configuration: STSClientConfig) = this()
    
    /**
      * @see {@link AssumeRoleCommand}
      */
    def assumeRole(args: AssumeRoleCommandInput): js.Promise[AssumeRoleCommandOutput] = js.native
    def assumeRole(
      args: AssumeRoleCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[AssumeRoleCommandOutput], Unit]
    ): Unit = js.native
    def assumeRole(args: AssumeRoleCommandInput, options: HttpHandlerOptions): js.Promise[AssumeRoleCommandOutput] = js.native
    def assumeRole(
      args: AssumeRoleCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[AssumeRoleCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link AssumeRoleWithSAMLCommand}
      */
    def assumeRoleWithSAML(args: AssumeRoleWithSAMLCommandInput): js.Promise[AssumeRoleWithSAMLCommandOutput] = js.native
    def assumeRoleWithSAML(
      args: AssumeRoleWithSAMLCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[AssumeRoleWithSAMLCommandOutput], Unit]
    ): Unit = js.native
    def assumeRoleWithSAML(args: AssumeRoleWithSAMLCommandInput, options: HttpHandlerOptions): js.Promise[AssumeRoleWithSAMLCommandOutput] = js.native
    def assumeRoleWithSAML(
      args: AssumeRoleWithSAMLCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[AssumeRoleWithSAMLCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link AssumeRoleWithWebIdentityCommand}
      */
    def assumeRoleWithWebIdentity(args: AssumeRoleWithWebIdentityCommandInput): js.Promise[AssumeRoleWithWebIdentityCommandOutput] = js.native
    def assumeRoleWithWebIdentity(
      args: AssumeRoleWithWebIdentityCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[AssumeRoleWithWebIdentityCommandOutput], Unit]
    ): Unit = js.native
    def assumeRoleWithWebIdentity(args: AssumeRoleWithWebIdentityCommandInput, options: HttpHandlerOptions): js.Promise[AssumeRoleWithWebIdentityCommandOutput] = js.native
    def assumeRoleWithWebIdentity(
      args: AssumeRoleWithWebIdentityCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[AssumeRoleWithWebIdentityCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link DecodeAuthorizationMessageCommand}
      */
    def decodeAuthorizationMessage(args: DecodeAuthorizationMessageCommandInput): js.Promise[DecodeAuthorizationMessageCommandOutput] = js.native
    def decodeAuthorizationMessage(
      args: DecodeAuthorizationMessageCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[DecodeAuthorizationMessageCommandOutput], Unit]
    ): Unit = js.native
    def decodeAuthorizationMessage(args: DecodeAuthorizationMessageCommandInput, options: HttpHandlerOptions): js.Promise[DecodeAuthorizationMessageCommandOutput] = js.native
    def decodeAuthorizationMessage(
      args: DecodeAuthorizationMessageCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[DecodeAuthorizationMessageCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link GetAccessKeyInfoCommand}
      */
    def getAccessKeyInfo(args: GetAccessKeyInfoCommandInput): js.Promise[GetAccessKeyInfoCommandOutput] = js.native
    def getAccessKeyInfo(
      args: GetAccessKeyInfoCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[GetAccessKeyInfoCommandOutput], Unit]
    ): Unit = js.native
    def getAccessKeyInfo(args: GetAccessKeyInfoCommandInput, options: HttpHandlerOptions): js.Promise[GetAccessKeyInfoCommandOutput] = js.native
    def getAccessKeyInfo(
      args: GetAccessKeyInfoCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[GetAccessKeyInfoCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link GetCallerIdentityCommand}
      */
    def getCallerIdentity(args: GetCallerIdentityCommandInput): js.Promise[GetCallerIdentityCommandOutput] = js.native
    def getCallerIdentity(
      args: GetCallerIdentityCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[GetCallerIdentityCommandOutput], Unit]
    ): Unit = js.native
    def getCallerIdentity(args: GetCallerIdentityCommandInput, options: HttpHandlerOptions): js.Promise[GetCallerIdentityCommandOutput] = js.native
    def getCallerIdentity(
      args: GetCallerIdentityCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[GetCallerIdentityCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link GetFederationTokenCommand}
      */
    def getFederationToken(args: GetFederationTokenCommandInput): js.Promise[GetFederationTokenCommandOutput] = js.native
    def getFederationToken(
      args: GetFederationTokenCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[GetFederationTokenCommandOutput], Unit]
    ): Unit = js.native
    def getFederationToken(args: GetFederationTokenCommandInput, options: HttpHandlerOptions): js.Promise[GetFederationTokenCommandOutput] = js.native
    def getFederationToken(
      args: GetFederationTokenCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[GetFederationTokenCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link GetSessionTokenCommand}
      */
    def getSessionToken(args: GetSessionTokenCommandInput): js.Promise[GetSessionTokenCommandOutput] = js.native
    def getSessionToken(
      args: GetSessionTokenCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[GetSessionTokenCommandOutput], Unit]
    ): Unit = js.native
    def getSessionToken(args: GetSessionTokenCommandInput, options: HttpHandlerOptions): js.Promise[GetSessionTokenCommandOutput] = js.native
    def getSessionToken(
      args: GetSessionTokenCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[GetSessionTokenCommandOutput], Unit]
    ): Unit = js.native
  }
}
