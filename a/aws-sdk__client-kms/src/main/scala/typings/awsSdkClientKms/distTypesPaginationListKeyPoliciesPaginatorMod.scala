package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesCommandsListKeyPoliciesCommandMod.ListKeyPoliciesCommandInput
import typings.awsSdkClientKms.distTypesCommandsListKeyPoliciesCommandMod.ListKeyPoliciesCommandOutput
import typings.awsSdkClientKms.distTypesPaginationInterfacesMod.KMSPaginationConfiguration
import typings.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationListKeyPoliciesPaginatorMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/pagination/ListKeyPoliciesPaginator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateListKeyPolicies(
    config: KMSPaginationConfiguration,
    input: ListKeyPoliciesCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListKeyPoliciesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListKeyPolicies")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListKeyPoliciesCommandOutput]]
}
