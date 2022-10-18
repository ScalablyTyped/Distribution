package typings.awsSdkClientSts

import org.scalablytyped.runtime.Instantiable1
import typings.awsSdkClientSts.anon.PickSTSClientConfiglogger
import typings.awsSdkClientSts.distTypesCommandsAssumeRoleCommandMod.AssumeRoleCommandInput
import typings.awsSdkClientSts.distTypesCommandsAssumeRoleWithWebIdentityCommandMod.AssumeRoleWithWebIdentityCommandInput
import typings.awsSdkClientSts.distTypesStsclientMod.STSClient
import typings.awsSdkClientSts.distTypesStsclientMod.STSClientConfig
import typings.awsSdkTypes.distTypesCredentialsMod.Credentials
import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDefaultStsRoleAssumersMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/defaultStsRoleAssumers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decorateDefaultCredentialProvider(provider: DefaultCredentialProvider): DefaultCredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("decorateDefaultCredentialProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[DefaultCredentialProvider]
  
  inline def getDefaultRoleAssumer(
    stsOptions: PickSTSClientConfiglogger,
    stsClientCtor: Instantiable1[/* options */ STSClientConfig, STSClient]
  ): RoleAssumer = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumer")(stsOptions.asInstanceOf[js.Any], stsClientCtor.asInstanceOf[js.Any])).asInstanceOf[RoleAssumer]
  
  inline def getDefaultRoleAssumerWithWebIdentity(
    stsOptions: PickSTSClientConfiglogger,
    stsClientCtor: Instantiable1[/* options */ STSClientConfig, STSClient]
  ): RoleAssumerWithWebIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumerWithWebIdentity")(stsOptions.asInstanceOf[js.Any], stsClientCtor.asInstanceOf[js.Any])).asInstanceOf[RoleAssumerWithWebIdentity]
  
  type DefaultCredentialProvider = js.Function1[/* input */ Any, Provider[Credentials]]
  
  type RoleAssumer = js.Function2[
    /* sourceCreds */ Credentials, 
    /* params */ AssumeRoleCommandInput, 
    js.Promise[Credentials]
  ]
  
  type RoleAssumerWithWebIdentity = js.Function1[/* params */ AssumeRoleWithWebIdentityCommandInput, js.Promise[Credentials]]
}
