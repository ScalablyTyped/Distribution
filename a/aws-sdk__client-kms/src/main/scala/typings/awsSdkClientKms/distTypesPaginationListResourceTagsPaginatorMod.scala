package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesCommandsListResourceTagsCommandMod.ListResourceTagsCommandInput
import typings.awsSdkClientKms.distTypesCommandsListResourceTagsCommandMod.ListResourceTagsCommandOutput
import typings.awsSdkClientKms.distTypesPaginationInterfacesMod.KMSPaginationConfiguration
import typings.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationListResourceTagsPaginatorMod {
  
  @JSImport("@aws-sdk/client-kms/dist-types/pagination/ListResourceTagsPaginator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateListResourceTags(
    config: KMSPaginationConfiguration,
    input: ListResourceTagsCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListResourceTagsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListResourceTags")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListResourceTagsCommandOutput]]
}
