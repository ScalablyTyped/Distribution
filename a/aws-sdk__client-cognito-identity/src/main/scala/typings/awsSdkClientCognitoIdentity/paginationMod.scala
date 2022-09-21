package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.interfacesMod.CognitoIdentityPaginationConfiguration
import typings.awsSdkClientCognitoIdentity.listIdentityPoolsCommandMod.ListIdentityPoolsCommandInput
import typings.awsSdkClientCognitoIdentity.listIdentityPoolsCommandMod.ListIdentityPoolsCommandOutput
import typings.awsSdkTypes.paginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/pagination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateListIdentityPools(
    config: CognitoIdentityPaginationConfiguration,
    input: ListIdentityPoolsCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListIdentityPoolsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListIdentityPools")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListIdentityPoolsCommandOutput]]
}
