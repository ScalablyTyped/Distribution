package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesCommandsDescribeCustomKeyStoresCommandMod.DescribeCustomKeyStoresCommandInput
import typings.awsSdkClientKms.distTypesCommandsDescribeCustomKeyStoresCommandMod.DescribeCustomKeyStoresCommandOutput
import typings.awsSdkClientKms.distTypesPaginationInterfacesMod.KMSPaginationConfiguration
import typings.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationDescribeCustomKeyStoresPaginatorMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/pagination/DescribeCustomKeyStoresPaginator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateDescribeCustomKeyStores(
    config: KMSPaginationConfiguration,
    input: DescribeCustomKeyStoresCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[DescribeCustomKeyStoresCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateDescribeCustomKeyStores")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[DescribeCustomKeyStoresCommandOutput]]
}
