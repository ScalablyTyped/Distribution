package typings.awsSdkClientSqs

import typings.awsSdkClientSqs.distTypesCommandsListQueuesCommandMod.ListQueuesCommandInput
import typings.awsSdkClientSqs.distTypesCommandsListQueuesCommandMod.ListQueuesCommandOutput
import typings.awsSdkClientSqs.distTypesPaginationInterfacesMod.SQSPaginationConfiguration
import typings.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationListQueuesPaginatorMod {
  
  @JSImport("@aws-sdk/client-sqs/dist-types/pagination/ListQueuesPaginator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateListQueues(
    config: SQSPaginationConfiguration,
    input: ListQueuesCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListQueuesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListQueues")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListQueuesCommandOutput]]
}
