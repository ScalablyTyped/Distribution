package typings.awsSdkClientSso

import typings.awsSdkClientSso.interfacesMod.SSOPaginationConfiguration
import typings.awsSdkClientSso.listAccountRolesCommandMod.ListAccountRolesCommandInput
import typings.awsSdkClientSso.listAccountRolesCommandMod.ListAccountRolesCommandOutput
import typings.awsSdkTypes.paginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listAccountRolesPaginatorMod {
  
  @JSImport("@aws-sdk/client-sso/dist-types/pagination/ListAccountRolesPaginator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateListAccountRoles(
    config: SSOPaginationConfiguration,
    input: ListAccountRolesCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListAccountRolesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListAccountRoles")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListAccountRolesCommandOutput]]
}
