package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesCommandsListRetirableGrantsCommandMod.ListRetirableGrantsCommandInput
import typings.awsSdkClientKms.distTypesCommandsListRetirableGrantsCommandMod.ListRetirableGrantsCommandOutput
import typings.awsSdkClientKms.distTypesPaginationInterfacesMod.KMSPaginationConfiguration
import typings.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationListRetirableGrantsPaginatorMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/pagination/ListRetirableGrantsPaginator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateListRetirableGrants(
    config: KMSPaginationConfiguration,
    input: ListRetirableGrantsCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListRetirableGrantsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListRetirableGrants")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListRetirableGrantsCommandOutput]]
}
